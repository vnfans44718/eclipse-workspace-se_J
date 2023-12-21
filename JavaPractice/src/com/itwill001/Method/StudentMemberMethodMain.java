package com.itwill001.Method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */

		stu1.no1(1);
		stu1.name1("김경호");
		stu1.kor1(60);
		stu1.eng1(45);
		stu1.math1(89);

		stu2.no1(2);
		stu2.name1("김경수");
		stu2.kor1(76);
		stu2.eng1(55);
		stu2.math1(0);

		stu3.no1(3);
		stu3.name1("김경희");
		stu3.kor1(36);
		stu3.eng1(99);
		stu3.math1(100);

		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */

		stu1.tot1();
		stu1.avg1();
		stu1.grade1();

		stu2.tot1();
		stu2.avg1();
		stu2.grade1();

		stu3.tot1();
		stu3.avg1();
		stu3.grade1();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */

		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();

	}
}