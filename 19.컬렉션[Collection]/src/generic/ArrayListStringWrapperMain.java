package generic;

import java.util.ArrayList;

public class ArrayListStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("------------------String---------------");
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println("-----------------1.add---------------");
		nameList.add("KIM");
		nameList.add("JIM");
		nameList.add("HIM");
		nameList.add("AIM");
		nameList.add(new String("TIM"));
		nameList.add("BIM");
		nameList.add("CIM");
		nameList.add("SIM");
		System.out.println("# size:" + nameList.size());
		System.out.println(nameList);
		System.out.println("-----------------2.get---------------");
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(6));
		System.out.println("-----------------3.remove(index)---------------");
		System.out.println(nameList.remove(0));
		System.out.println(nameList);

		System.out.println("-----------------4.remove(element)---------------");
		System.out.println(nameList.remove("SIM"));
		// String 객체에 equals가 이미 재정의 되어있어서 가능
		// 0번부터 SIM을 찾다가 나오면 삭제하고 끝냄
		System.out.println(nameList);

		System.out.println("------------------Wrapper---------------");
		ArrayList<Integer> scoreList = new ArrayList<Integer>();

		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(78);
		scoreList.add(89);
		scoreList.add(99);
		scoreList.add(new Integer(100));
		System.out.println(scoreList);
		System.out.println("-----------1.get----------");
		int getScore = scoreList.get(2);
		System.out.println(getScore);
		System.out.println(scoreList.get(3));
		System.out.println("-----------2.set----------");
		scoreList.set(2, 98);
		System.out.println(scoreList);
		System.out.println("-----------3.remove----------");
		scoreList.remove(5);
		// index로 찾음 --> 객체를 반환
		// 객체로 찾으면 true를 반환
		// remove는 인덱스와 객체 모두 집어넣을 수 있음
		System.out.println(scoreList);
		scoreList.remove(new Integer(100));
		// 100이라는 값을 가진 객체를 찾아냄
		// Object 객체로 찾아냄
		System.out.println(scoreList);
		//

	}

}
