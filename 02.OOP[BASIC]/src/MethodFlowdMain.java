
public class MethodFlowdMain {

	public static void main(String[] args) {
		/*int a=1;
		int b=2;
		System.out.println(a+"+"+b+"연산수행");
		int sum1 = a+b;
		System.out.println("결과 1출력 "+sum1);

		int x=10;
		int y=20;
		System.out.println(x+"+"+b+" 연산수행");
		int sum2 =a+b;
		System.out.println("결과 1 출력:"+sum2);*/
		
		System.out.println("------add 메소드 호출(call,invoke)--------");		
		int sum1 = add(1,2);//add 블록으로 이동, add 블록 호출, add블록에서 계산 후 다시 반환받음
		// 반환 후 sum1의 값으로 치환됨 
		System.out.println("결과출력1 sum1:"+sum1);
		System.out.println("--------------");
		int sum2 = add(10,20);
		System.out.println("결과출력2 sum2:"+sum2);
		return;
	}
	
	public static int add(int a, int b ) {
		//객체 생성 없이 사용할 수 있는 메쏘드
		//클래스에 소속된 메쏘드
		// int a, int b는 로컬변수
		//void는 반환할 데이터의 타입을 의미, 실행한 다음에 약속한 데이터 타입
		System.out.println(a+"+"+b+"연산수행");
		int sum = a+b;
		System.out.println("결과 출력 "+sum);
		return sum;
		
	}

}
