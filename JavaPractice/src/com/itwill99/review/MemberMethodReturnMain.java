package com.itwill99.review;

public class MemberMethodReturnMain {
	public static void main(String[] args) {
		/*
		 * MemberMethodReturn 객체생성
		 */
		MemberMethodReturn mmr = new MemberMethodReturn();

		/*
		 MemberMethodReturn객체의  method1 호출후 반환데이타받아서 출력
		 */

		mmr.method1();
		System.out.println(mmr.method1());

		/*
		 MemberMethodReturn객체의  method2 호출후 반환데이타받아서 출력
		 (변수 선언 하고나서 출력)
		 */
		mmr.method2();
		boolean a = mmr.method2();
		System.out.println(a);

		/*
		 MemberMethodReturn객체의 add메쏘드를 정수인자 두개를 넣어서 호출후 
		 반환되는 정수데이타받아서 출력
		 */
		mmr.add(4, 5);
		int b = mmr.add(4, 5);
		System.out.println(b);
		/*
		 MemberMethodReturn객체의 hello 메쏘드를 문자열인자 한개 넣어서 호출후 
		 반환되는 문자열데이타받아서 출력
		 */

		mmr.hello("김경호");
		String c = mmr.hello("김경호");
		System.out.println(c);
	}
}
