package kr.ac.jejunu.softlab.capture;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCapture {
	public void process() {
		try {
			Rectangle currentScreen = new Rectangle(Toolkit.getDefaultToolkit()
					.getScreenSize());

			BufferedImage captureTool = new Robot()
					.createScreenCapture(currentScreen);

			File file = new File("screencapture.jpg");
			ImageIO.write(captureTool, "jpg", file);

		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
