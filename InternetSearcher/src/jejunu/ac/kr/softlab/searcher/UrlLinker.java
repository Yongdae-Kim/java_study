package jejunu.ac.kr.softlab.searcher;

import java.lang.reflect.Method;
import java.util.List;

public class UrlLinker {

	public void goToUrl(List<String> urlList) {

		String os = System.getProperty("os.name");
		Runtime runtime = Runtime.getRuntime();

		try {
			if (isWindowOS(os)) {
				goToUrlWhenWindowOS(runtime, urlList);
			} else if (isMacOS(os)) {
				goToUrlWhenMacOS(urlList);
			}

		} catch (Exception e) {
			System.err.println("Exception occurd while invoking Browser!");
			e.printStackTrace();
		}
	}

	private boolean isWindowOS(String os) {
		if (os.startsWith("Windows"))
			return true;
		else
			return false;
	}

	private boolean isMacOS(String os) {
		if (os.startsWith("Mac OS"))
			return true;
		else
			return false;
	}

	private void goToUrlWhenWindowOS(Runtime runtime, List<String> urlList)
			throws Exception {
		for (String url : urlList) {
			String cmd = "rundll32 url.dll,FileProtocolHandler " + url;
			Process p = runtime.exec(cmd);
		}
	}

	private void goToUrlWhenMacOS(List<String> urlList) throws Exception {
		for (String url : urlList) {
			Class fileMgr = Class.forName("com.apple.eio.FileManager");
			Method openURL = fileMgr.getDeclaredMethod("openURL",
					new Class[] { String.class });
			openURL.invoke(null, new Object[] { url });
		}
	}
}
