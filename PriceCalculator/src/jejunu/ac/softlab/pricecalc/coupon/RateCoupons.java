package jejunu.ac.softlab.pricecalc.coupon;

import java.util.HashMap;
import java.util.Map;

public class RateCoupons {

	private Map<String, Double> rateCoupons;

	public RateCoupons() {
		rateCoupons = new HashMap<String, Double>();
		rateCoupons.put("10%", 0.1);
		rateCoupons.put("20%", 0.2);
		rateCoupons.put("30%", 0.3);
	}

	public Map<String, Double> getRateCoupons() {
		return rateCoupons;
	}
}
