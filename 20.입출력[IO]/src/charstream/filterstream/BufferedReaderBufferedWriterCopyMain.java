package charstream.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderBufferedWriterCopyMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("죄와벌[copy].txt"));

		int lineCount = 0;

		/*
		public String readLine() throws IOException
		- Reads a line of text.
		- A line is considered to be terminated 
		     by any one of a line feed ('\n'), 
		     a carriage return ('\r'), 
		     or a carriage return followed immediately by a linefeed.
		Returns:
			- A String containing the contents of the line, 
			  not including any line-termination characters, 
			  or null if the end of the stream has been reached
			  라인 종결자를 넣지 않으면 null 반환
		 */
		/*
		String readLine = br.readLine();
		System.out.println("1."+readLine);
		readLine = br.readLine();
		System.out.println("2."+readLine);
		*/
		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			if (readLine.equals("")) {
				System.out.println("-------");
				continue;
				// 공백라인 제거
			}

			lineCount++;
			readLine = readLine.replace("더스틴", "원주하");
			// String은 변하지 않는 객체기 때문에 대입
			readLine = lineCount + ":" + readLine;

			bw.write(readLine);
			bw.newLine();
			//종결자 뉴라인을 써줘야 하기 때문에 BufferedReader를 쓸 경우 writer대신 Print 보조 스트림을 많이 쓰기도 함

		}

		bw.flush();
		bw.close();
		br.close();
		System.out.println("BufferedReaderBufferedWriterCopy :" + lineCount + "line copy");
		// 카피만 할거면 바이트 스트림이 가장 좋음

	}

}