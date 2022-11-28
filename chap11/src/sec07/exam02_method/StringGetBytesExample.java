package sec07.exam02_method;

import java.io.UnsupportedEncodingException;
import java.net.MulticastSocket;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요~";
		
		byte[] bytes1 = str.getBytes(); // ms-949 chartersct으로 변환
		System.out.println("bytes1.length는 " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println(str1); // 안녕하세요~
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR"); // 문자 인코딩
			System.out.println("\nbytes2.length: " + bytes2.length);
			
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8"); // 가변 문자셋 인코딩
			System.out.println("\nbytes3.length: " + bytes3.length);
			
			String str3 = new String(bytes3, "EUC-KR"); 
			// 둘이 방식이 달라서 깨짐(생략하면 ms-949이걸로 됨)
			System.out.println("bytes3->String: " + str3);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
