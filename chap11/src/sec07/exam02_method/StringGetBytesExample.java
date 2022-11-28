package sec07.exam02_method;

import java.io.UnsupportedEncodingException;
import java.net.MulticastSocket;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���~";
		
		byte[] bytes1 = str.getBytes(); // ms-949 chartersct���� ��ȯ
		System.out.println("bytes1.length�� " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println(str1); // �ȳ��ϼ���~
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR"); // ���� ���ڵ�
			System.out.println("\nbytes2.length: " + bytes2.length);
			
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8"); // ���� ���ڼ� ���ڵ�
			System.out.println("\nbytes3.length: " + bytes3.length);
			
			String str3 = new String(bytes3, "EUC-KR"); 
			// ���� ����� �޶� ����(�����ϸ� ms-949�̰ɷ� ��)
			System.out.println("bytes3->String: " + str3);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
