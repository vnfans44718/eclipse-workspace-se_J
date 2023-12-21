package com.itwill001.Method;

public class OrderMethodMain {

	public static void main(String[] args) {
		// 객체 생성
		OrderList order1 = new OrderList();

		// 주문정보 멤버 메소드 호출

		order1.orderNumber1("202011020003");
		order1.phoneNumber1("010-2345-0001");
		order1.deliveryAddress1("서울시 강남구 역삼동 111-333");
		order1.orderDate1(20201102);
		order1.orderTime1(130258);
		order1.orderPrice1(35000);
		order1.menuNumber1("0003");

		// 주문정보 출력 메소드 호출
		order1.headPrint();

	}

}
