package com.itwill001.Method;

public class DvdShopMain {

	public static void main(String[] args) {

		/*
		 * Dvd객체생성
		 */

		Dvd dvd1 = new Dvd();
		Dvd dvd2 = new Dvd();
		Dvd dvd3 = new Dvd();
		Dvd dvd4 = new Dvd();

		/*
		 * Dvd정보대입메쏘드호출
		 */

		dvd1.dvdInfo(1234, "어브덕션 : 블루레이", "액션/어드벤처");
		dvd2.dvdInfo(4567, "사랑과 영혼", "로맨스");
		dvd3.dvdInfo(7890, "돈존", "로맨스");
		dvd4.dvdInfo(3333, "오펜하이머", "드라마");

		/*
		 * Dvd정보출력메쏘드호출
		 */

		dvd1.headerprint();
		dvd1.print();
		dvd2.print();
		dvd3.print();
		dvd4.print();

	}

}