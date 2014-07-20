package jejunu.ac.softlab.pricecalc.discount;

import java.util.Map;

import jejunu.ac.softlab.pricecalc.customer.Customer;

public class DiscountFactory {

	private Customer customer;

	private Map<String, Double> rateCoupons;
	private Map<String, Integer> priceCoupons;

	public DiscountFactory(Customer customer,
			Map<String, Integer> priceCoupons, Map<String, Double> rateCoupons) {

		this.customer = customer;
		this.priceCoupons = priceCoupons;
		this.rateCoupons = rateCoupons;
	}

	public Discount getInstance() {
		if (customer.hasCoupon()) {
			String receivedCoupon = customer.getCouponName();
			return new CouponDiscount(priceCoupons, rateCoupons, receivedCoupon);
		} else {
			int productPrice = customer.getProductPrice();
			return new GeneralDiscount(productPrice);
		}
		// return new AdditionalDiscount();
	}
}