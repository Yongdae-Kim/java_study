package kr.ac.jejunu.hp.edu.form;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.eventgen.CalcEventGen;
import kr.ac.jejunu.hp.edu.util.UITools;

public class CalcForm extends JFrame implements ActionListener {

	private UITools tools = new UITools(this);
	private CalcEventGen eventGen = new CalcEventGen();

	private JTextField jtf;

	public CalcForm() {

		super("Calculator");

		showForm();
		setSize(320, 400);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void showForm() {
		setLayout(null);

		jtf = tools.makeJTextField("", 20, 20, 270, 50);
		jtf.setFont(new Font("SansSerif", Font.BOLD, 20));
		initBtn();
	}

	private void initBtn() {

		makeLine(new String[] { "←", "CE", "C", "±", "√" }, 80);
		makeLine(new String[] { "7", "8", "9", "/", "%" }, 135);
		makeLine(new String[] { "4", "5", "6", "*", "/x" }, 190);
		makeLine(new String[] { "1", "2", "3", "-" }, 245);

		makeExceptionsLine();
	}

	private void makeLine(String[] ops, int linePosition) {
		for (int i = 0; i < ops.length; i++)
			tools.makeJButton(ops[i], 20 + (55 * i), linePosition, 50, 50, this);
	}

	private void makeExceptionsLine() {
		tools.makeJButton("=", 240, 245, 50, 105, this);

		tools.makeJButton("0", 20, 300, 105, 50, this);
		tools.makeJButton(".", 130, 300, 50, 50, this);
		tools.makeJButton("+", 185, 300, 50, 50, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String btnName = e.getActionCommand();
		eventGen.generateEvents(jtf, btnName);
	}
}
