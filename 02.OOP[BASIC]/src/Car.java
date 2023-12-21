
/*
 *  주차장에서 차객체를 생성할 클래스(틀)
 */
/*
 * 
 *  - 구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(매개변수목록){
 *           -매개변수: 나를 호출한놈이 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *              void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */
/*
	 * 클래스의 구성요소
	 * 	1.멤버필드(변수)[속성]: 차객체의 속성데이타를 저장할변수
	 *  2.멤버메쏘드[기능]    : 차객체가 외부에제공하는기능
	 */

public class Car {
// Car 클래스 틀을 만듦
// 클래스 밑에 멤버 변수 4개 선언
	String no; // 차량번호
	int inTime; // 입차시간
	int outTime;// 출차시간
	int fee; // 주차요금

//메인 블록 내에 선언된 변수는 로컬변수

	/*
	 * 멤버 메쏘드[기능]
	 */
	/*
	 * 입차데이터(번호, 시간)대입	
	 */

	public void setIpchaData(String no, int inTime)// 매개변수, 호출될때 매개변수가 선언된다
	{
		this.no = no;
		this.inTime = inTime;
		return;

	}

	/*
	 * 출차시간 멤버필드outTime에 대입
	 */

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	/* 주차요금[계산]
	*/

	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
		// this가 현재 객체의 번지를 의미
		return;
	}

	/*
	 * 차량정보 헤더값 출력
	 */
	public void headerPrint() {
		System.out.printf("--------------------------------------\n");
		System.out.printf("%s %s %s %s \n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("--------------------------------------\n");
		
	}

	/*
	 * 차량정보출력
	 */
	public void print() {
		/* this
		 * -self 참조변수
		 * -public void print() 메쏘드가 실행될때 호출객체의 주소값을 가지는 변수
		 * -this는 생략이 가능
		 */

		System.out.printf("");
		System.out.printf("%7s %8d %8d ￦%4d \n", this.no, this.inTime, this.outTime, this.fee);

		return;
	}

}
