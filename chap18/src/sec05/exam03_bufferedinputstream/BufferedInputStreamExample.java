package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		// 바이트기반의 입력스트림
		FileInputStream fis1 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		// 경로는 절대경로로 입력하기!
		start = System.currentTimeMillis(); // 시간 잴꺼얌
		while(fis1.read() != -1) {} // 저 경로를 디스크에서 찾아서 다 읽게되면
		end = System.currentTimeMillis(); // 시간 멈춰
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms"); // 1514ms : 1바이트씩 하나씩 가져다 보내니까 핵 느림
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2); // 버퍼(보조스트림)쓸꺼임.
		start = System.currentTimeMillis(); // 시간잰다
		while(bis.read() != -1) {} // 다 읽으면
		end = System.currentTimeMillis(); // 시간 멈춰
		System.out.println("사용했을 때: " + (end-start) + "ms"); // 4ms 시간에 차이 꽤 심함. : 덩어리로 싸악 보냄
		bis.close();
		fis2.close();
	}
}

