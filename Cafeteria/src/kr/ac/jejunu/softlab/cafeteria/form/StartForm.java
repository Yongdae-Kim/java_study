package kr.ac.jejunu.softlab.cafeteria.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;

import kr.ac.jejunu.softlab.cafeteria.callback.CallBack;
import kr.ac.jejunu.softlab.cafeteria.menu.GeneralMenu;
import kr.ac.jejunu.softlab.cafeteria.menu.JejuUnivCafeteriaHtmlParser;
import kr.ac.jejunu.softlab.cafeteria.menu.SpecialMenu;
import kr.ac.jejunu.softlab.cafeteria.msg.Messenger;
import kr.ac.jejunu.softlab.cafeteria.util.UITools;

public class StartForm extends JFrame implements ActionListener {

	private UITools tools = new UITools(this);

	private final String[] dayOfWeeks = new String[] { "Mon", "Tue", "Wed",
			"Thu", "Fri" };

	private JejuUnivCafeteriaHtmlParser parser;

	public StartForm() {

		super("Cafeteria Menu");

		parser = new JejuUnivCafeteriaHtmlParser(htmlParserCallBack);

		showForm();
		setSize(410, 100);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private CallBack htmlParserCallBack = new CallBack() {
		@Override
		public void CallBackMethod(Object obj) {
			if (isInternetConnected())
				new StartForm();
		}
	};

	private Boolean isInternetConnected() {
		return new Messenger()
				.showDialog("Make sure that the Internet connection") == 0;
	}

	private void showForm() {
		setLayout(null);
		initBtn();
	}

	private void initBtn() {
		for (int i = 0; i < dayOfWeeks.length; i++)
			tools.makeJButton(dayOfWeeks[i], 20 + (75 * i), 10, 70, 50, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String btnName = e.getActionCommand();
		int index = Arrays.asList(dayOfWeeks).indexOf(btnName) + 1;

		GeneralMenu generalMenu = new GeneralMenu(parser.getElement(), index);
		SpecialMenu specialMenu = new SpecialMenu(parser.getElement(), index);

		new ResultForm(this, generalMenu.getFoods(), specialMenu.getFoods());
	}

}
