
package com.itwill.shop;

public class Member {
	private int no;
	private String name;
	private String address;
	private int phoneNumber;

	public void memberInfo(int no, String name, String address, int phoneNumber) {
		this.no = no;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void headerprint() {
		System.out.println("====================================================");
		System.out.printf("%s %s %s %s\n", "회원 번호", "회원 이름", "회원 주소", "회원 연락처");

	}

	public void print() {
		System.out.println("====================================================");
		System.out.printf("%d %s %s %d\n", no, name, address, phoneNumber);

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
