
public class ForTest {

	public static void main(String[] args) {
		System.out.println("------------while----------");
		int k = 0; // 1.반복변수 초기화
		while (k < 10) { // 2.반복변수비교(반복조건)
			System.out.println("k=" + k); // 3.반복문
			k++; // 4.반복변수 증가(감소)
		}
		System.out.println("------------for i-----------");
		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("------------for i-----------");
		for (int i = 10; i > 0; i--) {
			System.out.println("i=" + i);
		}
		System.out.println(">>홀수만 출력{1 ~ 100}");
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.print("i" + " ");
			}
		}
		System.out.println();
		System.out.println(">>4의 배수만 출력[ 1 ~ 100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println(">>3과 4의 공배수만 출력 [ 1~ 100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
		/*
		 * break문
		 *  1. 반복문에서 사용
		 *  2. break문 이후의 반복코드를 실행하지 않는다
		 *  3. 다음 횟수의 반복블록도 실행하지 않는다 
		 * 
		 */

		System.out.println(">>3과 4의 최소공배수 출력[1 ~ 100](break 문)");
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d(%d== %d) \n", i, i % 3, i % 4);
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				break;//최소공배수가 나오면 멈춤
			}
		}
		/*
		 * continue문
		 *  1. 반복문에서 사용
		 *  2. continue문 이후의 반복코드를 실행하지 않는다
		 *  3. 다음 횟수의 반복블록 실행한다 
		 * 
		 */
		System.out.println(">>4의 배수가 아닌 수만 출력[1 ~ 100](continue 문)");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				// 4의 배수 조건을 만족하면 continue 문 실행
				// 현재 실행 중인 for 블록의 continue 문 이후 코드를 실행하지 않고 다음 횟수의 블록을 실행
				continue; 
				/*
				 0.반복 블록에서만 사용가능하다.
				 1.continue문이후의  for블록코드를 실행하지 않는다.
				 2.다음반복을 계속실행한다(continue)
				 */
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(">>홀수,짝수 합 [1~100]");

		int oddTot = 0;
		int evenTot = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddTot += i;
			} else {
				evenTot += i;
			}
		}
		System.out.println("짝수합:" + evenTot);
		System.out.println("홀수합:" + oddTot);
		System.out.println("문자출력");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if (c == 'z')
				continue;
			System.out.print(",");
		}

	}
}
