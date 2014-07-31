package kr.ac.jejunu.softlab.cafeteria.msg;

import javax.swing.JOptionPane;

public class Messenger {

	public int showDialog(String comment) {
		String[] optionBtns = new String[] { "Retry", "Cancel" };

		return JOptionPane.showOptionDialog(null, comment, "Error",
				JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null,
				optionBtns, optionBtns[0]);
	}
}
