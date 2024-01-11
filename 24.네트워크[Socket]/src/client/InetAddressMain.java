package client;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) throws Exception {
		System.out.println("----local address(IP)----");
		InetAddress localAddress = InetAddress.getLocalHost();

		System.out.println("local Host Name" + localAddress.getHostName());
		/*
		  local Host NameDESKTOP-EL76GHG
		local Host Address192.168.15.19
		 
		 */
		System.out.println("local Host Address" + localAddress.getHostAddress());
		System.out.println("---remote address(IP)----");
		
		InetAddress remoteAddress= InetAddress.getByName("www.aladin.co.kr");
		//인터넷을 통해 원격 IP를 가져옴
		//DNS 서비스는 IP와 도메인 이름을 매핑해놓은 테이블 <-도메인 이름으로 IP를 반환
		System.out.println("remote host name :"+remoteAddress.getHostName());
		System.out.println("remote host address :"+remoteAddress.getHostAddress());
		
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.naver.com");
		for (InetAddress InetAddress : remoteAddresses) {
			System.out.println(InetAddress);
		}
		
		
		
		

	}

}
