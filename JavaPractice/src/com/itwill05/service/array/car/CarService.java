package com.itwill05.service.array.car;

public class CarService {

	private Car[] carArray;

	private boolean isFull() {
		for (Car car : carArray) {
			if (car == null) {
				return false;

			}
		}
		return true;
	}

	private boolean isDuplicateNo(String no) {
		for (Car car : carArray) {
			if ((car != null) && (car.getNo().equals(no))) {
				return true;
			}
		}

		return false;
	}

	public CarService() {
		carArray = new Car[30];
	}

	public CarService(int count) {
		carArray = new Car[count];
	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 - 주차장이 만차이면 입차실패 - 차량번호중복체크
	 */

	public boolean ipCha(Car car) {
		boolean isSuccess = false;
		/*
		 * 1.주차장만차인지체크 2.차량번호 중복체크 3.입차
		 */

		/*for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				isSuccess = true;
			}
		}
		for (int i = 0; i < carArray.length; i++) {
			if ((carArray[i] != null) && (carArray[i].getNo() == car.getNo())) {
				isSuccess = false;
				break;
		
			}
		}
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = car;
				break;
			}
		
		}*/
		// * 1.주차장만차인지체크
		if (this.isFull())
			return isSuccess;
		// * 2.차량번호 중복체크
		if (isDuplicateNo(car.getNo())) {
			return isSuccess;
		}

		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				isSuccess = true;
				carArray[i] = car;
				break;
			}
		}

		return isSuccess;
	}
	/*
	 * 1. 전체차량출력 2. 주차구획수반환 3. 주차가능주차구획수반환 4. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환 5.
	 * 입차시간(8시이후)인자받아서 차객체배열 참조변수반환 6. 차량번호(7891번),출차시간(12시)인자로 받아서 출차"
	 */

	/*
	 * 6. 차량번호(1212번),출차시간(12시)인자로 받아서 출차후 출차객체반환
	 */
	public Car chulCha(String no, int outTime) {
		Car outCar = null;

		for (int i = 0; i < carArray.length; i++) {
			if ((carArray[i] != null) && (carArray[i].getNo() == no)) {

				carArray[i].setOutTime(outTime);
				outCar = carArray[i];
				carArray[i] = null;
				break;
			}
		}

		return outCar;
	}

	/*
	 * 5. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	 */
	public Car[] findByInTime(int inTime) {
		Car[] findCars = null;
		int count = 0;

		for (int i = 0; i < carArray.length; i++) {
			if ((carArray[i] != null) && (carArray[i].getInTime() > inTime)) {
				count++;
			}
		}
		findCars = new Car[count];

		for (int i = 0, j = 0; i < carArray.length; i++) {
			if ((carArray[i] != null) && (carArray[i].getInTime() > inTime)) {
				findCars[j] = carArray[i];
				j++;
			}

		}

		return findCars;
	}

	/*
	 * 4. 차량번호(2322번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar = null;

		for (Car car : carArray) {
			if (car.getNo().equals(no)) {
				findCar = car;
				System.out.println(findCar);
				break;
			}
		}

		return findCar;
	}

	/*
	 * 3. 주차가능주차구획수반환
	 */
	public int getAvailableParkingNumber() {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				count++;
			}
		}

		return count;
	}

	/*
	 * 2. 주차구획수반환
	 */
	public int getTotalParkingNumber() {

		return carArray.length;
	}

	/*
	 * 1. 전체차량출력
	 */
	public void print() {
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null)
				carArray[i].print();
		}
	}

}