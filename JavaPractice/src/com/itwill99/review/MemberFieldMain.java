package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mF1 = new MemberField(123, "김경호", "023456789", 'A');

		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mF1.setNo(321);
		mF1.setName("김경수");
		mF1.setNumber("12345678");
		mF1.setGrade('B');

		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		mF1.headerPrint();
		mF1.print();

	}

}