package charstream.filterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterBufferedReaderMain {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter("PrintWriterBufferedReader.txt"));
		pw.println("첫번째줄");
		pw.println("두번째줄");
		pw.println("세번째줄");
		pw.println("네번째줄");
		pw.println("다섯번째줄");
		pw.println("여섯번째줄");

		pw.flush();
		pw.close();
		System.out.println("PrintWriter.println()-->PrintWriterBufferedReader.txt");
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("PrintWriterBufferedReader.txt")));
		// 파일을 불러와서 리더로 변경한 다음 리드라인으로 읽기 위해

		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			System.out.println(readLine);
		}
		br.close();
		System.out.println("BufferedReader.readLine() <---PrintWriterBufferedReader.txt ");

	}

}
