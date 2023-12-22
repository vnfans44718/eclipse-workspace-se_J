package lang;

public class LottoMain {

	public static void main(StringCreateCompareMain[] args) {
		System.out.println("----------로또번호 6개 생성 [중복번호 허용안됨]");
		int[] lottoNumber = { 0, 0, 0, 0, 0, 0 };
		/*
		 * 
		 * 번호생성
		 * -Quiz : 중복체크
		 * 
		 */
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int) (Math.random() * 45) + 1;

		}
		/*
		 * 번호 출력
		 */
		for (int no : lottoNumber) {
			System.out.println(no + " ");
		}
	}

}
