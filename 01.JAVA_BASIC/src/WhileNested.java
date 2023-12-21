
public class WhileNested {

	public static void main(String[] args) {
		/*
		 ***** 
		 ***** 
		 ***** 
		 ***** 
		 *****  
		 */

		int i = 0;
		while (i < 5) {
			System.out.print("*****");
			System.out.print("\n");
			i++;
		}

		System.out.println("-----------------------");
		i = 0;

		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[%d,%d]", "*", i, j);
				j++;
			}
			System.out.print("\n");
			i++;
		}

		/*
		 * 과제: 다음과같이 출력하세요(while)
		 */
		System.out.println("2.---------------------------------------");
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i!=j) {
					System.out.print("★");
				} else{
					System.out.print("☆");
				}
				j++;
			}
			System.out.println("\n");
			i++;

		}

		System.out.println("3.---------------------------------------");
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j <=i) {
					System.out.print("★");
				
				j++;
			}
			System.out.println("\n");
			i++;

		}

		System.out.println("4.---------------------------------------");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j <5-i) {
					System.out.print("★");
				
				j++;
			}
			System.out.println("\n");
			i++;

		}
		System.out.println("5.---------------------------------------");
		/*
		★★★★★
		☆★★★★
		☆☆★★★
		☆☆☆★★
		☆☆☆☆★
		 */
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i<=j) {
					System.out.print("★");
				} else{
					System.out.print("☆");
				}
				j++;
			}
			System.out.println("\n");
			i++;

		}

	}

}
