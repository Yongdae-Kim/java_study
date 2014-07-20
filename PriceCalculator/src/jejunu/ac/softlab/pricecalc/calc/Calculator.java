package jejunu.ac.softlab.pricecalc.calc;

import jejunu.ac.softlab.pricecalc.discount.Discount;

public class Calculator {

	private Discount discount;

	public Calculator(Discount discount) {
		this.discount = discount;
	}

	public int getTotalPrice(int productPrice) {
		return (int) (productPrice * (1 - discount.getDiscountRate()) - discount
				.getDiscountPrice());
	}
}
