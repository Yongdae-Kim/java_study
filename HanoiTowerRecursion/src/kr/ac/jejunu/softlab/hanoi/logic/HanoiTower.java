package kr.ac.jejunu.softlab.hanoi.logic;

public class HanoiTower {

	public void move(int num, String from, String by, String to) {
		if (num == 1) {

			System.out.printf("Disc 1 move from %s to %s \n", from, to);
			// when number of disc is 1

		} else {

			move(num - 1, from, to, by);
			System.out.printf("Disc %d move from %s to %s \n", num, from, to);
			move(num - 1, by, from, to);

		}
	}
}
