package com.itwill.shop;
	public class Product {
		private int no;
		private String title;
		private int price;
		private int amount;
		private int mulPrice;
		private String productInfo;
	    
		
		
		public void proDescription(int no, String title, int price, int amount,String productInfo) {
	
			this.no=no;
			this.title=title;
			this.price=price;
			this.amount=amount;
			this.mulPrice=price*amount;
			this.productInfo=productInfo;
			
			
		}
		

		
		public void headerprint() {
			System.out.println("====================================================");
			System.out.printf("%s %s %s %s %s %s\n", "제품 번호", "제품 이름", "제품 가격","제품 수량","제품 총 가격", "제품 설명");

		}

		public void print() {
			System.out.println("====================================================");
			System.out.printf("%d %s %d %d %d %s\n", no, title, price,amount,mulPrice, productInfo);

		}


		public int getNo() {
			return no;
		}


		public void setNo(int no) {
			this.no = no;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public int getAmount() {
			return amount;
		}


		public void setAmount(int amount) {
			this.amount = amount;
		}


		public int getTotalPrice() {
			return mulPrice;
		}


		public void setTotalPrice(int price) {
			this.mulPrice = price*amount;
		}


		public String getProductInfo() {
			return productInfo;
		}


		public void setProductInfo(String productInfo) {
			this.productInfo = productInfo;
		}


		
		
		
	}

   	