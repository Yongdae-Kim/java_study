package jejunu.ac.kr.softlab.searcher;

import java.util.ArrayList;
import java.util.List;

import jejunu.ac.kr.softlab.logic.Searchable;

public class InternetSearcher implements Searchable {

	private List<String> urlList;

	public InternetSearcher() {
		urlList = new ArrayList<String>();
	}

	public void search(String searchWord) {

		SearchEngine searchEngine = new SearchEngine();
		searchEngine.setUrlMap(searchWord);
		urlList = getUrlList(searchEngine);

		UrlLinker linker = new UrlLinker();
		linker.goToUrl(urlList);
	}

	private List<String> getUrlList(SearchEngine searchEngine) {
		urlList.add(searchEngine.getUrl("google"));
		urlList.add(searchEngine.getUrl("naver"));
		urlList.add(searchEngine.getUrl("daum"));

		return urlList;
	}
}
