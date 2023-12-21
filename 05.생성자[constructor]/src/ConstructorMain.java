
public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("------------c1------------");
		/*
		 <<new Constructor(); >>
		 1.Constructor 클래스로 객체생성
		 2.생성자 메소드(블록)호출
		 3.생성된 객체의 주소값 반환
		 * 로컬변수는 자동 초기화가 안됨
		 */
		Constructor c1 = new Constructor();
		//객체가 생성되고 주소값이 반환된다
		System.out.println("c1:" + c1);
	    c1.print();
	    System.out.println("--------c2----------");
	    Constructor c2 = new Constructor(100);
	    c2.print();
	    System.out.println("--------c3----------");
	    Constructor c3 = new Constructor(100,200,"아ㅓㄹ");
	    c3.print();
	    
	    
	    
	}

}
