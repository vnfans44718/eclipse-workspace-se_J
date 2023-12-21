
public class LocalVariableMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(local variable)
		 *   - 메쏘드블록안에 선언된변수(매개변수)
		 * 멤버변수(필드)
		 *   - 클래스 블록안에 선언된변수
		 */
		/*
		 * local 변수(기본형변수)
		 */
		int a = 9;
		int b = 10;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		/*
		 * 모든변수는 반드시 초기화 하여야 사용할수있다.
		 */

		/*
		<<  1.The local variable tot1 may not have been initialized >>
			int tot;
			System.out.println("tot1="+tot);
		*/

		/*
		 << 2.The local variable tot may not have been initialized >> 
			int tot;
			boolean condition=true;
			if(condition) {
			  tot=0;	
			}
			System.out.println("tot="+tot);
		*/
		/*
		<< 3.The local variable tot may not have been initialized >> 
		int tot;
		tot=tot + 1; 
		*/

		int tot1;
		tot1 = 0;
		System.out.println("tot1=" + tot1);

		int tot2;
		boolean condition2 = true;
		if (condition2) {
			tot2 = 0;
		} else {
			tot2 = 1;
		}
		System.out.println("tot2=" + tot2);

		int tot3;
		tot3 = 0;
		tot3 += 3;
		System.out.println("tot3+" + tot3);

		/*
		<< The local variable order2 may not have been initialized >>
		Order order2;
		boolean condition22=true;
		if(condition22) {
			order2=new Order(2, "패딩조끼","2023-12-19", 50000);
		}
		order2.print();
		*/
		Order order2;
		boolean condition22=false;
		if(condition22) {
			order2=new Order(2, "패딩조끼","2023-12-19", 50000);
		}else {
			order2=new Order(2, "NOTEBOOK","2023-12-19", 550000);
		}
		order2.print();
	
		/*
		 * 참조변수 초기화 시 기본값
		 * -null (참조변수 리터럴)
		 * -주소없다 주소값
		 */
		
		Order order3=null;
		
		if (order3==null); {
			order3=new Order(3, "시계외2종", "2023-12-12", 80000);
		}
		
		order3.print();
		
		
		
		
		
		
		
	}
	
	
	
	
	

}