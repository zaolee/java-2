package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(); // ���� ��Ʈ�� ���»���
			// serverSocket = new ServerSocket(5001); �̷��� ��Ʈ �ٷ� ���� ����
			serverSocket.bind(new InetSocketAddress("192.168.30.199", 5001)); // ���������� ��Ʈ �ʿ���
			while(true) {
				System.out.println("[���� ��ٸ�...]");
				Socket socket = serverSocket.accept(); // ������(��û�� ���ɶ�����)
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				// ��������ȯ ������ߵ�.
				// getRemoteSocketAddress : Returns the address of the endpoint this socket is connected to, or null if it is unconnected
				// ��ٿ� ���� �ִ� �ּ� ���ؼ� SocketAddress ����Ŭ������ InetSocketAddress�� ����
				System.out.println("[���� ������!]" + isa.getHostName());
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
