package sec07.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println( "[���� ��û]");
			socket.connect(new InetSocketAddress("192.168.30.199", 5001)); // �̰� �� IP��
			// 192.168.30.193 -> �̰� �������� ���� IP
			System.out.println( "[���� ����]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "���� 2�ҿ��Դϴ�.";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println( "[������ ������ ����]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[������ �ޱ� ����]: " + message);
			
			os.close();
			is.close();
		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {}
		}
	}
}