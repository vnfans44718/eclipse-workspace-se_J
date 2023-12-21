package com.itwill001.Method;

public class OrderList {

	// 주문정보 멤버변수 선언

	String orderNumber;
	String phoneNumber;
	String deliveryAddress;
	int orderDate;
	int orderTime;
	int orderPrice;
	String menuNumber;

	// 주문정보 멤버메쏘드 선언

	public void orderNumber1(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void phoneNumber1(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deliveryAddress1(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public void orderDate1(int orderDate) {
		this.orderDate = orderDate;
	}

	public void orderTime1(int orderTime) {
		this.orderTime = orderTime;
	}

	public void orderPrice1(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public void menuNumber1(String menuNumber1) {
		this.menuNumber = menuNumber1;
	}

	// 주문정보 출력메소드
	public void headPrint() {
		System.out.print("주문 접수 번호 : " + this.orderNumber + "\n주문 핸드폰 번호 : " + this.phoneNumber + "\n주문 집 주소: "
				+ this.deliveryAddress + "\n주문 날짜: " + this.orderDate + "\n주문 시간: " + this.orderTime + "\n주문 가격: "
				+ this.orderPrice + "\n메뉴 번호: " + this.menuNumber);

	}

}
