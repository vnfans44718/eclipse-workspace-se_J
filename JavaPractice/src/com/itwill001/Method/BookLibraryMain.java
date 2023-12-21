package com.itwill001.Method;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		
		/*
		 * 책객체생성
		 */

		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();

		/*
		 * 책정보대입메쏘드호출
		 */

		book1.bookInfo(1234, "트렌드 코리아 2024", "사회철학", "2024는 청룡의 해다.");
		book2.bookInfo(5678, "세이노의 가르침", "자기계발서", "재야의 명저 《세이노의 가르침》 2023년판 정식 출간! ");
		book3.bookInfo(4567, "에그박사", "어린이", "에그박사와 함께 자연의 숨결이 살아 있는 호주로 떠나 보세요!");
		book4.bookInfo(9999, "마흔에 읽는 쇼펜하우어", "철학", "‘쇼펜하우어 신드롬’을 일으킨 화제의 책");

		/*
		 * 책정보출력메쏘드호출
		 */

		book1.headerprint();
		book1.print();
		book2.print();
		book3.print();
		book4.print();

	}
}