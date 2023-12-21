package com.itwill001.Method;

public class HealthTeacherMethodMain {

	public static void main(String[] args) {

		// 객체 생성
		Health health1 = new Health();
		Health health2 = new Health();

		// 헬스강사 정보 멤버 메소드 호출
		health1.name1(null);
		health1.height1(0);
		health1.weight1(0);
		health1.lecture1(null);
		health1.age1(0);

		health2.name1(null);
		health2.height1(0);
		health2.weight1(0);
		health2.lecture1(null);
		health2.age1(0);

		// 헬스강사 정보 출력 메소드 호출
		health1.headerprint();
		health1.print();
		health2.print();

	}

}
