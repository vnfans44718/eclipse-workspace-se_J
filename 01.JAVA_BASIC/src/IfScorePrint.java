
public class IfScorePrint {

	public static void main(String[] args) {

		int kor = 80;

		/*
		 * 입력되는 점수의 유효성체크
		 */

		if (kor >= 0 && kor <= 100) {
			/*
			 * 2.유효한점수를 대상으로 학점계산
			 */
			char grade = 'F';
			if (kor >= 90) {
				grade = 'A';
			} else if (kor >= 80) {
				grade = 'B';

			} else if (kor >= 70) {
				grade = 'C';
			} else if (kor >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("학점은 " + grade + " 입니다.");
		}

		else {
			/*
			 * 2-2. 유효하지않은 점수에 대한 메세지 출력
			 */
			System.out.println(kor + " 은 유효한 점수가 아닙니다.");
		}

	}

}
