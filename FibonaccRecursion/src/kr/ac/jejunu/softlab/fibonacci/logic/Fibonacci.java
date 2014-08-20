package kr.ac.jejunu.softlab.fibonacci.logic;

public class Fibonacci {

	public void example(int ex) {

		for (int i = 0; i < ex; i++)

			System.out.println(new Fibonacci().function(i));
	}

	private int function(int num) {

		if (num == 0 || num == 1)
			return 0;
		// zero, first of fibonacci number
		else if (num == 2)
			return 1;
		// second of fibonacci number
		else
			return function(num - 1) + function(num - 2);
		// after third of the fibonacci number
	}
}
