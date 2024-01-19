package com.itwill05.service.collection.car.map;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class CarServiceHashMapMain {

	public static void main(String[] args) {
		
		CarServiceHashMap carService=
				new CarServiceHashMap();
		/*
		 * 1. 차객체인자로받아서  A(B,C)주차장 입차후 성공실패여부반환 
		 *   - 주차장이 만차 이거나 번호중복이면 입차실패*/
		
		Car newCar = new Car("4566",11);

		boolean isSuccess =carService.ipCha(newCar, "A");
		
		if (!isSuccess) {
			System.out.println("만차이거나 차가 중복되었습니다.");
		}
		
		
		
		System.out.println("2. 주차장 전체차량출력");
		/* 2. 주차장 전체차량출력*/
		carService.print();
		
		System.out.println("3. A(B,C)주차장 차량출력");
		/* 3. A(B,C)주차장 차량출력
		 */
		carService.print("A");
		
		
		System.out.println("4.차량번호(4567번) 인자받아서 차객체한대 참조변수반환");
		/* 4.차량번호(4567번) 인자받아서 차객체한대 참조변수반환*/
		
		Car findByNo =carService.findByNo("0452");
		findByNo.print();
		
		System.out.println("5. 차량번호(4567번)와 주차장섹터이름(A,B,C) 인자받아서 차객체한대 참조변수반환");
		 /* 5. 차량번호(4567번)와 주차장섹터이름(A,B,C) 인자받아서 차객체한대 참조변수반환
		 */
		Car findByNo2 = carService.findByNo("4567", "A");
		findByNo2.print();
		
		System.out.println("6. 입차시간(8시이후)인자받아서 ArrayList(차객체리스트) 참조변수반환(전체주차장)");
		 /* 6. 입차시간(8시이후)인자받아서 ArrayList(차객체리스트) 참조변수반환(전체주차장)
		 */
		List<Car> findCars = carService.findByInTime(8);
	    for (int i = 0; i < findCars.size(); i++) {
	    	findCars.get(i).print();
		}
 
		 /* 7. 입차시간(8시이후)인자받아서 주차섹터별 ArrayList(차객체리스트) 참조변수반환(전체주차장)
		 */
	    
	    
	    /*8. 차량번호(7891번),출차시간(12시)인자로 받아서 출차  
		 */
	    /* 9. 주차섹터이름(A,B,C),차량번호(7891번),출차시간(12시)인자로 받아서 출차
		 * 10. 주차전체구획수반환 
		 * 11.전체주차가능주차구획수반환
		 * 12.A(B,C) 주차섹터의 주차가능주차구획수반환
		 * 13. 주차섹터별 주차가능주차구획수반환   
		 */
		
		
		System.out.println("--------- 전체차량출력 --------------");
		carService.print();

	}

}