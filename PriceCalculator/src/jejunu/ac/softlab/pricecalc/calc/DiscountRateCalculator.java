package jejunu.ac.softlab.pricecalc.calc;

public class DiscountRateCalculator {

	public double getDiscountRate(int price) {

		if (price > 5000 && price < 10000)
			return 0.1;
		else if (price >= 10000 && price < 20000)
			return 0.15;
		else if (price >= 20000 && price < 30000)
			return 0.2;
		else if (price >= 30000)
			return 0.25;
		else
			return 0;
	}
}
