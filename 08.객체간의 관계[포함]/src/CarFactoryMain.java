
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차 공장
		 */

		/*	Engine X6Engine = new Engine();
			X6Engine.type = "A";
			X6Engine.cc = 5000;
		
			Car Car1 = new Car();
			Car1.no = 1234;
			Car1.model = "X6";
			Car1.engine = X6Engine;
		
			System.out.println(Car1.no + "\t" +
					Car1.model + "\t" + 
					Car1.engine.type + "\t" + 
					Car1.engine.cc);
		*/

		Engine x6Engine = new Engine("A", 5000);
		Car car1 = new Car();
		car1.setNo(1234);
		car1.setModel("X6");
		car1.setEngine(x6Engine);
		car1.print();

		System.out.println("----------차량엔진검사---------");
		Car gumsaCar = car1;
		// car1의 객체가 gumsaCar 틀에 대입-->주소값 생성
		Engine returnEngine = gumsaCar.getEngine();
		// 엔진의 주소값이 호출되어 치환
		// returnEngine의 경우 아직 주소값이 없이 Engine 클래스의 틀만 생성된 상태
		returnEngine.print();

		Car car2 = new Car(5678, "XC90", new Engine("S", 4900));
		// engine 타입의 객체 생성은 new 엔진과 동일
		System.out.println("----------차량엔진검사---------");
		car2.print();

	}

}
