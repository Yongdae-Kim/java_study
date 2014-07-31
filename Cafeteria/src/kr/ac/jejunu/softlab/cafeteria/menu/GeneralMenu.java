package kr.ac.jejunu.softlab.cafeteria.menu;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;

public class GeneralMenu {

	private Element tr;

	public GeneralMenu(Element e, int index) {
		Element dd = e.getAllElements(HTMLElementName.DD).get(index);
		tr = dd.getAllElements(HTMLElementName.TR).get(0);
	}

	public String[] getFoods() {

		int breakfast = 2;
		int lunch = 4;
		int dinner = 6;

		return new String[] { getMenu(breakfast), getMenu(lunch),
				getMenu(dinner) };
	}

	private String getMenu(int val) {
		Element main = tr.getAllElements(HTMLElementName.TD).get(val);
		Element detail = tr.getAllElements(HTMLElementName.TD).get(val + 1);
		return main.getTextExtractor() + " " + detail.getTextExtractor();
	}
}