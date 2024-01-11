package charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("FileWriter.txt");
		int charCount = 0;

		int readChar = fr.read();
		charCount++;
		System.out.println("tlwkr**************");
		System.out.println("1.readChar" + (char) readChar);
		readChar = fr.read();
		charCount++;
		System.out.println("2.readChar" + (char) readChar);
		readChar = fr.read();
		charCount++;
		System.out.println("3.readChar" + (char) readChar);
		while (true) {
			readChar = fr.read();
			if (readChar==-1)break; 
			charCount++;
			System.out.println((char)readChar);
			
		}

		System.out.println();
		System.out.println(charCount+" 개의 문자를 읽음");
		fr.close();
	}

}
