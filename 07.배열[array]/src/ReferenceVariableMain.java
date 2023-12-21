
public class ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("----------reference variable assignment");

		Account account1 = new Account(1235, "김미진", 56000, 3.5);
		Account account2 = account1;
		Account account3 = new Account(9090, "김민섭", 89000, 5.9);
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);

		account1.print();
		account2.print();

		account1.setOwner("김마진");

		account1.print();
		account2.print();

		System.out.println("----------reference variable Compare(==,!=)");
		if (account1 == account2) {
			System.out.println("주소값이 동일하다-->" + account1 + "==" + account2);
		}
		if (account1 != account3) {
			System.out.println("주소값이 동일하지 않다-->" + account1 + "!=" + account3);
		}

		System.out.println("----------Reference Variable swap[주소값 교환]");
		Account a1 = new Account(1000, "일천님", 30000, 3.0);
		Account a2 = new Account(2000, "이천님", 80000, 8.8);
		System.out.println("---swap전---");
		a1.print();
		a2.print();

		// 참조변수에는 클래스의 타입 정보도 들어있음
		// 그래서 다른 클래스 타입의 주소값을 대입할 경우 오류가 날 수 있음
		// 주소값이 바뀌면 객체 자체가 바뀜

		Account tempAccount = a1;
		a1 = a2;
		a2 = tempAccount;

		System.out.println("---swap후---");
		a1.print();
		a2.print();

		System.out.println("----------Reference Variable swap[주소값 교환]");
		/*
		 * null:객체주소 리터럴
		  - 객체주소의 초기화의 용도로 사용
		  - null주소를 사용해서 멤버에 접근 시도시에는 NullPointerException 예외가 
		  발생하고 프로그램이 종료됨
		 */
		Account account = null;
		// 참조변수에 주소값이 아직 할당되지 않았을 경우 null로 초기화 해야함
		// 멤버필드의 경우 클래스의 주소값을 기본값으로 가지고 있음
		// 때문에 주소값이 null일 경우 에러가 남
		
		if (account==null) {
			account = new Account(9000, "구공이", 999000, 9.9);
		}
		
		account.print();

	}

}
