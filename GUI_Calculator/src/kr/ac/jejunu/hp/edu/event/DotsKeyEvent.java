package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

public class DotsKeyEvent {

	public void execute(JTextField jtf, String btnName) {
		String memory = jtf.getText();

		if (btnName.equals("."))
			if (hasAlreadyDots(memory))
				jtf.setText(getVal(memory, btnName));
	}

	private String getVal(String memory, String btnName) {

		if (hasOperand(memory))
			return memory + btnName;
		else
			return "0" + btnName;
	}

	private Boolean hasAlreadyDots(String memory) {
		return !memory.contains(".");
	}

	private Boolean hasOperand(String memory) {
		return !memory.equals("");
	}

}
