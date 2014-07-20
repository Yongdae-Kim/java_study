package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

public class BackspaceKeyEvent {
	public void execute(JTextField jtf, String btnName) {
		if (btnName.equals("←")) {

			String tmp = jtf.getText();

			if (tmp.length() != 0) {
				tmp = tmp.substring(0, tmp.length() - 1);
				jtf.setText(tmp);
			}
		}
	}
}
