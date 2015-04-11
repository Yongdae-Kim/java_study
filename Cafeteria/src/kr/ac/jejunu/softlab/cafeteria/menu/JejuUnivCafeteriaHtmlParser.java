package kr.ac.jejunu.softlab.cafeteria.menu;

import java.io.IOException;
import java.net.URL;

import kr.ac.jejunu.softlab.cafeteria.callback.CallBack;
import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.Source;

public class JejuUnivCafeteriaHtmlParser {

	private final String url = "http://www.jejunu.ac.kr/_2014/camp/stud/01.jsp";

	private Source source;

	public JejuUnivCafeteriaHtmlParser(CallBack callBack) {
		try {
			source = new Source(new URL(url));
			source.fullSequentialParse();
		} catch (IOException e) {
			callBack.CallBackMethod(e);
		}
	}

	public Element getElement() {
		return source.getElementById("Content");
	}
}
