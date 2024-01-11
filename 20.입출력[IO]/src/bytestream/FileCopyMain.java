package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		long startTime=System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("D2Coding.zip");
		FileOutputStream fos = new FileOutputStream("D2Coding(1).zip");

		int byteCount = 0;
		int starCount = 0;
		
		while (true) {
			int readByte = fis.read();
			if (readByte == -1)
				break;
			byteCount++;
			if (byteCount%1024==0) {
				System.out.println("*");
				starCount++;
				if (starCount%50==0) {
					System.out.println();
				}
			}
			fos.write(readByte);

		}
		fis.close();
		fos.close();
		System.out.println("FileCopy :" + byteCount + " bytes copy!!");

		long endTime = System.currentTimeMillis();
		long duration =endTime-startTime;
		System.out.println(duration+"ms....");
	}

}
