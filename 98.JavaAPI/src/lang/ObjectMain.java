package lang;

public class ObjectMain {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;

		String str1 = o1.toString();
		System.out.println(str1);
		String str2 = o2.toString();
		System.out.println(str2);

		/*
		 * 
		 public boolean equals(Object obj);
			- Indicates whether some other object is "equal to" this one.
		    - 주소가 동일한지비교
			 Parameters:
				obj - the reference object with which to compare.	
			 
			 Returns:
				true if this object is the same as the obj argument; false otherwise.
		 */
		
		
		if (o1.equals(o2)) {
			System.out.println("o1과 o2의 주소가 동일하다[equals]");
		}else {
			System.out.println("o1과 o2의 주소가 동일하지 않다[equals]");
		}
		//equals <-- 그 객체가 가진 주소값을 비교를 하는 것이 아니라 객체가 가진 시퀀스를 비교
		
		
		
		if (o1==o2) {
			System.out.println("o1과 o2의 주소가 동일하다[==]");
		}else {
			System.out.println("o1과 o2의 주소가 동일하지 않다[!=]");
		}
		
	

	}

}
