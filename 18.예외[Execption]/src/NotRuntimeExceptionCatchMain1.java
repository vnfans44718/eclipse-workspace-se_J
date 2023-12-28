import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionCatchMain1 {

	public static void main(String[] args) {

		System.out.println("stmt1");
		/*
		예외발생예상코드(IOException)
		  1.예외발생시 IOException객체생성 
		    IOException객체가 던져짐
		  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 IOException객체대입)  
		  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
		 */

		System.out.println("stmt2");
		/*
		 예외발생예상코드(ClassNotFoundException)
		  1.예외발생시 ClassNotFoundException객체생성 
		    ClassNotFoundException객체가 던져짐
		  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ClassNotFoundException객체대입)  
		  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
		 */

		/*
		 * 예외발생예상코드(ArithmeticException[RuntimeException])
		   	1.예외발생시 ArithmeticException객체생성 
		    	ArithmeticException객체가 던져짐
		  	2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ArithmeticException객체대입)  
		  	3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
		 */

		System.out.println("stmt3");

	}

}