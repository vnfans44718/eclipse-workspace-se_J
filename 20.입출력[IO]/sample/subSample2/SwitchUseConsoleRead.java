import java.util.Scanner;

public class SwitchUseConsoleRead {

	public static void main(String[] args) {
		/*
		 * 키보드로부터 수를 입력받아서 짝수 홀수판별
		 */
		Scanner scanner= new Scanner(System.in);
		/*
		 * - 키보드로부터 데이타를 입력받기위해 실행흐름을 멈추고 대기
		 * - 사용자가 키보드를 사용해서 문자(숫자)를 입력한후 엔터키를타입핑하면 num변수에
		 *   입력한 값이 대입된다.
		 */
		System.out.print(">>> 수를입력하세요: ");
		int num = scanner.nextInt();
		
		switch (num % 2) {
		case 0:
			System.out.printf(" %d 는 짝수 입니다.\n",num);
			break;
		case 1:
			System.out.printf(" %d 는 홀수 입니다.\n",num);
			break;
		}
		
		/*
		 * 입력되는 문자(열) 에따라 게임캐릭터 이동
		 */
		
		System.out.print(">>> 캐릭터를 이동시키세요(a:left,w:right...):");
		String readStr= scanner.next();
		char direction = readStr.charAt(0);
		
		

		switch (direction) {
		case 'a':
		case 'A':	
			System.out.println("move left~");
			break;
		case 'w':
		case 'W':
			System.out.println("move up~");
			break;
		case 'd':
		case 'D':
			System.out.println("move right~");
			break;
		case 'z':
		case 'Z':
			System.out.println("move down~");
			break;
		case 's':
		case 'S':
			System.out.println("move rotate~");
			break;

		default:
			System.out.println("nothing ~~~");
			break;
		}
		
		
	}

}
