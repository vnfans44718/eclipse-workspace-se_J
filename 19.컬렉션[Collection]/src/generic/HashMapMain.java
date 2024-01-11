package generic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<String, Car> carMap = new HashMap<String, Car>();
		System.out.println("# map size" + carMap.size());
		System.out.println(carMap);

		System.out.println("---------1.put----------");
		Car car1 = new Car("1111", 12);
		carMap.put(car1.getNo(), car1);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 14));
		carMap.put("4444", new Car("4444", 15));
		carMap.put("5555", new Car("5555", 16));

		System.out.println("# map size" + carMap.size());
		System.out.println(carMap);

		/*
		 * 키값은 중복 허용 안함
		 */

		carMap.put("3333", new Car("삼삼삼삼", 20));
		System.out.println("# map size" + carMap.size());
		System.out.println(carMap);
		System.out.println("---------2.get(key)----------");
		Car getCar = carMap.get("3333");
		getCar.print();
		System.out.println("---------3.remove(key)----------");
		Car removeCar = carMap.remove("3333");
		// 키 값이 존재하지 않으면 null 반환
		removeCar.print();

		System.out.println("# map size" + carMap.size());
		System.out.println(carMap);

		System.out.println("----------전체차량출력[EntrySet]---------");
		Set<Entry<String, Car>> carEntrySet = carMap.entrySet();
		System.out.println(carMap.entrySet());
		// Set carEntrySet=carMap.entrySet();

		for (Entry<String, Car> entry : carEntrySet) {
			String key = (String) entry.getKey();
			Car car = entry.getValue();
			car.print();
		}
		System.out.println("----------전체차량출력[Key Set]---------");
		Set<String> keySet = carMap.keySet();
		Car.headerPrint();
		for (String key : keySet) {
			System.out.println(key);
			Car car = carMap.get(key);
			car.print();
		}

	}

}
