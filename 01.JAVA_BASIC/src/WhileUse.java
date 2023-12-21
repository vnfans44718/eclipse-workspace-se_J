
public class WhileUse {

	public static void main(String[] args) {

		/*
		 * 10회 반복 실행
		 */
		System.out.println("-----------i=0------------");
		int i = 0;// 반복횟수를 저장할 반복변수
		while (i < 10) {

			System.out.println("stmt:i ---> " + i);
			i++;
		}

		System.out.println("----------i=1-------------");
		i = 1;// while문은 중복으로 변수 선언이 안되서 변수를 초기화만 해줘야됨
		while (i <= 10) {
			System.out.println("stmt:i-->" + i);
			i++;
		}
		i = 1;
		System.out.println(">>1~10 사이의 정수출력");
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();

		System.out.println(">> 1~10사이의 정수 중 홀수만 출력");
		i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;

			System.out.println(">> 1~100사이의 정수 중 4의 배수만 출력");
			i = 1;
			while (i <= 100) {
				if (i % 4 == 0) {
					System.out.print(i + "  ");// print의 경우 공백을 삽입하지 않으면 바로 옆에 붙어서 나오게 됨
				}
				i++;
			}
			System.out.println();
			System.out.println("1900년부터 2023년까지 윤년인연도를 출력하세요");
			int year = 1900;
			while (year <= 2023) {
				if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
					System.out.print(year + " ");
				}
				year++;
			}

			/*
			 * 누적
			 */
			System.out.println(">> 1~100 사이의 정수 합");
			i = 1;
			int tot=0;//누적합
			int oddTot=0;//홀수합
			int evenTot=0;//짝수합
			
			while (i<=100) {
				tot+=i;//tot=tot+i;(연산후 대입 연산자)
				if (i%2==0) {
					evenTot+=i;//eventot=eventot+i
				} else {
					oddTot+=i;
				}
				i++;
			}
System.out.println("1~100 사이의 정수합: "+tot);
System.out.println("1~100 사이의 홀수합: "+oddTot);
System.out.println("1~100 사이의 짝수합: "+evenTot);
		}

	}
}