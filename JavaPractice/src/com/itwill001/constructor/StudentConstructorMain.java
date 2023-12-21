package com.itwill001.constructor;

public class StudentConstructorMain {
	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
			  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */

		Student stu1 = new Student();
		Student stu2 = new Student(2, "김경호", 40, 60, 80);
		Student stu3 = new Student(3, "김경희", 87, 45, 92);

		stu1.setStudentData(1, "김경수", 56, 99, 58);

		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */

		stu1.calculateTotal();
		stu1.calculateAvg();
		stu1.calculateGrade();

		stu2.calculateTotal();
		stu2.calculateAvg();
		stu2.calculateGrade();

		stu3.calculateTotal();
		stu3.calculateAvg();
		stu3.calculateGrade();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */

		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();

		System.out.println();

		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		stu1.setName("전하영");
		stu1.headerPrint();
		stu1.print();

		System.out.println();
		System.out.println("student1 의 총점데이터: "+stu1.getTot());
		System.out.println("student1 의 학점데이터: "+stu1.getGrade());

	}
}