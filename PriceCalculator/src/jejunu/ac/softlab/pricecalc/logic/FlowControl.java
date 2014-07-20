package jejunu.ac.softlab.pricecalc.logic;

import java.util.Map;

import jejunu.ac.softlab.pricecalc.calc.Calculator;
import jejunu.ac.softlab.pricecalc.coupon.PriceCoupons;
import jejunu.ac.softlab.pricecalc.coupon.RateCoupons;
import jejunu.ac.softlab.pricecalc.customer.Customer;
import jejunu.ac.softlab.pricecalc.discount.Discount;
import jejunu.ac.softlab.pricecalc.discount.DiscountFactory;
import jejunu.ac.softlab.pricecalc.result.ResultPrinter;

public class FlowControl {

	private Map<String, Double> rateCoupons;
	private Map<String, Integer> priceCoupons;

	private Customer customer;
	private Discount discount; // interface
	private DiscountFactory discountFactory;
	private Calculator calculator;
	private ResultPrinter result;

	private String productName;
	private int productPrice, totalPrice;

	public void countrol() {

		setCouponList();

		customer = new Customer();
		customer.perchaseTheProduct();

		productName = customer.getProductName();
		productPrice = customer.getProductPrice();

		discountFactory = new DiscountFactory(customer, priceCoupons,
				rateCoupons);
		discount = discountFactory.getInstance();

		calculator = new Calculator(discount);
		totalPrice = calculator.getTotalPrice(productPrice);

		result = new ResultPrinter(productName, productPrice, totalPrice);
		result.printResult();
	}

	public void setCouponList() {
		rateCoupons = new RateCoupons().getRateCoupons();
		priceCoupons = new PriceCoupons().getPriceCoupons();
	}
}
