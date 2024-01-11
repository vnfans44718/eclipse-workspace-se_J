package generic;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// <>기본형(ex. int) 못 들어감, 기본 Object
		// equals 메소드는 Object에서 주소값을 비교
		// set은 인덱스가 없다

		Car car1 = new Car("1111", 1);
		Car car2 = new Car("2222", 2);
		Car car3 = new Car("3333", 3);
		Car car4 = new Car("4444", 4);
		Car car5 = new Car("5555", 5);

		HashSet<Car> carSet = new HashSet<Car>();
		System.out.println("# set size :" + carSet.size());
		System.out.println(carSet);

		System.out.println("------------1.add--------------");

		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		carSet.add(car5);
		System.out.println("# set size :" + carSet.size());
		System.out.println(carSet);
		System.out.println("------------2.add[중복]--------------");
		/*
		 * Element 의 hashCode와 equals 메소드 호출해서 중복을 체크한다.
		 * 
		 */
		System.out.println("equals-->"+car3.equals(new Car("3333",11)));
		/*
		 * Set 객체는 hashCode 값이 동일하면
		 * equals 메소드를 호출해서 동일성 여부 판단
		 * 
		 */
		
		
		boolean isAdd = carSet.add(new Car("3333",11));
		System.out.println("추가여부: " + isAdd);
		//car3는 이미 있어서 추가 안됨
		System.out.println("# set size :" + carSet.size());
		System.out.println(carSet);

		System.out.println("------------3.remove[element]--------------");
		boolean isRemove = carSet.remove(new Car("3333"
				,12));
		System.out.println("삭제여부" + isRemove);
		System.out.println("# set size: " + carSet.size());
		System.out.println(carSet);
		System.out.println("----------------전체 출력-----------------");
		Car.headerPrint();
		for (Car car : carSet) {
			car.print();
		}

	}

}
