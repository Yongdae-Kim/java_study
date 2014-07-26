package kr.ac.jejunu.hp.edu.event;

import java.util.List;

import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.calc.Adder;
import kr.ac.jejunu.hp.edu.calc.Divider;
import kr.ac.jejunu.hp.edu.calc.Multiplier;
import kr.ac.jejunu.hp.edu.calc.Subtractor;

public class BasicOperKeyEvent {

	private List<String> operand, operator;

	private JTextField jtf;
	private String btnName;

	public BasicOperKeyEvent(List<String> operand, List<String> operator) {
		this.operand = operand;
		this.operator = operator;
	}

	public void execute(JTextField jtf, String btnName) {

		this.jtf = jtf;
		this.btnName = btnName;

		whenFourFundamentalArithOperKeyPressed();
		whenEqualsKeyPressed();
		whenCancelKeyPressed();
	}

	private void whenFourFundamentalArithOperKeyPressed() {
		if (isFourFundamentalArithOper(btnName)) {
			operand.add(jtf.getText());
			operator.add(btnName);
			jtf.setText("");
		}
		// has not equals function
	}

	private Boolean isFourFundamentalArithOper(String btnName) {
		return btnName.equals("+") || btnName.equals("-")
				|| btnName.equals("*") || btnName.equals("/")
				|| btnName.equals("%");
	}

	private void whenEqualsKeyPressed() {
		if (btnName.equals("=")) {
			operand.add(jtf.getText());
			jtf.setText(getResult().toString());
			operand.clear();
			operator.clear();
		}
	}

	private Double getResult() {
		double result = 0;

		for (int i = 0; i < operand.size(); i++) {
			if (isEffectiveRange(i)) {
				if (isOperandExist(i)) {
					result = getOperationResult(i);
					operand.set(i + 1, result + "");
				}
			}
		}
		return result;
	}

	private Boolean isEffectiveRange(int index) {
		return index != operand.size() - 1;
	}

	private Boolean isOperandExist(int index) {
		return !operand.get(index).equals("")
				&& !operand.get(index + 1).equals("");
	}

	private double getOperationResult(int index) {
		double a = Double.parseDouble(operand.get(index));
		double b = Double.parseDouble(operand.get(index + 1));

		char op = operator.get(index).charAt(0);

		switch (op) {

		case '+':
			return new Adder().getSum(a, b);
		case '-':
			return new Subtractor().getSub(a, b);
		case '*':
			return new Multiplier().getMul(a, b);
		case '/':
			return new Divider().getDiv(a, b);
		case '%':
			return new Divider().getRest(a, b);
		default:
			return 0.0;
		}
	}

	private void whenCancelKeyPressed() {
		if (btnName.equals("C")) {
			jtf.setText("");
			operand.clear();
			operator.clear();
		}
	}
}
