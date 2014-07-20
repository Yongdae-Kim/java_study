package jejunu.ac.softlab.pricecalc.result;

public class ResultPrinter {

	private String productName;
	private int productPrice, totalPrice;

	public ResultPrinter(String productName, int productPrice, int totalPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.totalPrice = totalPrice;
	}

	public void printResult() {
		System.out.println("product : " + productName);
		System.out.println("befor price : " + productPrice);
		System.out.println("after price : " + totalPrice);
	}
}
