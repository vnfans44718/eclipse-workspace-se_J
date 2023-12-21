/**
 주차장에서 차객체를 생성할 클래스
 @author KIM
 @version 0.01
 */
public class Car {

	private String no; // 차량번호
	private int inTime; // 입차시간
	private int outTime;// 출차시간
	private int fee; // 주차요금

//메인 블록 내에 선언된 변수는 로컬변수

	/*
	 * 멤버 메쏘드[기능]
	 */
	/*
	 * 입차데이터(번호, 시간)대입	
	 */
	/**
	 * 입차시 데이터 대입 메소드
	 * @param no 차량번호
	 * @param inTime 입차시간
	 */
public Car() {
	// TODO Auto-generated constructor stub
}





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
	/**
	 * 주차요금계산
	 */

	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
		// this가 현재 객체의 번지를 의미
		return;
	}

	public Car(String no, int inTime, int outTime, int fee) {
		super();
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
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

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	
	/*
	 * Alt+Shift+s
	 */
	
	

}
