
public class FinalFieldClassMain {

	public static void main(String[] args) {
		System.out.println("----------------FinalFieldClass 객체1-------");
		/*FinalFieldClass.PI=3.15;
		FinalFieldClass.EARTH_RADIUS=6651;*/
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		FinalFieldClass ffc1 = new FinalFieldClass();
		/*ffc1.PORT_NUMBER=88;
		ffc1.INCENTIVE_RATE=0.3;*/
		System.out.println(ffc1.PORT_NUMBER);
		System.out.println(ffc1.INCENTIVE_RATE);
		
		System.out.println("----------------FinalFieldClass 객체2-------");
		
		
		
		
	}

}