package jejunu.ac.softlab.pricecalc.discount;

import java.util.Map;

public class CouponDiscount implements Discount {

	private String receivedCoupon;

	private Map<String, Double> rateCoupons;
	private Map<String, Integer> priceCoupons;

	public CouponDiscount(Map<String, Integer> priceCoupons,
			Map<String, Double> rateCoupons, String receivedCoupon) {
		this.priceCoupons = priceCoupons;
		this.rateCoupons = rateCoupons;
		this.receivedCoupon = receivedCoupon;
	}

	public int getDiscountPrice() {
		return (int) findDiscountCoupon(priceCoupons);
	}

	public double getDiscountRate() {
		return (double) findDiscountCoupon(rateCoupons);
	}

	private <K, V> Object findDiscountCoupon(Map<K, V> coupons) {
		if (coupons.containsKey(receivedCoupon))
			return coupons.get(receivedCoupon);
		else
			return 0;
	}
}
