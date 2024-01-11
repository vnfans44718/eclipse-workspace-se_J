package charstream.filterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterInputStreamReaderMain {

	public static void main(String[] args) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("OutputStreamWriter.txt"));
		osw.write("첫번째라인\n");
		osw.write("두번째라인\n");
		osw.write("세번째라인\n");
		osw.write("네번째라인\n");
		osw.write("다섯번째라인\n");
		osw.flush();
		osw.close();
		System.out.println("OutputStreamWriter.write()-->OutputStreamWriter.txt");

		InputStreamReader isr = new InputStreamReader(new FileInputStream("OutputStreamWriter.txt"));

		/*BufferedReader br = new BufferedReader(isr);*/
		// BufferedReader는 reader만 들어감 isr처럼 먼저 변경 필요

		while (true) {
			int readChar = isr.read();
			if (readChar == -1)
				break;
			System.out.print((char)readChar);

		}
		isr.close();
		System.out.println("OutputStreamReader.read()<-- OutputStreamWriter.txt");
	}

}
