package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

public class DotKeyEvent {
	public void execute(JTextField jtf, String btnName) {
		if (btnName.equals("."))
			if (!jtf.getText().contains("."))
				jtf.setText(jtf.getText() + btnName);
	}
}
