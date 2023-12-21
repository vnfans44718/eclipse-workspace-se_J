/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소) 여러개의 모음타입 
      - 배열타입변수의 선언형식
           데이타타입[] 변수이름;  ex> int[] ia; , char[] ca;
	  - 사용: 
	       1.배열타입객체의생성	
	       -int[] a = new int[5<--멤버의 갯수];
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열[]형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int intType;
		intType = 90;
		int[] intArray;
		// int 배열타입, int랑 다름
		intArray = new int[5];
		// 멤버의 갯수만 정의할 수 있음0
		// 식별자도 없음
		System.out.println("intArray배열객체주소값:" + intArray);

		intArray[0] = 11;
		intArray[1] = 78;
		intArray[2] = 33;
		intArray[3] = 44;
		intArray[4] = 55;

		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);

		/*
		 * << 배열의 크기 >>
		 * 모든배열객체는 public int length;를 멤버변수로 가진다
		 * 배열의 크기를 가지고 있는 변수이다
		 * 변경 불가능(상수) 세팅되어 있는 값을 써야한다
		 */

		int length = intArray.length;
		// 코드 내의 리터럴은 변수여야 한다, 리터럴 x
		// 자동적으로 들어가 있음, 만들어진 변수
		// 멤버의 갯수가 들어가 있음
		/*
		 * 배열 생성 시에 들어간 숫자를 기반으로 length의 값이 정해짐
		 * 리터럴 값을 넣을 경우 숫자 수정시에 배열 객체 생성의 숫자와 for문의 숫자를 모두 수정해야하기 때문에
		 */
		// 원하는 배열의 사이즈만큼 계산도 가능
		System.out.println("intArray 객체의 멤버 필드 수" + length);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("--------기본형 1차원 배열--------");
		System.out.println("-------------int []--------------");
		int[] korArray = new int[10];
		korArray[0] = 89;
		korArray[1] = 56;
		korArray[2] = 78;
		korArray[3] = 89;
		korArray[4] = 89;
		korArray[5] = 89;
		korArray[6] = 89;
		korArray[7] = 89;
		korArray[8] = 89;
		korArray[9] = 89;

		int korTot = 0;
		for (int i = 0; i < korArray.length; i++) {
			korTot += korArray[i];

		}
		System.out.println("우리반 국어 총점:" + korTot);
		double korAvg = (double) korTot / korArray.length;
		/*(double)korTot 형 변환 작업
		 * 두개의 변수를 모두 double로 계산
		 */
		System.out.println("우리 반 국어평균:" + korAvg);

		System.out.println("-----------char[]---------");
		char[] ca = new char[6];
		ca[0] = 'H';
		ca[1] = 'e';
		ca[2] = 'l';
		ca[3] = 'l';
		ca[4] = 'o';
		ca[5] = '!';
		for (int i = 0; i < ca.length; i++) {
			System.out.println(ca[i] + " ");
		}
		System.out.println();

		double[] da = new double[5];
		da[0] = 1.2;
		da[1] = 3.2;
		da[2] = 7.4;
		da[3] = 8.2;
		da[4] = 3.4;
		for (int i = 0; i < da.length; i++) {
			System.out.print(da[i] + " ");
		}
		System.out.println();
		System.out.println("--------String[]--------");
		String[] nameArray = new String[5];
		// 리턴 타입은 하나의 값밖에 반환을 못하기 때문에 배열 객체(주소값) 자체를 반환하면 됨
		// 접근하는 값이 해당 변수의 타입
		

		nameArray[0] = "KIM";
		nameArray[1] = "LEE";
		nameArray[2] = "SIM";
		nameArray[3] = "CHOI";
		nameArray[4] = "LIM";
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		
		System.out.println("--------enhanced for-------");
		System.out.println(">> String[]");
		for (String name :nameArray) {
			System.out.println(name);
		}
		
		System.out.println(">> int[]");
		for (int tempInt:intArray) {
			System.out.println(tempInt);
		}
		
		
	}

}
