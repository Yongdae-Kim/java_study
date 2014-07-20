package jejunu.ac.softlab.pricecalc.customer;

import java.util.Scanner;

public class Customer {

	private String productName, couponName;
	private int productPrice;
	private boolean withCoupon;

	private Scanner sc = new Scanner(System.in);

	public void perchaseTheProduct() {
		System.out.println("plz enter the product.");
		productName = sc.next();
		System.out.println("plz enter the price");
		productPrice = sc.nextInt();
	}

	public boolean hasCoupon() {
		System.out.println("has coupon? (true or false)");
		withCoupon = sc.nextBoolean();

		if (withCoupon == true) {
			System.out.println("plz enter the coupon name");
			couponName = sc.next();
			return true;
		} else {
			couponName = null;
			return false;
		}
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public String getCouponName() {
		return couponName;
	}
}
