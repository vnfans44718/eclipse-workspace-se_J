/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
		       	//1.반복변수(선언,초기화가능)
		       	//2.반복변수의 조건검사(논리형데이타)
		       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){
	       	
	       }
	
	*/
public class ForTest {

	public static void main(String[] args) {
		System.out.println("-------------while----------");
		int k = 0; // 1.반복변수 초기화
		while (k < 10) { // 2.반복변수비교(반복조건)
			System.out.println("k=" + k); // 3.반복문
			k++; // 4.반복변수 증가(감소)
		}
		System.out.println("------------for i 증가-------------");
		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("------------for i 감소-------------");
		for (int i = 10; i > 0; i--) {
			System.out.println("i=" + i);
		}
		System.out.println(">>홀수만 출력[1 ~ 100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(">>4의배수만 출력[1 ~ 100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(">>3과4의 공배수만 출력[1 ~ 100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		/*
		 * break문
		 *   1. 반복문에서 사용
		 *   2. break문이후의 반복코드를 실행하지않는다
		 *   3. 다음회수의 반복블록도 실행하지 않는다.
		 * 
		 */

		System.out.println(">>3과4의 최소공배수 출력[1 ~ 100](break)");
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d(%d == %d) \n", i, i % 3, i % 4);
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				break;
			}
		}
		/*
		 * continue문
		 *   1. 반복문에서 사용
		 *   2. continue 문이후의 반복코드를 실행하지않는다
		 *   3. 다음회수의 반복블록을 실행한다. 
		 */
		System.out.println(">>4의배수가아닌수만 출력[1 ~ 100](continue)");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				/*
				 4의배수조건을 만족하면 continue문이 실행되고
				 현재실행중인 for블록의 continue문이후코드를 실행하지않고
				 다음횟수의의 블록을실행한다.  
				 */
				
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
		System.out.println(">>홀수,짝수 합[1~100]");
		int oddTot=0;
		int evenTot=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				oddTot+=i;//oddTo=oddTot+i;
			}else {
				evenTot+=i;
			}
		}
		System.out.println("짝수합:"+evenTot);
		System.out.println("홀수합:"+oddTot);
		System.out.println("---문자출력[continue]---");
		for(char c='a';c<='z';c++) {
			System.out.print(c);
			if(c=='z')
				continue;
			System.out.print(",");
			
		}
		
	}

}












