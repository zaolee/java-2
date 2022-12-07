package sec04.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
			int data;
			while((data = fis.read()) != -1) { // ������ �� �о�ò��� -1�� �Ǹ� ��������, -1�� �ƴϸ� true�ϱ� �ݺ����� ��� �����.
				System.out.write(data); // System.out = PrintStream (����Ʈ ����� ǥ��ȭ��(������ console��) ��� ��Ʈ��)
			} // fis�� �� ������ �� ��µǰ���..
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

