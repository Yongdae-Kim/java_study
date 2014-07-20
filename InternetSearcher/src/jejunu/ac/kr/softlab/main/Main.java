package jejunu.ac.kr.softlab.main;

import javax.swing.JFrame;

import jejunu.ac.kr.softlab.logic.UI;

public class Main {

	public static void main(String[] args) {

		UI ui = new UI();
		ui.showForm();
		ui.setSize(525, 87);
		ui.setResizable(false);
		ui.setVisible(true);
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
