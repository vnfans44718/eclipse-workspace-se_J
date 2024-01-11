package charstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("FileWriter.txt");

		fw.write(44356);
		fw.write('A');
		fw.write('김');
		for (int i = 0; i < 65536; i++) {
			fw.write(i);
			if (i % 100 == 0) {
				fw.write('\n');
			}
		}

		fw.write('\n');
		fw.write("문자열을 맘대로 막 써요!!\n");
		fw.write("한라인\n");
		fw.write("두라인\n");
		fw.write("세라인\n");
		fw.write("네라인\n");
		fw.write("다섯라인\n");
		fw.write("야섯라인\n");
		fw.write("일곱라인\n");
		fw.write("여덟라인\n");
		fw.write("아홉라인\n");
		fw.write("열라인\n");
		/*
		 * 채워지지 않은 버퍼에 있는 데이터를 출력 스트림에 쓴다
		 */
		fw.flush();

		fw.close();
		System.out.println("FileWriter.write()-->FileWriter.txt");

	}

}
