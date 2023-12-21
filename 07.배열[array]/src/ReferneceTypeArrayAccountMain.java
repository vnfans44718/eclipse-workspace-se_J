import java.util.Iterator;

public class ReferneceTypeArrayAccountMain {

	public static void main(String[] args) {
		System.out.println("----------------{}를 이용한 배열객체");
		Account acc1 = new Account(1111, "LEE,", 56000, 2.8);
		/*Account[] accounts = new Account[9];
		accounts[0] = acc1;*/

		Account[] accounts = { acc1, new Account(2222, "KIM", 99000, 3.5), new Account(3333, "PARK", 96500, 3.5),
				new Account(4444, "LEE", 34200, 3.5), new Account(5555, "CHOI", 78300, 3.5),
				new Account(6666, "SIM", 61200, 3.5), new Account(7777, "SOO", 56000, 3.5),
				new Account(8888, "MIN", 23400, 3.5), new Account(9999, "JANG", 12600, 3.5),

		};
		
		
		System.out.println("1.은행 총 계좌수" + accounts.length);
		System.out.println("2.은행계좌 전체출력");
		accounts[0].headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts);
			System.out.println(accounts[i]);
		}

		System.out.println("3.은행계좌 총 잔고");
		int totBalance = 0;

		for (int i = 0; i < accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}

		System.out.println(">>" + totBalance);
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 3333) {
				accounts[i].print();
				break;
			}
		}

		System.out.println("5.은행 계좌들중에서 계좌잔고 500000원이상인 VIP계좌 여러개 찾아서 출력[enhanced for]");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 500000) {
				accounts[i].print();
			}
		}
		System.out.println("6.은행 계좌들중에서 계좌이율 5.0 이상인 계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= 5.0) {
				accounts[i].print();
			}
		}

		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		for (int i = 0; i < accounts.length; i++) {
			String tempOwner = accounts[i].getOwner();
			if (tempOwner.equals("KIM")) {
				accounts[i].print();
			}
		}

		System.out.println("8.9999번계좌 3000원출금");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 9999) {

				int b= accounts[i].getBalance();
				System.out.println(b);
				accounts[i].print();
				accounts[i].withdraw(3000);
				accounts[i].print();
				break;
			}
			
			
		}

		System.out.println("9.계좌잔고순으로 오름[내림]차순정렬");
		System.out.println("정렬 전");
		for (int i = 0; i < accounts.length; i++) {
			/*System.out.println(accounts[i].print());
			 * void 이기 때문에 에러, 값이 없음
			 */
			System.out.println(accounts[i]);
		}

		System.out.println("정렬 후[오름차순]");
		for (int i = 0; i < accounts.length - 1; i++) {
			// 1회 정렬 --> 8번 실행(i=0,1,2,3,4,5,6,7)
			// boolean isSwap = false;
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
					// isSwap = true;
				}
				/*accounts[j].print();*/
			}
			/*if (!isSwap) {
				System.out.println("isSwap" + isSwap);
			
			} else {
				System.out.println("isSwap!" + isSwap);
			}*/
			accounts[i].print();
		}
		

		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");

		System.out.println("10.5555계좌한개 이율을 9.9으로변경");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 5555) {
				accounts[i].setIyul(9.9);
				accounts[i].print();
				break;
			}
		}

		System.out.println("11.VIP계좌(잔고500000원이상)여러개 잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 500000) {
				accounts[i].deposit(50);
				accounts[i].print();

			}

		}

	}

}
