/*
 * 오버라이딩(재정의)
 *   1. 상속관계에서 발생하는 메쏘드의 재정의 기법이다
 *   2. 자바의 다형성 기법중의하나이다.
 *   
 *   -형태 : 부모클래스에 정의된 메쏘드와 동일한 메쏘드(이름,리턴타입,매개변수)를 
 *           자식클래스에 정의(재정의)하는것
 * 
 *   - ex> public class Super{
 *   			public void print(){
 *   			}		
 *   		}
 *        
 *        public class Sub extends Super{
 *        		public void print(){
 *        		}
 *        }
 * 
 */
class OverridingParent {

	public void method1() {
		System.out.println("OverridingParent.method1()");
	}

	public void method2() {

		System.out.println("OverridingParent.method2()");
	}

}

class OverridingChild extends OverridingParent {
	@Override
	public void method2() {
		System.out.println("-------재정의된 메소드 method2 start-----");
		System.out.println("OverridingChild.method2()를 OverridingChild에서 재정의");
		super.method2();
		/*
		 * super
		 * -this 와 같은 self 참조변수
		 * -this 와 같은 주소를 가리킨다.
		 * -재정의에 의해 은폐된 메소드를 호출할 때 사용
		 */
		System.out.println("OverridingChild.method2() 추가작업");
		System.out.println();
		System.out.println("-------재정의된 메소드 method2 end-----");
		/*
		 재정의하면
		 - 상속받은 method2()는 은폐
		 - 자식에서 재정의된  method2()만 호출된다
		
		 */
	}

	public void method3() {
		System.out.println("OverridingChild.method3()");

	}

}

public class OverridingParentChildMain {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.method1();
		/*
		 * oc.method2() 호출 시에 재정의된 메소드만 호출
		 */
		oc.method2();
		oc.method3();

	}

}
