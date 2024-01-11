package bytestream.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("DataOutputStream.itwill"));
		int intData = 2147483647;
		dos.writeInt(intData);
		dos.writeBoolean(true);
		dos.writeChar('가');
		dos.writeDouble(3.141592);
		dos.writeUTF("오늘은 자바 입출력을 공부합니다!!!");
		dos.close();

		System.out.println("DataOutputStream.writeooo() --> DataOutputStream.itwill");

		DataInputStream dis = new DataInputStream(new FileInputStream("DataOutputStream.itwill"));
		int readInt = dis.readInt();

		System.out.println("readInt : " + readInt);
		System.out.println("readBoolean : " + dis.readBoolean());
		System.out.println("readChar : " + dis.readChar());
		System.out.println("readDouble : " + dis.readDouble());
		System.out.println("readUTF : " + dis.readUTF());
		dis.close();
		System.out.println("DataOutputStream.writeooo() <-- DataOutputStream.itwill");

	}

}
