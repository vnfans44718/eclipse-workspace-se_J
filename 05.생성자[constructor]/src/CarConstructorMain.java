
public class CarConstructorMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setIpchaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.print();

		Car car2 = new Car();
		car2.setIpchaData("4567", 13);
		car2.setOutTime(15);
		car2.calculateFee();
		car2.print();

		System.out.println("******오늘주차장이용차량출력******");
		Car cara = new Car("1234", 1, 2, 1000);
		Car carb = new Car("4567", 12, 17, 5000);
		Car carc = new Car("3478", 6, 9, 3000);
		Car card = new Car("2398", 4, 7, 4000);

		cara.headerPrint();
		cara.print();
		carb.print();
		carc.print();
		card.print();
		
		
	}

}
