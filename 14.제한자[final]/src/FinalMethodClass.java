
public class FinalMethodClass {

	public void method1() {
		System.out.println("FinalMethodClass.method1()");
	}
	
	public final void method2() {
		System.out.println("FinalMethodClass.method2() 난 final 메소드 재정의 불가능");
		
	}
	//final은 상속은 되지만 재정의가 불가능하다
	
}
