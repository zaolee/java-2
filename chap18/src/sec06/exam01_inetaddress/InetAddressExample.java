package sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		// 자바로 내 컴퓨터 IP주소 찾는법 cmd사용해도 됨.
		try {
			InetAddress local = InetAddress.getLocalHost();
			// InetAddress java.net.InetAddress.getLocalHost() throws UnknownHostException
			System.out.println("내 컴퓨터 IP주소는?!?! " + local.getHostAddress());
			// getHostAddress : Returns the IP address string in textual presentation.
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			// getAllByName : DNS가서 ()안에 내용 뭔지 알려줘!! 이거하는 역할
			for(InetAddress remote:iaArr) {
				System.out.println("\nwww.naver.com IP주소는!?!? " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

