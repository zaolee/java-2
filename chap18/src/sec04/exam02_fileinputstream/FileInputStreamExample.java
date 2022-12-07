package sec04.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
			int data;
			while((data = fis.read()) != -1) { // 파일을 다 읽어올껀데 -1이 되면 빠저나감, -1이 아니면 true니까 반복문이 계속 실행됨.
				System.out.write(data); // System.out = PrintStream (바이트 기반의 표준화면(지금은 console임) 출력 스트림)
			} // fis에 들어간 파일이 다 출력되겠지..
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

