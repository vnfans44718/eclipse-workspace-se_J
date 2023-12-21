package com.itwill001.Method;

public class Dvd {
	/*
	 * <<속성>>
	    Dvd 번호
		Dvd타이틀
		Dvd쟝르
	 * 
	 * <<기능>>
	 *   - Dvd정보대입
	 *   - Dvd정보출력
	 *   
	 */

	int dvdNumber;
	String dvdTitle;
	String dvdCategory;

	public void dvdInfo(int dvdNumber, String dvdTitle, String dvdCategory) {
		this.dvdNumber = dvdNumber;
		this.dvdTitle = dvdTitle;
		this.dvdCategory = dvdCategory;
	}

	public void headerprint() {
		System.out.println("====================================================");
		System.out.printf("%7s %10s %20s\n", "dvd 번호", "dvd 제목", "dvd 장르");

	}

	public void print() {
		System.out.println("====================================================");
		System.out.printf("%7d %15s %10s\n", dvdNumber, dvdTitle, dvdCategory);

	}

	public int getDvdNumber() {
		return dvdNumber;
	}

	public void setDvdNumber(int dvdNumber) {
		this.dvdNumber = dvdNumber;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public String getDvdCategory() {
		return dvdCategory;
	}

	public void setDvdCategory(String dvdCategory) {
		this.dvdCategory = dvdCategory;
	}

}