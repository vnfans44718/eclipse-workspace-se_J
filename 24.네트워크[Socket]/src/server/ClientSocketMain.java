package server;

import java.net.InetAddress;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception {

		/*
		 * Socket socket = new Socket("www.naver.com", 80);
		 */

		Socket socket = new Socket("192.168.15.19", 3333);

		System.out.println(">> client 쪽 socket :" + socket);
		InetAddress remoteAddress = socket.getInetAddress();
        //local은 항상 locadl 붙어 있음 없으면 원격
		InetAddress loacalAddress = socket.getLocalAddress();

		System.out.println("remote ip :" + remoteAddress.getHostAddress());
		System.out.println("remote port :" + socket.getPort());
		System.out.println("local ip :" + loacalAddress.getHostAddress());
		System.out.println("local port :" + socket.getLocalPort());

	}

}
