
public class IfScorePrintReturn {

	public static void main(String[] args) {

		int kor = 80;

		/*
		 * 입력되는 점수의 유효성체크
		 */
		if (!(kor >= 0 && kor <= 100)) {
			System.out.println(kor + " 은 유효한 점수가 아닙니다.");
			return; //vm으로 실행을 반환하면서 셧다운, 메인 블록에서 빠져나감, vm에서 호출한 메인 블록의 스레드가 jvm으로 돌아감, 메인블록은 종료
		}
		/*
		 * 2.학점계산
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

		return;
	}// end main

}
