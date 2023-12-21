
public class IfTest1 {
	/*
	 * 코드정렬단축키 ctrl + shift + f
	 */
	public static void main(String[] args) {

		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = true;

		if (condition) {
			/*
			 * ture일 때 실행코드 블록
			 */
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");

		}
		System.out.println("smtt5");
		if (condition) {
			/*
			 * ture일 때 실행코드 블록
			 */
			System.out.println("stmt6");
			System.out.println("stmt7");

		} else {
			/*
			 * false일 때 실행코드 블록
			 */
			System.out.println("stmt8");
			System.out.println("stmt9");

		}
		System.out.println("stmt10");

		if (condition)
			System.out.println("stemt11");

		System.out.println("stemt12");

		if (condition) // 블록이 설정되지 않은 경우 if문의 첫 세미콜론까지 조건 적용, else도 그 다음 세미콜론까지 적용됨
			System.out.println("stmt13");
		else
			System.out.println("stmt14");

		System.out.println("stmt15");
		System.out.println("main block end");
		/*
		 * return - 현재 return 문을 실행하는 실행흐름을 실행흐름을 만들어 호출한 곳으로 반환한다. - return문 생략 가능
		 */

	}

}
