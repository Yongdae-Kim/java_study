package kr.ac.jejunu.softlab.hanoi.main;

import kr.ac.jejunu.softlab.hanoi.logic.HanoiTower;

public class Main {
	public static void main(String[] args) {

		new HanoiTower().move(3, "A", "B", "C");
		// parameter means numOfDisc, from, by, to
	}
}
