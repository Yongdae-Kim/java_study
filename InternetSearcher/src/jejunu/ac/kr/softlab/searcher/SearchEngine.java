package jejunu.ac.kr.softlab.searcher;

import java.util.HashMap;
import java.util.Map;

public class SearchEngine {

	private String googleUrl, naverUrl, daumUrl;
	private Map<String, String> urlMap = new HashMap<String, String>();

	public SearchEngine() {
		googleUrl = "https://www.google.co.kr/#newwindow=1&q=";
		naverUrl = "http://search.naver.com/search.naver?where=nexearch&query=";
		daumUrl = "http://search.daum.net/search?w=tot&DA=YZRR&t__nil_searchbox=btn&sug=&sq=&o=&q=";
	}

	public void setUrlMap(String searchWord) {
		addUrl("google", googleUrl, searchWord);
		addUrl("naver", naverUrl, searchWord);
		addUrl("daum", daumUrl, searchWord);
	}

	private void addUrl(String domain, String url, String searchWord) {
		urlMap.put(domain, url + searchWord);
	}

	public String getUrl(String potal) {
		String url;
		if (urlMap.containsKey(potal))
			url = urlMap.get(potal);
		else
			url = null;
		return url;
	}
}
