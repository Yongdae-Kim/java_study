package kr.ac.jejunu.hp.edu.event;

import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.calc.RootGen;

public class RootKeyEvent {
	public void execute(JTextField jtf, String btnName) {
		if (btnName == "√")
			jtf.setText(""
					+ new RootGen().getRadicalRoot(Double.parseDouble(jtf
							.getText())));
	}
}
