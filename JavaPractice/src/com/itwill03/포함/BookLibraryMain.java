package com.itwill03.포함;

import java.util.Iterator;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		Book[] book1 = new Book[1];
		BookMember member1 = new BookMember(1234, "김경호", "0101234", book1);

		/*
		 * 책객체생성
		 */

		Book[] book = new Book[3];
		book[0] = new Book(123, "자바 공부하기", "교육", "자바로 배우는 프로그래밍 자습서");
		book[1] = new Book(456, "인어공주", "동화", "아이들을 위한 동화");
		book[2] = new Book(789, "상실의 시대", "드라마", "무라카미 하루키의 책");

		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		*/

		member1.setRent(book);

		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		member1.headerPrint();
		member1.print();

	}
}