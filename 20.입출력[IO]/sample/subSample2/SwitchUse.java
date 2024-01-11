
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수 홀수판별
		 */
		int num = 34;

		switch (num % 2) {
		case 0:
			System.out.printf(" %d 는 짝수 입니다.\n", num);
			break;
		case 1:
			System.out.printf(" %d 는 홀수 입니다.\n", num);
			break;
		}

		/*
		 *  << 주사위 >>
		 * 1~6사이의 정수를 랜덤하게발생
		 */
		int diceNo = (int) (Math.random() * 6) + 1;

		switch (diceNo) {
		case 1:
			System.out.println("dice no:" + diceNo);
			break;
		case 2:
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			break;
		case 3:
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			break;
		case 4:
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			break;
		case 5:
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			break;
		case 6:
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			System.out.println("dice no:" + diceNo);
			break;

		}

		/*
		 * 입력되는 문자(열) 에따라 게임캐릭터 이동
		 */
		char direction = 's';

		switch (direction) {
		case 'a':
			System.out.println("move left~");
			break;
		case 'w':
			System.out.println("move up~");
			break;
		case 'd':
			System.out.println("move right~");
			break;
		case 'z':
			System.out.println("move down~");
			break;
		case 's':
			System.out.println("move rotate~");
			break;

		default:
			System.out.println("nothing ~~~");
			break;
		}
		/*
		 * Quiz:대소문자 구분없이 실행되도록 해보세요
		 */

	}

}
