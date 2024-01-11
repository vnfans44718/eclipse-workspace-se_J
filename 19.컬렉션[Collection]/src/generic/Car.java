package generic;

import java.util.Objects;

public class Car {
	/*
	 * 1.멤버필드
	 */
	private String no; // 차량번호
	private int inTime; // 입차시간
	private int outTime;// 출차시간
	private int fee; // 주차요금
	/*
	 * 2.생성자메쏘드
	 */

	public Car() {
	}

	public Car(String no, int inTime) {

		this.no = no;
		this.inTime = inTime;
	}

	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	/*
	 * 3.멤버메쏘드
	 */

	/*
	 * 입차데이타(번호,시간)대입
	 */
	public void setIpChaData(String no, int inTime) {
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

	/*
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
		return;
	}

	/*아이디가 동일한 경우 같은 멤버이므로 중복되지 않도록 Member 클래스의 equals()와 hashCode()메서드를 재정의함*/

	/*
	차량번호가 동일한 경우 같은 차객체이므로 중복되지 않도록 Car 클래스의 equals()와 hashCode()메서드를 재정의함
	
	equals 메서드 구현 방법
	1. == 연산자를 사용해 입력이 자기 자신의 참조인지 확인한다.
	2. instanceof 연산자로 입력이 올바른 타입인지 확인한다.
	3. 입력을 올바른 타입으로 형변환한다.(2번에서 instanceof 검사를 했으니 100% 성공한다.)
	4. 입력 객체와 자기 자신의 대응되는 '핵심' 필드들이 모두 일치하는지 하나씩 검사한다.
	5. equals를 재정의할 땐 hashCode도 반드시 재정의한다
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof Car))
			return false;

		Car car = (Car) obj;

		return this.no.equals(car.no);

	}

	@Override
	public int hashCode() {
		/*
		no 필드의 해시코드를 반환
		만약 equals()메서드가 no 필드만을 기준으로 객체를 비교했다면,
		Objects.hash(no)을 반환하도록 구현해야 한다.
		동일한 no 필드를 가진 Car객체는 동일한 해시코드를 반환하게 된다.
		*/

		return Objects.hash(no);
		// number로 해쉬코드를 반환
	}
	//

	/*
	 * 차량정보헤더출력
	 */
	public static void headerPrint() {
		System.out.printf("---------------------------------------\n");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("---------------------------------------\n");
	}

	/*
	 * 차량정보출력
	 */
	public void print() {
		/*
		 * this
		 *   - self참조변수
		 *   - public void print() 
		 *     메쏘드가 호출될때 호출주체객체의 주소값을 가지는 변수
		 *   - this는 생략이가능  
		 */

		System.out.printf("%7s %8d %8d   ￦%4d\n", this.no, this.inTime, this.outTime, this.fee);
		return;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}

	/*
	 * alt+shift+s --> r
	 */

}
