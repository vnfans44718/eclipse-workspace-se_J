
public class ReferneceTypeArrayMain {

	public static void main(String[] args) {
		/*int a;
		int[] ia;
		Account account;
		*/

		Account[] accountArray = new Account[5];
		Account account1 = new Account(1, "KIM", 30000, 3.0);
		accountArray[0] = account1;
		accountArray[1] = new Account(2, "LEE", 5600, 3.8);
		accountArray[2] = new Account(3, "MIN", 7800, 7.8);
		accountArray[3] = new Account(4, "NIM", 8900, 8.8);
		accountArray[4] = new Account(5, "OIM", 9900, 4.6);

		accountArray[0].print();
		accountArray[1].print();
		accountArray[2].print();
		accountArray[3].print();
		accountArray[4].print();
		System.out.println("-------fot loop-------");
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}

		System.out.println("------enhanced for loop-----");
		for (Account account : accountArray) {
			account.print();
		}
		
		
	}

}
