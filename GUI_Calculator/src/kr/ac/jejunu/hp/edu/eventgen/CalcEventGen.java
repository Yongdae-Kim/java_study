package kr.ac.jejunu.hp.edu.eventgen;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import kr.ac.jejunu.hp.edu.event.BackspaceKeyEvent;
import kr.ac.jejunu.hp.edu.event.BasicOperKeyEvent;
import kr.ac.jejunu.hp.edu.event.CancelKeyEvent;
import kr.ac.jejunu.hp.edu.event.DotKeyEvent;
import kr.ac.jejunu.hp.edu.event.NumericKeyEvent;
import kr.ac.jejunu.hp.edu.event.ReciprocalKeyEvent;
import kr.ac.jejunu.hp.edu.event.RootKeyEvent;
import kr.ac.jejunu.hp.edu.event.SlashX_KeyEvent;

public class CalcEventGen {

	private List<String> operand, operator;

	public CalcEventGen() {
		operand = new ArrayList<String>();
		operator = new ArrayList<String>();
	}

	public void generateEvents(JTextField jtf, String btnName) {

		new NumericKeyEvent().execute(jtf, btnName);
		new DotKeyEvent().execute(jtf, btnName);

		new CancelKeyEvent().execute(jtf, btnName);
		new BackspaceKeyEvent().execute(jtf, btnName);

		new RootKeyEvent().execute(jtf, btnName);
		new SlashX_KeyEvent().execute(jtf, btnName);
		new ReciprocalKeyEvent().execute(jtf, btnName);

		new BasicOperKeyEvent(operand, operator).execute(jtf, btnName);
	}
}