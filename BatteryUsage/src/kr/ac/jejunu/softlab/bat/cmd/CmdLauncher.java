package kr.ac.jejunu.softlab.bat.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.ac.jejunu.softlab.bat.form.CustomerDialog;

public class CmdLauncher {

	private final String command = "powercfg.exe -energy";

	public void execute() {
		try {
			Process oProcess = new ProcessBuilder("cmd", "/c", command).start();
			new BufferedReader(new InputStreamReader(oProcess.getInputStream()));
			new BufferedReader(new InputStreamReader(oProcess.getErrorStream()));

		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
