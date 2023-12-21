import java.util.Scanner;

public class SwitchUseConsoleRead {

	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner (System.in);
		// scanner 키보드 객체
		// 키보드로부터 데이터를 입력받기 위해 실행흐름을 멈추고 대기
		// 사용자가 키보드를 사용해서 문자(숫자)를 입력한 후 엔터키를 타이핑하면 num 변수에 값이 대입
		
		System.out.print("수를입력하세요: ");
		int num = scanner.nextInt();
		
		
	
	 
	 switch (num % 2) {
	case 0:
		System.out.printf("%d 는 짝수 입니다.\n" ,num);
		break;

	case 1:
		System.out.printf("%d 는 홀수 입니다.\n" ,num);
		break;
	}
		
	 /*
		 * 입력되는 문자(열)에 따라 게임캐릭터 이동
		 */
	 System.out.print("캐릭터를 이동시키세요(a:left....,w:right...)");
	 String readStr= scanner.next();
		char direction = readStr.charAt(0);

		switch (direction) {
		case 'a':
			System.out.println("move left~~");
			break;
		case 'w':
			System.out.println("move up~~");
			break;
		case 'd':
			System.out.println("move right~~");
			break;
		case 'z':
			System.out.println("move down~~");
			break;
		case 's':
			System.out.println("move rotate~~");
			break;

		default:
			System.out.println("nothing~~~");
			break;
		}
	 
	 
	 
	 
	}

}
