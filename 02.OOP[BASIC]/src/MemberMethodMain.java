
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1 = new MemberMethod();
		mm1.member1 = 213212;
		/*
		 * 멤버메쏘드 실행(호출)
		 *   - 형식: 참조(주소)변수.메쏘드이름();
		 *   - main실행흐름을 mm1주소에있는객체의 
		 *     method1이라는 이름의 메쏘드(실행코드블록)로보낸다.
		 *      
		 */
		mm1.method1();
		System.out.println("main stmt2");

		mm1.method2(2);
		System.out.println("main stmt3");
		mm1.method2(3);
		System.out.println("main stmt4");
		mm1.method3("안녕하세요!", 3);
		System.out.println("main stmt5");
		mm1.method3("어서오세요!", 3);
		System.out.println("main stmt6");

		/*
		 * 김경호 님 어서오세요
		 * 김경호 님 어서오세요 
		 * int로 선언한 로컬변수에 void 타입의 반환 값을 받을 수 없음
		 */
		String name = "김경호";
		String msg = "어서오세요!";
		int count = 2;

		mm1.method4(name, msg, count);
		System.out.println("main stmt7");
		mm1.method4("이효리", "광고받아요", 3);
		System.out.println("main block end jvm return");

	}
}
