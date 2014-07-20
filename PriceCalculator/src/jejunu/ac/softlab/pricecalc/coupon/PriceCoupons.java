package jejunu.ac.softlab.pricecalc.coupon;

import java.util.HashMap;
import java.util.Map;

public class PriceCoupons {
	private Map<String, Integer> priceCoupons;

	public PriceCoupons() {
		priceCoupons = new HashMap<String, Integer>();
		priceCoupons.put("1000", 1000);
		priceCoupons.put("2000", 2000);
		priceCoupons.put("3000", 3000);
	}

	public Map<String, Integer> getPriceCoupons() {
		return priceCoupons;
	}
}
