package sec05.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		System.out.println("입력:");
		InputStream is = System.in; // 바이트기반의 입력 스트림
		Reader reader = new InputStreamReader(is); // 문자기반의 입력 스트림
		
		int readCharNo;
		char[] cbuf = new char[100];
		
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
		is.close();
	}
}

