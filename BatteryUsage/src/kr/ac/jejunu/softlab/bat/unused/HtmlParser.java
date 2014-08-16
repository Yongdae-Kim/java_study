package kr.ac.jejunu.softlab.bat.unused;

import java.io.IOException;
import java.net.URL;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

public class HtmlParser {

	private final String uri = "file:\\\\\\" + System.getProperty("user.dir")
			+ "\\energy-report.html";
	private Source source;

	public HtmlParser() {

		try {
			source = new Source(new URL(uri));
			source.fullSequentialParse();
		} catch (IOException e) {
		}

		for (int i = getTableDataSize(); i >= 0; i--) {
			if (isLookingForText(i, "설계 용량")) {
				System.out.println(getRemainingBattery(i));
				break;
			}
		}

	}

	private int getTableDataSize() {
		return source.getAllElements(HTMLElementName.TD).size() - 1;
	}

	private Element getTableData(int index) {
		return source.getAllElements(HTMLElementName.TD).get(index);
	}

	private String getTableDataValue(int index) {
		return getTableData(index).getTextExtractor().toString();
	}

	private Boolean isLookingForText(int index, String text) {
		return getTableData(index).getTextExtractor().toString().equals(text);
	}

	private double getRemainingBattery(int index) {
		double a = Double.parseDouble(getTableDataValue(index + 1));
		double b = Double.parseDouble(getTableDataValue(index + 3));

		return b / a;
	}
}
