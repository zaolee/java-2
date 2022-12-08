package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(); // 지금 포트가 없는상태
			// serverSocket = new ServerSocket(5001); 이렇게 포트 바로 생성 가능
			serverSocket.bind(new InetSocketAddress("192.168.30.199", 5001)); // 서버소켓은 포트 필요행
			while(true) {
				System.out.println("[연결 기다림...]");
				Socket socket = serverSocket.accept(); // 실행대기(요청이 허용될때까지)
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				// 강제형변환 시켜줘야됨.
				// getRemoteSocketAddress : Returns the address of the endpoint this socket is connected to, or null if it is unconnected
				// 쏘겟에 끝에 있는 주소 구해서 SocketAddress 하위클래스인 InetSocketAddress로 보냄
				System.out.println("[연결 수락함!]" + isa.getHostName());
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
