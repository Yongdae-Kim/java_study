package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.calc.ReciprocalGen;

public class ReciprocalKeyEvent {
	public void execute(JTextField jtf, String btnName) {
		if (btnName == "±")
			jtf.setText(""
					+ new ReciprocalGen().getReciprocal(Double
							.parseDouble(jtf.getText())));
	}
}
