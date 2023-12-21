package com.itwill03.포함.배열;

import java.util.Iterator;

public class DvdMember {
	private int no;// 회원번호
	private String name;// 회원이름
	private String tel;// 전화번호
	private Dvd[] dvds;// 빌린dvd들[최대3개]

	public DvdMember() {
    this.dvds=new Dvd[3];
	}

	public void rentDvds(Dvd[] dvds) {
		for (int i = 0; i < dvds.length; i++) {
			if (i >= 3) {
				System.out.println("횟수 초과");
				break;
			}
			if (dvds[i] != null && i < 3) {
				this.dvds = dvds;
				this.dvds[i].print();
			}
			if (dvds[i] == null) {
				this.dvds = dvds;
				System.out.println("\t현재까지" + (i) + "개 빌렸습니다");
				break;
			}

		}
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

	public String getTel() {
		return tel;
	}

	public Dvd[] getDvds() {
		return dvds;
	}

	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void print() {
		System.out.println("==========회원정보==========");
		System.out.println(no + "\t" + name + "\t" + tel + "\t");
		System.out.println("---------빌린 책 목록-------");
		for (int i = 0; i < dvds.length; i++) {
			if (dvds[i] == null) {
				break;
			}
			dvds[i].print();
		}

	}
}
