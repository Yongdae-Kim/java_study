package kr.ac.jejunu.softlab.cafeteria.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import kr.ac.jejunu.softlab.cafeteria.util.UITools;

public class ResultForm extends JFrame implements ActionListener {

	private UITools tools = new UITools(this);

	private JFrame preJFrame;
	private String[] generalMenus, specialMenus;

	public ResultForm(JFrame preJFrame, String[] generalMenus,
			String[] specialMenus) {

		super("Cafeteria Menu");

		this.preJFrame = preJFrame;
		this.generalMenus = generalMenus;
		this.specialMenus = specialMenus;

		preJFrame.setEnabled(false);

		showForm();
		setSize(620, 440);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void showForm() {
		setLayout(null);
		init();
	}

	private void init() {
		tools.makeJLabel("Breakfast Menu", 20, 20, 150, 20);
		tools.makeJLabel("Lunch Menu", 20, 120, 150, 20);
		tools.makeJLabel("Dinner Menu", 20, 220, 150, 20);
		setMenu();

		tools.makeJButton("Back", 20, 330, 570, 50, this);
	}

	private void setMenu() {
		for (int i = 0; i < 3; i++) {
			tools.makeJLabel(generalMenus[i], 40, (100 * i) + 60, 600, 20);
			tools.makeJLabel(specialMenus[i], 40, (100 * i) + 80, 600, 20);
		}
		// index 0 is Breakfast
		// index 1 is Lunch
		// index 2 is Dinner
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		preJFrame.setEnabled(true);
		dispose();
	}
}