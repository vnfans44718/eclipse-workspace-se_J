/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/
public class FinalFieldClass {
	public final int PORT_NUMBER=80;
	public final double INCENTIVE_RATE;
	public static final double PI=3.141592;
	public static final int EARTH_RADIUS=6400;
	
	public final Product product;
	
	public FinalFieldClass() {
		/*
		  The blank final field INCENTIVE_RATE may not have been initialized
		 */
		product=new Product(1, "새우깡");
		
		this.INCENTIVE_RATE=0.1;
		/*
		<< The final field INCENTIVE_RATE may already have been assigned>>
		this.INCENTIVE_RATE=0.2;
		this.PORT_NUMBER=81;
		FinalFieldClass.PI=3.15;
		FinalFieldClass.EARTH_RADIUS=6451;
		*/
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		
	}
	public FinalFieldClass(double INCENTIVE_RATE){
		this.INCENTIVE_RATE=INCENTIVE_RATE;
		product=new Product(1, "새우깡");
	}

}