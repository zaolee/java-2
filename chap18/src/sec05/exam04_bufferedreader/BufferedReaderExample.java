package sec05.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {		
		// 바이트기반의 입력스트림
		InputStream	is = System.in;
		Reader reader = new InputStreamReader(is); // 문자변환용 보조스트림. 문자기반<-바이트기반
		BufferedReader br = new BufferedReader(reader); // 성능향상용 보조스트림
		// 이렇게 총 2개의 보조스트림 사용.
		
		System.out.println("입력: ");
		String lineString = br.readLine(); // 문자열로 읽어본다.
		
		System.out.println("출력: " + lineString);
		
	}
}