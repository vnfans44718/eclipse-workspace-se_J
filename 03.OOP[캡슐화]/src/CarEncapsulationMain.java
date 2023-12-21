
public class CarEncapsulationMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setIpchaData("1234", 10);
		Car car2 = new Car();
		car2.setIpchaData("5678", 12);
		Car car3 = new Car();
		car3.setIpchaData("7788", 14);

		System.out.println(">> 전체차량출력");
		car1.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		System.out.println("20시 현재 주차요금계산");
		car1.setOutTime(20);
		car1.calculateFee();
		
		car2.setOutTime(20);
		car2.calculateFee();
		
		car3.setOutTime(20);
		car3.calculateFee();
		
		System.out.println(">> 전체차량출력");
		car1.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		
		System.out.println("car1의 입차시간:"+car1.getInTime());
		
	}

}
