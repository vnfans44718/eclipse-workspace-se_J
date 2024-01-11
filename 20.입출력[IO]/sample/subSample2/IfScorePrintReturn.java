
public class IfScorePrintReturn {

	public static void main(String[] args) {

		int kor = -90;

		/*
		 * 1.입력되는 점수의 유효성체크
		 */
		if(!(kor>=0 && kor<=100)) {
			System.out.println(kor+" 은 유효한점수가 아닙니다.");
			/*
			 * return
			 *   - 현재 return문을 실행하는 실행흐름을 실행흐름을만들어서 호출한곳으로 반환한다.
			 *   - return문 생략가능
			 */
			return;
		}
		/*
		 * 2.학점계산
		 */
		char hakjum = 'F';
		if (kor >= 90) {
			hakjum = 'A';
		} else if (kor >= 80) {
			hakjum = 'B';
		} else if (kor >= 70) {
			hakjum = 'C';
		} else if (kor >= 60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}
		System.out.println("학점은 "+hakjum+" 입니다.");
		
	}//end main

}
