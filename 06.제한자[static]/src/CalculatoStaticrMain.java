
public class CalculatoStaticrMain {
	public static void main(String[] args) {
		/*
		<< The constructor Calculator() is not visible >>
		
		Calculator calculator=new Calculator();
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		result=calculator.div(45435,34);
		System.out.println(result);
		*/
		System.out.println(Calculator.add(23, 34));
		System.out.println(Calculator.sub(23, 34));
		System.out.println(Calculator.mul(23, 34));
		System.out.println(Calculator.div(23, 34));
		
	}
}