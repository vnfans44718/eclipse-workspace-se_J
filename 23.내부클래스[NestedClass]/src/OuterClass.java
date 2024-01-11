
public class OuterClass {
	/******** OuterClass에서 InnerClass 클래스 객체 멤버필드로 사용 ********/
	private InnerClass ic = new InnerClass();
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field = 8888;

	/*
	 * 인스턴스 멤버메소드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}

	/******** OuterClass에서 InnerClass 클래스 객체 생성 사용 ********/

	public void outer_inner_class_use() {
		InnerClass ic = new InnerClass();
		//main과 달리 생략 가능
		
		ic.inner_member_field=8979;
		ic.inner_memebr_method();
		
	}
	
	
	/*
	 * 인스턴스 멤버클래스
	 * - 작성이유 :내부 클래스에서 외부 클래스의 멤버변수(메소드)접근을 손쉽게 하기 위해서 
	 */
	public class InnerClass {
		public int inner_member_field = 3333;

		public void inner_memebr_method() {
			System.out.println("InnerClass.inner_member_method()");
		}

		/********** 내부 클래스에서 외부클래스의 멤버변수(메소드)접근 *****/

		public void inner_outer_member_access() {
			/*			System.out.println(OuterClass.this.outer_member_field);
						OuterClass.this.outer_member_method();*/

			System.out.println(outer_member_field);
			outer_member_method();
			// 클래스.this 생략 가능, 알아서 찾음 이름이 똑같을 경우에는 명시해줘야함

		}

	}

}
