package kr.ac.jejunu.softlab.bat.form;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;

import kr.ac.jejunu.softlab.bat.util.UITools;

public class CustomerDialog extends JFrame implements ActionListener {

	private final String myHtml = "energy-report.html";

	private UITools tools = new UITools(this);
	private JButton show;

	public CustomerDialog() {
		super("BatteryUsage");
		
		showForm();
		setSize(400, 150);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnControl();
	}

	private void showForm() {
		setLayout(null);

		String comment = "analyzing the system... plz wait a minute";
		tools.makeJLabel(comment, 25, 15, 350, 30);

		show = tools.makeJButton("show", 160, 70, 80, 30, this);
		show.setEnabled(false);
	}

	private void btnControl() {
		delay(66000);
		show.setEnabled(true);
	}

	private void delay(int millisecond) {
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			File htmlFile = new File(myHtml);
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}