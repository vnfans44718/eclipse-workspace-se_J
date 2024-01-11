package bytestream.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamFileCopyMain {

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream("D2Coding.zip"));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("D2Coding_copy.zip"));
		int byteCount = 0;
		int starCount = 0;
		while (true) {
			int readByte = bi.read();
			if (readByte == -1)
				break;
			byteCount++;
			if (byteCount % 1024 == 0) {
				System.out.print("*");
				starCount++;
				if (starCount % 50 == 0) {
					System.out.println();
				}
			}
			bo.write(readByte);
		}
		bi.close();
		bo.close();
		System.out.println();
		System.out.println("BufferedInputOutputFileCopy:" + byteCount);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println(duration / 1000.0 + " second..");
	}

}
