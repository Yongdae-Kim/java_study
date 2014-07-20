package jejunu.ac.kr.softlab.logic;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import jejunu.ac.kr.softlab.searcher.InternetSearcher;

public class KeyEventHandler extends KeyAdapter {
	private JTextField searchWordJtf;
	private String searchWord;

	public KeyEventHandler(JTextField searchWordJtf) {
		this.searchWordJtf = searchWordJtf;
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		if (ke.getKeyCode() == ke.VK_ENTER) {
			searchWord = searchWordJtf.getText();

			Searchable searcher = new InternetSearcher();
			searcher.search(searchWord);

			searchWordJtf.setText("");
		}
	}
}
