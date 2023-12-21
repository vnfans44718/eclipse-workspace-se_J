package com.itwill03.포함;

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/

	private int memNum;
	private String memName;
	private String memPhone;
	private Book[] rent;

	/*
	<<기능>>
	  회원정보출력 
	 */

	public BookMember() {
		// TODO Auto-generated constructor stub
	}

	public BookMember(int memNum, String memName, String memPhone, Book[] book) {
		this.memNum = memNum;
		this.memName = memName;
		this.memPhone = memPhone;
		this.rent = book;

	}

	public static void headerPrint() {
		System.out.println("회원번호 회원이름 전화번호 빌린 책");
	}

	public void print() {
		System.out.println(memNum + "\t" + memName + "\t" + memPhone);
		for (int i = 0; i < rent.length; i++) {
			rent[i].print();
			System.out.println();
		}

	}

	public int getMemNum() {
		return memNum;
	}

	public void setMemNum(int memNum) {
		this.memNum = memNum;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public Book[] getRent() {
		return rent;
	}

	public void setRent(Book[] rent) {
		this.rent = rent;
	}

}