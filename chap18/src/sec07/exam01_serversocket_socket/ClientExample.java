package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		socket = new Socket();
		System.out.println("[연결 요청]");
		try {
			socket.connect(new InetSocketAddress("192.168.30.199", 5001));  // 실행대기
			// 쌤 소켓이랑 연결 요청한거(내가 클라이언트임) <-> 쌤은 서버 *192.168.30.199 쌤 ip주소
			// 연결성공이 뜨면 둘이 내 쏘겟이 요청해서 쌤이 수락한거.서로 주고받을수 있음.
			System.out.println("[연결 성공!]");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		if(!socket.isClosed()) { // socket이 끝나지 않앗다면
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}