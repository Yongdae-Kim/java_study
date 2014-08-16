package kr.ac.jejunu.softlab.bat.util;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UITools {
	private JFrame jf;

	public UITools(JFrame jf) {
		this.jf = jf;
	}

	public JLabel makeJLabel(String name, int x, int y, int width, int height) {
		JLabel jl = new JLabel(name);
		jl.setBounds(x, y, width, height);
		jl.setHorizontalTextPosition(SwingConstants.CENTER);
		jl.setFont(getMyFont());
		jf.add(jl);

		return jl;
	}

	public JButton makeJButton(String name, int x, int y, int width,
			int height, ActionListener listener) {
		JButton jb = new JButton(name);
		jb.setBounds(x, y, width, height);
		jb.setFont(getMyFont());
		jb.addActionListener(listener);

		jf.add(jb);

		return jb;
	}

	private Font getMyFont() {
		return new Font("Serif", Font.BOLD, 20);
	}
}