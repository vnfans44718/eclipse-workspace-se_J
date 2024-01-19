package com.itwill05.service.collection.car.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.itwill05.service.collection.student.map.Student;

public class CarServiceHashMap {

	private Map<String, Map<String, Car>> carMap;
	// A,B,C 주차장 구획수
	private Map<String, Integer> parkingLotNumberMap;

	public CarServiceHashMap() {
		this(new int[] { 10, 12, 34 });
	}

	public CarServiceHashMap(int[] numbers) {
		carMap = new HashMap<String, Map<String, Car>>();
		carMap.put("A", new HashMap<String, Car>());
		carMap.put("B", new HashMap<String, Car>());
		carMap.put("C", new HashMap<String, Car>());

		parkingLotNumberMap = new HashMap<String, Integer>();
		parkingLotNumberMap.put("A", numbers[0]);
		parkingLotNumberMap.put("B", numbers[1]);
		parkingLotNumberMap.put("C", numbers[2]);

		carMap.get("A").put("4567", new Car("4567", 4));
		carMap.get("A").put("2312", new Car("2312", 12));
		carMap.get("A").put("3378", new Car("3378", 6));
		carMap.get("A").put("8972", new Car("8972", 9));
		carMap.get("A").put("9344", new Car("9344", 8));
		carMap.get("B").put("0452", new Car("0452", 7));
		carMap.get("B").put("3415", new Car("3415", 8));
		carMap.get("B").put("3398", new Car("3398", 9));
		carMap.get("C").put("1567", new Car("1567", 10));
		carMap.get("C").put("3865", new Car("3865", 2));
		carMap.get("C").put("6804", new Car("6804", 11));

	}

	/*
	 * 1. 차객체인자로받아서  A(B,C)주차장 입차후 성공실패여부반환 
	 *   - 주차장이 만차 이거나 번호중복이면 입차실패
	 */
	public boolean ipCha(Car inCar, String sectorName) {
		boolean isSuccess = false;
		Set<Entry<String, Car>> newCar = carMap.get(sectorName).entrySet();

		for (Entry<String, Car> entry : newCar) {

			if (entry.getKey().contains(inCar.getNo()))
				return isSuccess = false;
		}

		carMap.get(sectorName).put(inCar.getNo(), inCar);

		return isSuccess;

		/*while(newCar.hasNext())
		
		{
				Entry<String,Car> tempNewCar = newCar.next();
				String temSectorName = tempNewCar.getKey();
				if (tempNewCar.getKey().equals(inCar.getNo())) {
					return isSuccess;
				}
				count++;
				if (count<) {
					
				}
				
				
				
				
			}
		
		return isSuccess;*/
	}

	/*
	 * 2. 주차장 전체차량출력
	 */
	public void print() {
		Car.headerPrint();
		for (String sectorName : carMap.keySet()) {
			Map<String, Car> sectorCarMap = carMap.get(sectorName);
			for (String carNo : sectorCarMap.keySet()) {
				sectorCarMap.get(carNo).print();

			}
		}
	}

	/*
	 * 3. A(B,C)주차장 차량출력
	 */
	public void print(String sectorName) {

		Set<Entry<String, Car>> newCar = carMap.get(sectorName).entrySet();
		System.out.println("---------------" + sectorName + "-------------");
		for (Entry<String, Car> entry : newCar) {
			entry.getValue().print();

		}

	}

	/*
	 * 4. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {

		Set<Entry<String, Map<String, Car>>> findCar = carMap.entrySet();

		for (Entry<String, Map<String, Car>> entry : findCar) {

			if (entry.getValue().containsKey(no)) {
				Car findByNo = entry.getValue().get(no);
				return findByNo;
			}

		}
		return null;
	}

	/*
	 * 5. 차량번호(4567번)와 주차장섹터이름(A,B,C) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no, String sectorName) {
		Set<Entry<String, Car>> newCar = carMap.get(sectorName).entrySet();
		for (Entry<String, Car> entry : newCar) {
			if (entry.getKey().equals(no)) {
				Car findByNo = entry.getValue();
				return findByNo;
			}

		}

		return null;
	}

	/*
	 * 6. 입차시간(8시이후)인자받아서 ArrayList(차객체리스트) 참조변수반환(전체주차장)
	 */
	public List<Car> findByInTime(int inTime) {
		List<Car> findCars = new ArrayList<Car>();
		Iterator<Entry<String, Map<String, Car>>> entryCar = carMap.entrySet().iterator();

		while (entryCar.hasNext()) {
			Entry<String, Map<String, Car>> entry = entryCar.next();
			Set<Entry<String, Car>> car = entry.getValue().entrySet();
			for (Entry<String, Car> entry2 : car) {
				if (entry2.getValue().getInTime() > inTime) {
					findCars.add(entry2.getValue());

				}
			}
		}
		return findCars;
	}

	



	/*
	 * 7. 입차시간(8시이후)인자받아서 주차섹터별 ArrayList(차객체리스트) 참조변수반환(전체주차장)
	 */
	public Map<String, Map<String, Car>> findByInTimeByParkingSector(int inTime) {
		Map<String, Map<String, Car>> findCars = new HashMap<String, Map<String, Car>>();
		Iterator<Entry<String, Map<String, Car>>> newCar = carMap.entrySet().iterator();
		
		while (newCar.hasNext()) {
			Entry<String, Map<String, Car>> findCarList = newCar.next();
			 Map<String, Car> findCar = findCarList.getValue();
			System.out.println("-------"+findCarList.getKey()+"------------");
			Set<Entry<String, Car>> car = findCar.entrySet();
			for (Entry<String, Car> entry2 : car) {
				if (entry2.getValue().getInTime() > inTime) {
					findCars.put(findCar.get(newCar), findCar);

				}
			}
			
			
		}
		
		
		return findCars;
	}

	/*
	 * 8. 차량번호(7891번),출차시간(12시)인자로 받아서 출차
	 */
	public Car chulCha(String no, int outTime) {
		Car removeCar = null;
		return removeCar;
	}

	/*
	 * 9. 주차섹터이름(A,B,C),차량번호(7891번),출차시간(12시)인자로 받아서 출차
	 */
	public Car chulCha(String no, int outTime, String sectorName) {
		Car removeCar = null;
		return removeCar;
	}

	/*
	 * 10. 주차전체구획수반환 
	 */
	public int getParkingLotCount() {
		return 0;
	}

	/*
	  11.전체주차가능주차구획수반환 
	 */
	public int getAvailableParkingLotCount() {
		return 0;
	}

	/*
	  12.A(B,C) 주차섹터의 주차가능주차구획수반환 
	 */
	public int getAvailableSectorParkingLotCount(String sectorName) {
		return 0;
	}

	/*
	  13. 주차섹터별 주차가능주차구획수반환 
	 */
	public Map<String, Integer> getAvailableParkingLotPerSectorCount() {
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		return countMap;
	}
}