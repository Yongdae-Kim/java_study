package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

public class NumericKeyEvent {

	public void execute(JTextField jtf, String btnName) {

		if (isNumericKeys(btnName))
			jtf.setText(jtf.getText() + btnName);
		// if has dots, add to string
	}

	private Boolean isNumericKeys(String btnName) {
		return btnName.equals("1") || btnName.equals("2")
				|| btnName.equals("3") || btnName.equals("4")
				|| btnName.equals("5") || btnName.equals("6")
				|| btnName.equals("7") || btnName.equals("8")
				|| btnName.equals("9") || btnName.equals("0");
	}
}
