package sec04.exam04_file_reader;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		// ���ڱ���� �Է� ��Ʈ��
		FileReader fr = new FileReader ("C:\\dev\\workspace\\java\\chap18\\src\\sec04\\exam04_file_reader\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100]; // ����Ʈ�� �ƴ� char[](���ڱ��) �̿�
		
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}

