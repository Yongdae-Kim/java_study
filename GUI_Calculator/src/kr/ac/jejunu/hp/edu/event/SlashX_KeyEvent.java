package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.calc.Divider;

public class SlashX_KeyEvent {

	private Divider divider = new Divider();

	public void execute(JTextField jtf, String btnName) {

		double val;

		if (btnName == "/x") {
			if (hasOperand(jtf.getText())) {
				val = Double.parseDouble(jtf.getText());
				jtf.setText(divider.getDiv(1, val).toString());
			}
		}
	}

	private Boolean hasOperand(String memory) {
		return !memory.equals("");
	}
}
