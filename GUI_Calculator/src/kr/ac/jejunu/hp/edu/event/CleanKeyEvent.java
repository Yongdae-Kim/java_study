package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

public class CleanKeyEvent {
	public void execute(JTextField jtf, String btnName) {
		if (btnName.equals("CE"))
			jtf.setText("");
	}
}
