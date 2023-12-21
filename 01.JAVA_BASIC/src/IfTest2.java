
public class IfTest2 {

	public static void main(String[] args) {
		int x = 21;
		int y = 30;

		if (x > y) {
			System.out.println("x > y -->true");

		} else {
			System.out.println("x > y -->false");

		}
		if (x < y) {
			System.out.println("x < y -->true");

		} else {
			System.out.println("x < y -->false");

		}
		if (x == y) {
			System.out.println("x == y -->true");

		}
		if (x != y) {
			System.out.println("x != y -->true");
		}
		System.out.println("-----변수의범위(scope)----");
		/*
		 * 지역변수 - 클래스 블록을 제외한 블록 안에서 선언된 변수 - 지역변수의 범위(선언된 블록 안에서만 사용가능)
		 * class 블록 안에 선언된 변수는 전역변수, 멤버변수
		 */
		int kor = 98;
		if (kor >= 90) {
			char grade = 'A';
			String msg = "참 잘했어요.";
			System.out.println("kor -->" + kor);
			System.out.println("grade -->" + grade);
			System.out.println("msg -->" + msg);
		}
//		System.out.println("kor -->"+kor);
//		System.out.println("grade -->"+grade);
//		System.out.println("msg -->"+msg);
//      변수 선언 범위 밖에 있기 때문에 컴파일 에러	
//      지역 변수가 아닌 변수는 로컬 변수와 다른 색상으로 표시됨 ( 파란색, 로컬변수 갈색)

	}

}
