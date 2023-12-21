
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		int result = 0;

		result = a + b;
		System.out.println("a + b -->" + result);
		result = a - b;
		System.out.println("a - b -->" + result);
		result = a * b;
		System.out.println("a * b -->" + result);
		result = a / b;// ???
		System.out.println("a / b -->" + result);
		double dresult=a/b;
		System.out.println("double dresult=a/b -->"+dresult);
		dresult=(double)a/b;
		System.out.println("(double)a/b -->"+dresult);
		
		
		dresult=1/2;
		System.out.println("double dresult = 1/2 --> " + dresult);
		dresult=1/2.0;
		System.out.println("double dresult = 1/2.0 --> " + dresult);
		result = a % b;
		System.out.println("a % b --> " + result);

// int 나누기 int는 소수는 안 나옴

		int number = 16;
		result = number % 4;
		System.out.println("result변수값이 0이면 4의 배수:" + result);

		int year = 2023;
		result = year % 4;
		System.out.println("2023 % 4-->" + result);
		result = year % 100;
		System.out.println("2023 % 100-->" + result);
		result = year % 400;
		System.out.println("2023 % 400-->" + result);

		System.out.println("---------문자연산---------");
		char ca = 'A';
		char cz = 'Z';

		int numberOfAlphabet = cz - ca + 1;
		System.out.println("알파벳대문자수:" + numberOfAlphabet);

//   A가 제외되니 + 1

		int numberOfHangul = '힣' - '가' + 1;
		System.out.println("한글글자수:" + numberOfHangul);

		char hangul1 = '가';
		System.out.println(hangul1);
		char hangul2 = '가' + 2;
		System.out.println(hangul2);

		int kor, eng, math;
		kor = 45;
		eng = 89;
		math = 78;

		int tot = kor + eng + math;
		double avg = tot / 3.0;
		// 연산식 형 변화
		// - tot는 int로 이미 값을 준 상태, 항 중에 큰 타입 형태로 모든 변수의 타입을 변환, 모두 double로 변수 변환하여 계산
		// 3으로 나눌 경우에도 3.0.으로 실수 형태로 바꿔서 계산 안 그러면 결과값이 잘림
		System.out.printf("%6d %6d %6d %d %-6.2f\n", kor, eng, math, tot, avg);
		System.out.printf("%6d %6d %6d %d %f\n", kor, eng, math, tot, avg);

	}

}
