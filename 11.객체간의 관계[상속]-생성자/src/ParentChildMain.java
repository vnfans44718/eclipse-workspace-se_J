class Parent extends Object {
	private int member1;
	private int member2;

	public Parent() {
		/*
		 클래스 생성자 첫번째라인에서는 부모클래스의 생성자가반드시호출되어야한다.
		 부모클래스 생성자 호출을 생략할시에는 부모클래스의 디폴트생성자가 자동으로 호출된다.
		 */
		super();// Object클래스--> Object()기본생성자호출
		System.out.println("Object()기본생성자호출");
		System.out.println("Parent()기본생성자호출");
	}

	public Parent(int member1, int member2) {
		/*
		 클래스 생성자 첫번째라인에서는 부모클래스의 생성자가반드시호출되어야한다.
		 부모클래스 생성자 호출을 생략할시에는 부모클래스의 디폴트생성자가 자동으로 호출된다.
		 */
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("Object()기본생성자호출");
		System.out.println("Parent(int member1,int member2)생성자호출");
	}

	public void method1() {
		System.out.println("Parent.method1()");
	}

	public void method2() {
		System.out.println("Parent.method2()");
	}

	public void print() {
		System.out.print(this.member1 + "\t" + this.member2 + "\t");
	}

	public int getMember1() {
		return member1;
	}

	public void setMember1(int member1) {
		this.member1 = member1;
	}

	public int getMember2() {
		return member2;
	}

	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
}

class Child extends Parent {
	private int member3;

	public Child() {
		/*
		 클래스 생성자 첫번째라인에서는 부모클래스의 생성자가반드시호출되어야한다.
		 부모클래스 생성자 호출을 생략할시에는 부모클래스의 디폴트생성자가 자동으로 호출된다.
		 */
		super();// Parent클래스 --> Parent()기본생성자
		System.out.println("Child()기본생성자호출");
	}

	public Child(int member1, int member2, int member3) {
		/*
		 클래스 생성자 첫번째라인에서는 부모클래스의 생성자가반드시호출되어야한다.
		 부모클래스 생성자 호출을 생략할시에는 부모클래스의 디폴트생성자가 자동으로 호출된다.
		 */
		/*
		 * 매개변수를 가진 부모의 생성자를 호출할수있다.
		 * 매개변수를 가진 부모의 생성자를 호출할려면 명시적으로 호출코드를 기술하여야한다.
		 */
		
		/*****case1********/
		super(member1, member2);// Parent클래스 -->Parent(int member1, int member2)생성자
		/*****case2*******
		super();
		this.setMember1(member1);
		this.setMember2(member2);
		*/
		this.member3 = member3;
		System.out.println("Child(int member1,int member2,int member3)생성자호출");
	}

	public void method3() {
		System.out.println("Child.method3()");
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.member3);
	}
}

public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("-------------------Child()------------");
		Child c1 = new Child();
		System.out.println("-------------------Child(int member1,int member2,int member3)------------");
		Child c2 = new Child(1, 2, 3);
		c2.print();

	}

}