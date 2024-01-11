package charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriteCopyMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("데미안.txt");
		FileWriter fw = new FileWriter("데미안[복사].txt");

		int lineCount = 0;
		int charCount = 0;
		//
		while (true) {
			int readChar = fr.read();
			if (readChar == -1)
				break;
			charCount++;
			if (readChar == '.') {

				fw.write(readChar);
				fw.write('\n');
			} else if (readChar == '-') {
				fw.write(readChar);
				fw.write("page ");
			} else if (readChar == '\n') {
				fw.write(readChar);
				lineCount++;
			} else {
				fw.write(readChar);
			}

		}
		fw.flush();
		// output이나 write는 위 flush를 해주는게 좋음
		fw.close();
		fr.close();
		System.out.println("FileWriterReaderCopy[" + lineCount + "line copy]");
		System.out.println("FileWriterReaderCopy[" + charCount + "글자 copy]");
	}

}
