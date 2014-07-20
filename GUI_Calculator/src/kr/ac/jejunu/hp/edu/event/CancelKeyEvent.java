package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

public class CancelKeyEvent {
	public void execute(JTextField jtf, String btnName) {
		if (btnName.equals("C"))
			jtf.setText("");
	}
}
