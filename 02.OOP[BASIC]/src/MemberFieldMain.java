
public class MemberFieldMain {

	public static void main(String[] args) {
		MemberField mf1;
		/*
		 MemberField 사용자 정의 타입 객체를 주소값을 저장할 참조변수 선언 
		 */
		mf1 = new MemberField();//이 순간에 번지 주소가 생성됨
		/*
		 MemberField 클래스(틀)로 객체를 생성한 후에 객체의 주소값 대입
		 mf1 참조변수에 대입(#100)
		 */

		
		/* 
		 * - 객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100를 사용해서 멤버필드에 데이터 대입
		 * - 객체의 멤버필드의 접근방법
		 *  - 참조변수.멤버필드이름=값
		 *  - 참조변수.멤버필드이름=값
		 */
		mf1.memberField1 = 1234;
		mf1.memberField2 = 3.2;
		mf1.memberField3 = true;
		mf1.memberField4 = 'A';
		mf1.memberField5 = "문자열";
		/*
		  
		 * 
		 mf1(#100) 주소에 있는 객체의 int 타입의 멤버필드 memberField1에 1234 값을 대입
		 mf1(#100) 주소에 있는 객체의 double 타입의 멤버필드 memberField2에 3.2 값을 대입
		 mf1(#100) 주소에 있는 객체의 boolean 타입의 멤버필드 memberField3에 true 값을 대입
		 mf1(#100) 주소에 있는 객체의 char 타입의 멤버필드 memberField4에 'A' 값을 대입
		 mf1(#100) 주소에 있는 객체의 String 타입의 멤버필드 memberField5에 "문자열" 값을 대입
		 */

		MemberField mf2 = new MemberField();

		mf2.memberField1 = 5678;
		mf2.memberField2 = 9.8;
		mf2.memberField3 = false;
		mf2.memberField4 = '가';
		mf2.memberField5 = "제임스딘";

		System.out.println("mf1의 주소값" + mf1);
		System.out.println(mf1.memberField1 + " " + 
		                   mf1.memberField2 + " " + 
				           mf1.memberField3 + " " + 
		                   mf1.memberField4 + " " + 
				           mf1.memberField5 + " ");
		/*
		 - 객체참조(주소) 변수가 가지고 있는 주소값 #100를 사용해서 멤버필드 값을 출력
		 - 객체의 멤버필드 접근 방법
		   1. System.out.println(mf1.memberField1);
		   2. int tempMember1(임시값) = mf1.MemberField1;
		      System.out.println(tempMember1);
		     mf1 객체의 int 타입의 멤버필드 memberField1 값을 출력
		     mf1 객체의 double 타입의 멤버필드 memberField2 값을 출력
		     mf1 객체의 boolean 타입의 멤버필드 memberField3 값을 출력
		     mf1 객체의 char 타입의 멤버필드 memberField4 값을 출력
		     mf1 객체의 String 타입의 멤버필드 memberField5 값을 출력
		   
		      
		 */
		
		
		/*
		 * mf1은 실제 번지값을 가지며 번지의 식별자(memberField)의 값을 찾아감
		 * 번지의 식별자는 구분되어야 함
		 * 저장하는 것이 시작 번지의 값이기 때문에 8바이트로 모두 동일
		 * 
		 */
		System.out.println("mf2의 주소값" + mf2);
		System.out.println(mf2.memberField1 + " " + 
		                   mf2.memberField2 + " " + 
				           mf2.memberField3 + " " + 
		                   mf2.memberField4 + " " + 
				           mf2.memberField5 + " ");

		/*
		 * 
		 * 
		 */

	}

}
