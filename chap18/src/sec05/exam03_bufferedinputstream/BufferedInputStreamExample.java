package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		// ����Ʈ����� �Է½�Ʈ��
		FileInputStream fis1 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		// ��δ� �����η� �Է��ϱ�!
		start = System.currentTimeMillis(); // �ð� �겨��
		while(fis1.read() != -1) {} // �� ��θ� ��ũ���� ã�Ƽ� �� �аԵǸ�
		end = System.currentTimeMillis(); // �ð� ����
		System.out.println("������� �ʾ��� ��: " + (end-start) + "ms"); // 1514ms : 1����Ʈ�� �ϳ��� ������ �����ϱ� �� ����
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2); // ����(������Ʈ��)������.
		start = System.currentTimeMillis(); // �ð����
		while(bis.read() != -1) {} // �� ������
		end = System.currentTimeMillis(); // �ð� ����
		System.out.println("������� ��: " + (end-start) + "ms"); // 4ms �ð��� ���� �� ����. : ����� �ξ� ����
		bis.close();
		fis2.close();
	}
}

