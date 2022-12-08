package sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		// �ڹٷ� �� ��ǻ�� IP�ּ� ã�¹� cmd����ص� ��.
		try {
			InetAddress local = InetAddress.getLocalHost();
			// InetAddress java.net.InetAddress.getLocalHost() throws UnknownHostException
			System.out.println("�� ��ǻ�� IP�ּҴ�?!?! " + local.getHostAddress());
			// getHostAddress : Returns the IP address string in textual presentation.
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			// getAllByName : DNS���� ()�ȿ� ���� ���� �˷���!! �̰��ϴ� ����
			for(InetAddress remote:iaArr) {
				System.out.println("\nwww.naver.com IP�ּҴ�!?!? " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

