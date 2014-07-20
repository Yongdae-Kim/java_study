package jejunu.ac.softlab.pricecalc.product;

import jejunu.ac.softlab.pricecalc.calc.DiscountRateCalculator;

public class Product {
	private int price;

	public Product(int productPrice) {
		this.price = productPrice;
	}

	public double getDiscountRate() {
		return new DiscountRateCalculator().getDiscountRate(price);
	}
}
