package sec04.exam04_file_reader;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		// 문자기반의 입력 스트림
		FileReader fr = new FileReader ("C:\\dev\\workspace\\java\\chap18\\src\\sec04\\exam04_file_reader\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100]; // 바이트가 아닌 char[](문자기반) 이용
		
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}

