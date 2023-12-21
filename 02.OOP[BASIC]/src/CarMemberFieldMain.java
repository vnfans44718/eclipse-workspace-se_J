
public class CarMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 차량번호 1234번차량 12시 입차
		 */
		Car car1;   // Car : 사용자 정의 타입, 필요해서 만든 것
					// 차객체의 데이터를 저장할 Car 클래스 타입의 변수선언
					// Car 클래스를 사용해서 차객체를 생성한 후 차객체 데이터가 car1 변수에 대입되는 것
					// car1 객체는 로컬변수
		car1 = new Car();//객체를 찍어내는 것, 객체 생성 행위
		car1.no = "1234";// 차객체(car1)의 멤버필드 no에 "1234" 값 대입
		car1.inTime = 12;// 차객체(car1)의 멤버필드 inTime에 12 값 대입

		/*
		 * 2.car1 객체 16시 출차
		 */
		/*
		 * 2-1. 출차시간 대입
		 */
		car1.outTime = 16;// 차객체(car1)의 멤버필드 (outTime)에 16을 대입

		/*
		 * 2-2. 주차요금계산
		 */
		car1.fee = (car1.outTime - car1.inTime) * 1000;
		/*
		 * 차객체(car1)의 멤버필드 fee에 차객체의(car1)의 outTime, inTime 멤버 필드를 사용해서 
		 * 주차요금 계산 후 대입
		 */
		/*
		 * 2-3. 주차요금영수증출력
		 */
		System.out.println(car1.no + "\t" + car1.inTime + "\t" + car1.outTime + "\t" + car1.fee);
		System.out.printf("");
		System.out.printf("%s %s %s %s \n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("");
		System.out.printf("%7s %8d %8d ￦%4d \n",car1.no,car1.inTime,car1.outTime,car1.fee );
		
		
		
	}

}
