
/*
 인터페이스
    1. 클래스가가진 모든 메쏘드가 추상메쏘드임
    2. 다중상속의 효과를 냄
       (클래스는 불가능하나 인터페이스는가능하다)
   -형식
     * class keyword 대신에 interface 라는 keyword를사용
     * 추상메쏘드앞에 abstract 를 붙히지않는다.
     ex>
     	public interface Test{
     		public void method1();
     		public void method2();
        }
   - 사용
       1. interface를 상속(implements)받아서
       2. 추상메쏘드를 재정의(구현)한후 사용한다.
       
       ex> public class TestImpl implements Test{
       			public void method1(){}
     			public void method2(){}
          }
*/


/*
 * interface keyword 사용
 */


public interface InterfaceA {
public static final int CONSTANT1=1;
int CONSTANT2=1;

/*
 * interface 안에 정의되는 메소드는 추상 메소드여야한다.
 * 
 * 
 */



public abstract void method1();
public void method2();


}
