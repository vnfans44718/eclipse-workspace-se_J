package com.itwill03.포함;


public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd rentDvd;//빌린dvd
	
	public DvdMember() {
		// TODO Auto-generated constructor stub
	}

	public DvdMember(int no, String name, String tel, Dvd rentDvd) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.rentDvd = rentDvd;
	}
	
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	
	public static void headPrint() {
		System.out.println("===========회원정보==========");	
		System.out.println("회원번호 회원이름 전화번호 ");	
		
	}
	
	
}