package jejunu.ac.softlab.pricecalc.discount;

import jejunu.ac.softlab.pricecalc.product.Product;

public class GeneralDiscount implements Discount {

	private Product product;
	private int discountPrice;

	public GeneralDiscount(int productPrice) {
		this.product = new Product(productPrice);
	}

	public double getDiscountRate() {
		return product.getDiscountRate();
	}

	public int getDiscountPrice() {
		discountPrice = 0;
		return discountPrice;
	}
}
