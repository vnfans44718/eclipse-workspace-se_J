package com.itwill001.Method;

public class Shopping {

	// 쇼핑정보 멤버변수 선언
	String productName;
	int productPrice;
	int discountRate;
	String deliveryaddress;
	String retailer;
	String origin;
	int purchaseQuantity;
	int totalAmount;

	// 쇼핑정보 멤버메쏘드 선언
	public void productName1(String productName) {
		this.productName = productName;
	}

	public void productPrice1(int productPrice) {
		this.productPrice = productPrice;
	}

	public void discountRate1(int discountRate) {
		this.discountRate = discountRate;
	}

	public void deliveryaddress1(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public void retailer1(String retailer) {
		this.retailer = retailer;
	}

	public void origin1(String origin) {
		this.origin = origin;
	}

	public void purchaseQuantity1(int purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}

	public void totalAmount1() {
		this.totalAmount = (this.productPrice) * (this.purchaseQuantity);
	}

	// 쇼핑정보 출력 메소드
	public void print() {
		System.out.println(

				"\n판매처: " + this.retailer + "\n제품 이름 : " + this.productName + "\n제품 가격 : " + this.productPrice
						+ "\n제품 할인율: " + this.discountRate + '%' + "\n원산지: " + this.origin + "\n배송지: "
						+ this.deliveryaddress + "\n구매 수량: " + this.purchaseQuantity + "\n총 금액: " + this.totalAmount);
	}

}
