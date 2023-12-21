
public class Practice {

	public static void main(String[] args) {

		System.out.println(">> 1~100사이의 정수 중 4의 배수만 출력");
		int i = 1;
		while (i <= 100) {

			if (i % 4 == 0) {
				System.out.println(i);
			}
			i++;
		}

		i++;

		System.out.println();
		System.out.println("1900년부터 2023년까지 윤년인연도를 출력하세요");

		int year = 1900;

		while (year <= 2003) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 100 == 0) {
				System.out.println(year);
			}
			year++;
		}

		/*
		 * 누적
		 */
		System.out.println(">> 1~100 사이의 정수 합");
		i = 1;
		int tot = 0;// 누적합
		int oddTot = 0;// 홀수합
		int evenTot = 0;// 짝수합

		while (i <= 100) {
			tot = tot + i;
			if (i % 2 == 0) {
				evenTot = evenTot + i;
			} else {
				oddTot = oddTot + i;
			}
			i++;
		}

		System.out.println(tot);
		System.out.println(evenTot);
		System.out.println(oddTot);

		/* << Quiz >>
		 * - 영문소문자출력
		 *   a b c d e
		 *   f g h i j 
		 *   k l m n o 
		 *   p q r s t 
		 *   u v w x y 
		 *   z 
		 */

		char c2 = 'a';
		while (c2 <= 'z') {
			System.out.printf("%c", c2);

			if (((c2 - 'a') + 1) % 5 == 0) {
				System.out.print("\n");
			}
			c2++;
		}

		
		
		
		
		
		
	}

}
