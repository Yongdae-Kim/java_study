package kr.ac.jejunu.softlab.bat.main;

import kr.ac.jejunu.softlab.bat.cmd.CmdLauncher;
import kr.ac.jejunu.softlab.bat.form.CustomerDialog;

public class Main {
	public static void main(String args[]) {
		new CmdLauncher().execute();
		new CustomerDialog();
	}
}
