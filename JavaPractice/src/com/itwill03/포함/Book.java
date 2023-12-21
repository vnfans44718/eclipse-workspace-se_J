package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 */

	/* <<속성>>
	*  책번호
	*  책제목
	*  책분류
	*  책설명
	*/

	int bokNum;
	String boksub;
	String bokGenre;
	String bokDes;

	public Book() {

	}

	public Book(int bokNum, String boksub, String bokGenre, String bokDes) {
		super();
		this.bokNum = bokNum;
		this.boksub = boksub;
		this.bokGenre = bokGenre;
		this.bokDes = bokDes;

	}

	/* <<기능>>
	 *   책정보출력
	 *   
	 */

	public static void headerPrint() {
		System.out.println("번호 제목 장르 설명");
	}

	public void print() {
		System.out.printf("%d %s %s %s", bokNum, boksub, bokGenre, bokDes);
	}

	public int getBokNum() {
		return bokNum;
	}

	public void setBokNum(int bokNum) {
		this.bokNum = bokNum;
	}

	public String getBoksub() {
		return boksub;
	}

	public void setBoksub(String boksub) {
		this.boksub = boksub;
	}

	public String getBokGenre() {
		return bokGenre;
	}

	public void setBokGenre(String bokGenre) {
		this.bokGenre = bokGenre;
	}

	public String getBokDes() {
		return bokDes;
	}

	public void setBokDes(String bokDes) {
		this.bokDes = bokDes;
	}

}