class OuterClassOverridingInnerClass {

	private int outer_memebr_field;

	public void outer_memebr_method() {
		System.out.println("OuterClassOverridingInnerClass.outer_memebr_method()");
	}

	/*
	 * OuterClass에서 재정의된 InnerClass 객체사용
	 */

	// 멤버 레벨의 이너 클래스는 여러번 사용가능하나 로컬은 불가능
	public void outer_inner_class_use() {
		/************* member inner class[CASE1] *********************/
		System.out.println("-------member inner class[CASE1]-------------");

		Object oc1 = new ObjectChild();
		System.out.println("oc1.toString() :" + oc1.toString());
		ChildParentFirstConcreteClass childParentFirstConcreteClass1 = new ChildParentFirstConcreteClass();
		childParentFirstConcreteClass1.method();
		ParentSecondAbstractClass childParentSecondAbstractClass1 = new ChildParentSecondAbstractClass();
		childParentFirstConcreteClass1.method();

		ChildParentThirdInterface childParentThirdInterface1 = new ChildParentThirdInterface();
		childParentThirdInterface1.method();

		/********** anonymous local inner class[CASE2] ********************/
		System.out.println("-------member inner class[CASE2]-------------");
		/*
		 특정 클래스(인터페이스)의 메소드를 재정의해야할 때
		 1.local 위치에 이름이 없는 클래스 정의
		 2. 이름이 없는 클래스의 객체생성
		 */
		Object oc2 = new Object() {
			// object 클래스의 자식, 이름없는 클래스, 재정의밖에 안됨

			@Override
			public String toString() {
				return "난 Object를 상속받는 이름 없는 클래스의 toString()의 재정의";
			}
		};
		// 객체 생성 후 괄호 쓰는 순간 클래스가 됨
		System.out.println("oc2.toString() :" + oc2.toString());

		ParentFirstConcreteClass childParentFirstConcreteClass2 = new ParentFirstConcreteClass()
		// 객체를 클래스로 define({})하는 순간 이름없는 이름 없는 자식 클래스 ,자식 객체 생성
		{
			@Override
			public void method() {
				System.out.println("ParentFirstConcreteClass를 상속받는 "
						+ "이름없는로칼내부클래스(OuterClassOverridingInnerClass$2.class)에서 재정의한method()");
			}
		};

		childParentFirstConcreteClass2.method();

		ParentSecondAbstractClass childParentSecondAbstractClass2 = new ParentSecondAbstractClass() {

			@Override
			public void method() {
				System.out.println("ParentFirstConcreteClass를 상속받는 이름없는 로컬 내부 클래스에서 재정의한 메소드");
			}

			public void test() {
				System.out.println("test");
			}
		};

		childParentSecondAbstractClass2.method();
		ParentThirdInterface childParentThirdInterface2 = new ParentThirdInterface() {
			@Override
			public void method() {
				System.out.println("ParentThirdInterface를 상속(구현)받는 " + "이름없는 로컬내부클래스에서 재정의한 method()");

			}

		};
		childParentThirdInterface2.method();

	}

	/******* memebr inner class ********/
	/*
	 memeber inner class
	 -특정 클래스의 상속 후에 메소드를 제정의한 클래스
	 */

	public class ObjectChild extends Object {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Object를 상속받는 ObjectChild에서 " + "재정의한 toString()메쏘드";
		}
	}

	public class ChildParentFirstConcreteClass extends ParentFirstConcreteClass {
		@Override
		public void method() {
			System.out.println("ParentFirstConcreteClass를 상속받는" + "ChildParentFirstConcreteClass 에서 재정의한 method() ");
		}
	}

	public class ChildParentSecondAbstractClass extends ParentSecondAbstractClass {
		@Override
		public void method() {
			System.out.println("ParentSecondAbstractClass를 상속받는" + "ChildParentSecondAbstractClass 에서 재정의한 method() ");

		}

	}

	public class ChildParentThirdInterface implements ParentThirdInterface {

		@Override
		public void method() {
			System.out.println("ParentThirdInterface를 상속(구현)받는" + "ChildParentThirdInterface에서 재정의한 method()");

		}

	}

}

public class OuterClassOverridingInnerClassMain {

	public static void main(String[] args) {
		OuterClassOverridingInnerClass outerClassOverridingInnerClass = new OuterClassOverridingInnerClass();
		outerClassOverridingInnerClass.outer_inner_class_use();

	}

}
