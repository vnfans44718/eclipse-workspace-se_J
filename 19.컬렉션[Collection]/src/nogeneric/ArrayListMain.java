package nogeneric;
import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {

		Account acc1 = new Account(1111, "KIM", 56000, 0.9);
		Account acc2 = new Account(2222, "LEE", 58900, 0.5);
		Account acc3 = new Account(3333, "PARK", 78000, 0.4);
		Account acc4 = new Account(4444, "CHOI", 34000, 0.3);
		Account acc5 = new Account(5555, "SIM", 66000, 0.7);
		Account acc6 = new Account(6666, "HONG", 99000, 1.4);
		Account acc7 = new Account(7777, "KIM", 87600, 0.6);
		Account acc8 = new Account(8888, "SOO", 12300, 2.3);
		Account acc9 = new Account(9999, "MIN", 41200, 4.1);

		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("#size " + size);
		System.out.println("----------1. add [맨마지막 index에 객체저장]------");

		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		System.out.println("#size " + accountList.size());
		System.out.println(accountList);
		accountList.add(acc5);
		accountList.add(acc6);
		accountList.add(acc7);
		accountList.add(acc8);
		accountList.add(acc9);
		System.out.println("#size " + accountList.size());
		System.out.println(accountList);
		System.out.println();
		System.out.println("-----------2. add(index,element)[지정된 index에 객체저장]----------");
		accountList.add(1, new Account(1212, "NIM", 12340, 24));
		System.out.println(accountList);
		System.out.println();
		System.out.println("-----------3. set(index,element)[지정된 index에 객체저장]----------");
		accountList.set(accountList.size() - 1, new Account(9000, "LAST", 9000, 9.9));
		System.out.println(accountList);
		System.out.println();
		System.out.println("-----------4. get(index)[지정된 index에 객체참조변수반환]----------");
		Account getAccount = (Account) accountList.get(accountList.size() - 1);
		System.out.println(getAccount);
		System.out.println();
		System.out.println("-----------5. remove(index)[지정된 index에 객체 삭제 후 반환]----------");
		Account removeAccount = (Account) accountList.remove(3);
		System.out.println(removeAccount);
		System.out.println("----------1. 계좌전체출력----------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			tempAccount.print();
		}
		System.out.println();
		System.out.println("----------2. 계좌번호 6666번 한개 찾기----------");
		for (int i = 0; i < accountList.size(); i++) {
			if (((Account) (accountList.get(i))).getNo() == 6666) {
				System.out.println(accountList.get(i));
				break;
			}
		}

		System.out.println();
		System.out.println("----------3. 계좌주 이름 KIM 한개 찾기----------");
		for (Object objectAccount : accountList) {
			Account tempAccount = (Account) objectAccount;
			if (tempAccount.getOwner().equals("KIM")) {
				tempAccount.print();
			}
		}
		System.out.println();
		System.out.println("----------4. 계좌번호 6666번 계좌 한개 삭제----------");
		for (int i = 0; i < accountList.size(); i++) {
			if (((Account) (accountList.get(i))).getNo() == 6666) {
				Account tempAccount = (Account) accountList.remove(i);
				tempAccount.print();
			}

		}

		System.out.println();
		System.out.println("----------5. 계좌주 이름 KIM인 계좌 여러개 삭제----------");

		System.out.println("---------5.계좌주이름 KIM인계좌 여러개삭제------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KIM")) {
				Account removeAcc=(Account)accountList.remove(i);
				removeAcc.print();
				i--;
			}
		}
	}

}
