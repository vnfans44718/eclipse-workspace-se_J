
public class StudentScorePrint {

	public static void main(String[] args) {
		int num1, num2, kor1, kor2, eng1, eng2, math1, math2, sum1, sum2, rank;
		String name1, name2;
		char grade;
		double avg1, avg2;

		num1 = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;

		num2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		
		rank = 0;

		if (!(kor1 <= 100 && kor1 >= 0)) {
			System.out.println(name1 + " 의 국어 점수가 유효하지 않습니다.");
			return;
		} else if (!(eng1 <= 100 && eng1 >= 0)) {
			System.out.println(name1 + " 영어의 점수가 유효하지 않습니다.");
			return;
		} else if (!(math1 <= 100 && math1 >= 0)) {
			System.out.println(name1 + " 의 수학 점수가 유효하지 않습니다.");
			return;
		}

		if (!(kor2 <= 100 && kor2 >= 0)) {
			System.out.println(name2 + " 의 국어 점수가 유효하지 않습니다.");
			return;
		} else if (!(eng2 <= 100 && eng2 >= 0)) {
			System.out.println(name2 + " 의 영어 점수가 유효하지 않습니다.");
			return;
		} else if (!(math2 <= 100 && math2 >= 0)) {
			System.out.println(name2 + " 의 수학 점수가 유효하지 않습니다.");
			return;
		}

		sum1 = kor1 + eng1 + math1;
		sum2 = kor2 + eng2 + math2;

		avg1 = sum1 / 3.0;
		avg2 = sum2 / 3.0;
		grade = 'A';

		if (avg1 >= 90) {
			grade = 'A';
		} else if (avg1 >= 80) {
			grade = 'B';
		} else if (avg1 >= 70) {
			grade = 'C';
		} else if (avg1 >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		if (avg2 >= 90) {
			grade = 'A';
		} else if (avg2 >= 80) {
			grade = 'B';
		} else if (avg2 >= 70) {
			grade = 'C';
		} else if (avg2 >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
	System.out.println("\t--------------------------학생 성적 출력----------------------------");
	System.out.println("\t학번 \t이름 \t국어 \t영어 \t수학 \t총점 \t평균 \t평점 \t석차");
	System.out.println("\t--------------------------------------------------------------------");
	System.out.printf("\t%d \t%s \t%d \t%d \t%d \t%d \t%5.1f \t%c \t%d \n",num1, name1,kor1,eng1,math1,sum1,avg1,grade,rank);
	System.out.printf("\t%d \t%s \t%d \t%d \t%d \t%d \t%5.1f \t%c \t%d \n",num2, name2,kor2,eng2,math2,sum2,avg2,grade,rank);
	System.out.println("\t--------------------------------------------------------------------");
	
	
		
	}
}