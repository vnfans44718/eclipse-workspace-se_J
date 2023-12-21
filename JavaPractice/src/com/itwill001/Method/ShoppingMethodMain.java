package com.itwill001.Method;

public class ShoppingMethodMain {

	public static void main(String[] args) {

		// 객체 생성
		Shopping shopping1 = new Shopping();

		// 쇼핑 정보 멤버 메소드 호출
		shopping1.retailer1("SSG 푸드마켓");
		shopping1.productName1("SSG 옥종 한단딸기 500g");
		shopping1.productPrice1(13900);
		shopping1.discountRate1(36);
		shopping1.deliveryaddress1("서울 특별시 강남구");
		shopping1.origin1("딸기(국내산)");
		shopping1.purchaseQuantity1(2);
		shopping1.totalAmount1();

		// 쇼핑 정보 출력 메소드 호출
		shopping1.print();

	}

}
