package kr.ac.jejunu.softlab.cafeteria.menu;

import java.io.IOException;
import java.net.URL;

import kr.ac.jejunu.softlab.cafeteria.callback.CallBack;
import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

public class JejuUnivCafeteriaHtmlParser {

	private final String url = "http://www.jejunu.ac.kr/_2014/camp/stud/01.jsp";
	private Element div;

	public JejuUnivCafeteriaHtmlParser(CallBack callBack) {
		Source source = null;
		try {
			source = new Source(new URL(url));
			source.fullSequentialParse();
		} catch (IOException e) {
			callBack.CallBackMethod(e);
		}

		Element body = source.getAllElements(HTMLElementName.BODY).get(0);
		div = body.getAllElements(HTMLElementName.DIV).get(6);
	}

	public Element getElement() {
		return div.getAllElements(HTMLElementName.DIV).get(3);
	}
}
