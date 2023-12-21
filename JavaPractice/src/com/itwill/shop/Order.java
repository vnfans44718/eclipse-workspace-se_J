package com.itwill.shop;
	public class Order {
		/*
		 * 주문번호,주문날짜,주문금액,배송지
		 */
		
		private int orderNumber;
		private String orderDate;
		private int orderPrice;
		private String deliveryaddress;
		
		
		Product product;
		Member member;
		
		
		
		void setOrderData(Product produt, Member meber)
		{
			this.product = product;
			this.member = member;
		}
		
		
		
		
	/*	public void orderInfo(int orderNumber, String orderDate) {
			this.orderNumber=orderNumber;
					this.orderDate=orderDate;		
					this.orderPrice=	
					this.deliveryaddress=deliveryaddress;		
		}
	*/

		public void headerprint() {
			System.out.println("====================================================");
			System.out.printf("%s %s %s %s\n", "주문 번호", "주문 날짜", "주문 가격","배송지");

		}

		public void print() {
			System.out.println("====================================================");
			System.out.printf("%d %s %d %s\n", orderNumber, orderDate, orderPrice,deliveryaddress);

		}

		
	
	} 



