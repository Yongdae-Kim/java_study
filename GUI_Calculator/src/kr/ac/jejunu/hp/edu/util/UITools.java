package kr.ac.jejunu.hp.edu.util;

import java.awt.Choice;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UITools {
	private JFrame jf;

	public UITools(JFrame jf) {
		this.jf = jf;
	}

	public JLabel makeJLabel(String name, int x, int y, int width, int height) {
		JLabel jl = new JLabel(name);
		jl.setBounds(x, y, width, height);

		jf.add(jl);

		return jl;
	}

	public JTextField makeJTextField(String name, int x, int y, int width,
			int height) {
		JTextField jtf = new JTextField(name);
		jtf.setDocument((new JTextFieldLimit(20)));
		jtf.setEditable(false);
		jtf.setBounds(x, y, width, height);
		jtf.setHorizontalAlignment(JTextField.CENTER);
		jf.add(jtf);

		return jtf;
	}

	public JButton makeJButton(String name, int x, int y, int width,
			int height, ActionListener listener) {
		JButton jb = new JButton(name);
		jb.setBounds(x, y, width, height);
		jb.addActionListener(listener);

		jf.add(jb);

		return jb;
	}

	public Choice makeChoice(String[] array, int x, int y, int width, int height) {
		Choice choice = new Choice();
		choice.setBounds(x, y, width, height);

		for (int i = 0; i < array.length; i++)
			choice.add(array[i]);

		jf.add(choice);
		return choice;
	}

}
