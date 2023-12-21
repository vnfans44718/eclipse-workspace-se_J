package com.itwill001.Method;

/*
  #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {

	/*
	 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	int rank = 2;
//"%d %s %d %d %d %d %.1f %c %d\n
	// 멤버메쏘드 선언
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	 */

	public void no1(int no) {
		this.no = no;
		return;
	}

	public void name1(String name) {
		this.name = name;
		return;
	}

	public void kor1(int kor) {
		this.kor = kor;
		return;
	}

	public void eng1(int eng) {
		this.eng = eng;
		return;
	}

	public void math1(int math) {
		this.math = math;
		return;
	}

	/*
	 * 총점계산메쏘드
	 */

	public void tot1() {
		this.tot = (this.kor + this.eng + this.math);
		return;
	}

	/*
	 * 평균계산메쏘드
	 */

	//객체가 만들어진 후 사용할 수 있는 메소드
	public void avg1() {
		this.avg = (this.kor + this.eng + this.math) / 3.0;
		return;
	}

	/*
	 * 평점계산메쏘드
	 */

	public void grade1() {
		if (this.avg >= 90 && this.avg <= 100) {
			this.grade = 'A';
		} else if (this.avg >= 80 && this.avg < 90) {
			this.grade = 'B';
		} else if (this.avg >= 70 && this.avg < 80) {
			this.grade = 'C';
		} else if (this.avg >= 60 && this.avg < 70) {
			this.grade = 'D';
		} else if (this.avg >= 0 && this.avg < 60) {
			this.grade = 'F';
		}
		return;
	}

	/*
	 * 출력메쏘드
	 */

	public void headerPrint() {
		System.out.printf("=========================================================\n");
		System.out.printf("%s %s %3s %s %s %s %s %s %s \n", "번호", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");

		return;
	}

	public void print() {
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("%2d %5s %3d %3d %3d %5d  %.1f   %c    %d\n", this.no, this.name, this.kor, this.eng,
				this.math, this.tot, this.avg, this.grade, this.rank);
		return;
	}

}
