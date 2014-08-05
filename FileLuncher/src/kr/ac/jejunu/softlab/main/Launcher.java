package kr.ac.jejunu.softlab.main;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;

public class Launcher {

	private FileDialog fileDialog;

	public void execute() {

		fileDialog = new FileDialog(new Frame(), "Plz select the file");
		fileDialog.setVisible(true);

		if (isSelectedFileExist())
			executeProgram();
	}

	private Boolean isSelectedFileExist() {
		return fileDialog.getDirectory() != null
				&& fileDialog.getFile() != null;
	}

	private void executeProgram() {
		String filePath = fileDialog.getDirectory() + fileDialog.getFile();
		File file = new File(filePath);

		try {
			new ProcessBuilder(filePath).start();
		} catch (IOException e) {
			if (Desktop.isDesktopSupported())
				runToDesktopProgram(file);
		}
	}

	private void runToDesktopProgram(File file) {
		try {
			Desktop.getDesktop().edit(file);
		} catch (IOException e) {
			System.out.println("This file can't be run on this computer");
			System.out.println(e.getMessage());
		}
	}
}
