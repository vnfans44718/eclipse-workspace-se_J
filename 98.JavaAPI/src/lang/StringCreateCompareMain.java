package lang;

public class StringCreateCompareMain {

	public static void main(String[] args) {

		/*
		 * String 객체의 생성
		 * 1. 생성자 호출(명시적)
		 * 2. "" 으로 생성(암시적)
		 * 
		 */
//final 클래스는 변경 불가능
		//문자열 값의 해시코드가 생성이 되고 주소값의 해시코드가 생성되는게 아님
		String name1 = new String("KIM"); // 생성
		String name2 = new String("KIM"); // 생성
		String name3 = "KIM"; // 생성
		String name4 = "KIM"; // 할당 (변수설정)
		System.out.println(Integer.toHexString(name1.hashCode()));
		System.out.println(Integer.toHexString(name2.hashCode()));
		System.out.println(Integer.toHexString(name3.hashCode()));
		System.out.println(Integer.toHexString(name4.hashCode()));
		System.out.println(Integer.toHexString(System.identityHashCode(name1))); 
		System.out.println(Integer.toHexString(System.identityHashCode(name2))); 
		System.out.println(Integer.toHexString(System.identityHashCode(name3))); 
		System.out.println(Integer.toHexString(System.identityHashCode(name4))); 
		System.out.println(Integer.toHexString(System.identityHashCode("KIM"))); 
		// String 객체는 만들어지면 변경 불가능
		// name4를 변경하면 name3도 변경되기 때문에

		/*** String 객체주소비교 ***/
		if (name1 != name2) {
			System.out.println(">> name1과 name2의 주소는 다르다.");
		}
		if (name2 != name3) {
			System.out.println(">> name1과 name3의 주소는 다르다.");
		}
		
		if (name3 == name4) {
			System.out.println(">> name3과 name4의 주소는 같다.");
		}

		System.out.println("------String 객체의 값 비교------");
		/*
		 * Object의 equals의 경우 주소값을 비교하지만
		 * String의 equals는 배열의 시퀀스를 비교
		 */
		System.out.println("----------String 객체의 값 비교는 반드시 재정의된 equals 메소드를 사용하여야한다--------");
		if (name1.equals(name2)) {
			System.out.println("name1 객체의 멤버 문자열과 name2 객체의 문자열이 동일하다");
		}
		if (name1.equals(name3)) {
			System.out.println("name1 객체의 멤버 문자열과 name2 객체의 문자열이 동일하다");
		}
		if (name1.equals(name4)) {
			System.out.println("name1 객체의 멤버 문자열과 name2 객체의 문자열이 동일하다");
		}
		System.out.println("KIM".charAt(0));
		// "KIM"은 객체
		if ("KIM".equals(name4)) {
			System.out.println("\"KIM\" 객체의 문자열과 name4 객체의 문자열이 동일하다");
		}
		if (name1.equals("KIM")) {
			System.out.println("name1 객체의 문자열과 \"KIM\" 객체의 문자열이 동일하다");
		}

		/*
		 * 
		 */
		
		int unicodeGap = "aaa".compareTo("aaa");
		System.out.println(unicodeGap);
		unicodeGap = "aaa".compareTo("aab");		
		System.out.println(unicodeGap);
		
		unicodeGap = "aab".compareTo("aaa");		
		System.out.println(unicodeGap);
		
		String irum1="홍경호";
		String irum2="강경호";
		
		if (irum1.compareTo(irum2)>0) {
			System.out.println("irum1과 irum2 교환[오름차순]");
			
		}
		
	}
}