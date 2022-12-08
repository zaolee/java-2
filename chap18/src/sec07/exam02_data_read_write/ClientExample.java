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
			System.out.println( "[연결 요청]");
			socket.connect(new InetSocketAddress("192.168.30.199", 5001)); // 이거 쌤 IP임
			// 192.168.30.193 -> 이게 내가쓰는 컴터 IP
			System.out.println( "[연결 성공]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "저는 2소연입니다.";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println( "[데이터 보내기 성공]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공]: " + message);
			
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