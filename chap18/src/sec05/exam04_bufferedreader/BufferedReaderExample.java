package sec05.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {		
		// ����Ʈ����� �Է½�Ʈ��
		InputStream	is = System.in;
		Reader reader = new InputStreamReader(is); // ���ں�ȯ�� ������Ʈ��. ���ڱ��<-����Ʈ���
		BufferedReader br = new BufferedReader(reader); // �������� ������Ʈ��
		// �̷��� �� 2���� ������Ʈ�� ���.
		
		System.out.println("�Է�: ");
		String lineString = br.readLine(); // ���ڿ��� �о��.
		
		System.out.println("���: " + lineString);
		
	}
}