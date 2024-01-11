package bytestream.filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * 
		 * PrintStream = 문자로 변환하여 출력하는 필터스트림
		 * 문자로 출력해줌 (ex/ 문자열 --> 문자)
		 * 객체조차도 문자열로 변경한 후 문자로 출력한다
		 * 
		 */

		PrintStream pout = new PrintStream(new FileOutputStream("PrintStream.txt"));

		pout.write(65);
		// A라고 프린트

		pout.print('A');
		pout.print("A");
		pout.println();
		pout.write(49);
		pout.write(50);
		pout.write(51);
		pout.write(52);
		pout.println();
		pout.write('1');
		pout.write('2');
		pout.write('3');
		pout.write('4');
		pout.println();
		pout.print(1234);
		pout.println();
		pout.print(true);
		pout.print("true");
		pout.print("3.141592");
		pout.println("첫번째줄");
		pout.println("두번째줄");
		pout.flush();
		//프린트 스트림은 flush 작업을 알아서 함
		pout.close();
		System.out.println("System 표준 출력");
		System.err.println("System 에러 출력");
		
		
		

	}

}
