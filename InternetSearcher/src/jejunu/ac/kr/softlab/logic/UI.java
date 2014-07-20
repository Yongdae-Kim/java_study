package jejunu.ac.kr.softlab.logic;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class UI extends JFrame {

	public UI() {
		super("Finder");
	}

	public void showForm() {
		setLayout(null);
		setFrameTheme("#ff1493");

		JTextField searchWordTf = makeJTextField("", 10, 10, 500, 40);
		setTextFieldTheme(searchWordTf);

		searchWordTf.addKeyListener(new KeyEventHandler(searchWordTf));
	}

	private void setFrameTheme(String rgbColor) {
		getContentPane().setBackground(Color.decode(rgbColor));
	}

	private void setTextFieldTheme(JTextField jtf) {
		Font font1 = new Font("돋움체", Font.BOLD, 25);
		jtf.setFont(font1);
	}

	private JTextField makeJTextField(String name, int x, int y, int width,
			int height) {
		JTextField tf = new JTextField(name);
		tf.setBounds(x, y, width, height);
		tf.setHorizontalAlignment(JTextField.CENTER);
		add(tf);
		return tf;
	}
}
