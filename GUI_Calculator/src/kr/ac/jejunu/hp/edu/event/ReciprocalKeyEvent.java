package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.calc.ReciprocalGen;

public class ReciprocalKeyEvent {
	
	private ReciprocalGen gen = new ReciprocalGen();

	public void execute(JTextField jtf, String btnName) {

		double val;

		if (btnName == "±") {
			if (hasOperand(jtf.getText())) {
				val = Double.parseDouble(jtf.getText());
				jtf.setText(gen.getReciprocal(val).toString());
			}
		}
	}

	private Boolean hasOperand(String memory) {
		return !memory.equals("");
	}
}
