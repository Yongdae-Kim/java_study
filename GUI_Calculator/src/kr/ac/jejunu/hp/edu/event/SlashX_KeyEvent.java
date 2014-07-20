package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.calc.Divider;

public class SlashX_KeyEvent {
	public void execute(JTextField jtf, String btnName) {
		if (btnName == "/x")
			jtf.setText(""
					+ new Divider().getDiv(1, Double.parseDouble(jtf.getText())));
	}
}
