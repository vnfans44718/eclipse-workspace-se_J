
/*
 객체주소변수의 형변환(type casting)
   1. 상속관계에있는 클래스(타입) 사이에서만 가능하다.
      ex> 자식클래스타입 객체의주소를 부모클래스타입 객체의 주소로 형변환(주소변경절대안됨,타입만변경)
      ex> 부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환(주소변경절대안됨,타입만변경)
        
   2. 자식클래스타입 객체의주소를 부모클래스타입 객체의 주소로 형변환
       - 자동으로 이루어진다(묵시적)
       		Child c = new Child();
       		Parent p = c; 
       		
       		Parent p=new Child();
   
   3. 부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       	Parent p=new Parent();
       	Child cccc = p;(X)
	    public class Parent{}
	    public class Child extends Parent{}
 */

class Parent {
	public void method1() {
		System.out.println("Parent.method1");
	}

	public void method2() {
		System.out.println("Parent.method2");
	}

	public void method3() {
		System.out.println("Parent.method3");
	}

	public void method4() {
		System.out.println("Parent.method4");
	}

}

class Child extends Parent {
	@Override
	public void method4() {
		System.out.println("Child.method4()-->Parent.method4()를 재정의[오버라이딩]");
	}

	public void method5() {
		System.out.println("Child.method5");
	}

}

public class ParentChildCastingMain {

	public static void main(String[] args) {
		System.out.println("-------------<< Child --> Parent--------------");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();// 재정의된 메소드
		c1.method5();
		Parent p1 = c1;
		if (p1 == c1) {
			System.out.println(p1 + "==" + c1 + "[p1과 c1의 주소가 동일하다.]");
		}
		p1.method1();
		p1.method2();
		p1.method3();
		p1.method4();
		//p1.method5();
		System.out.println("-------------<< Parent --> Child--------------");
		//자식이 부모의 타입으로 형변환 한 객체의 경우에만 다시 부모로 강제형변환이 가능
		Parent p2=new Parent();
		//Child c2=p2; <-- 부모 타입의 객체를 자식 타입으로 형변환 불가능,컴파일 에러
		//Child c2=(Child)p2;<--이렇게 할 경우 컴파일은 가능하나 실행 시 예외(에러) 발생
		
		/*
		 * 3-2 부모의 탈을 쓴 자식객체는 가능하다
		 * 
		 */
		
		
		Parent p3=new Child();
		p3.method1();
		p3.method2();
		p3.method3();
		p3.method4();
		//p3.method5();
		Child c3=(Child)p3;
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
		
		
		
	}

}
