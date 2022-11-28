package sec07.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		// 키보드에서 값을 읽어 bytes저장하고 읽은 개수는 readByteNo에 저장한다.
		
		System.out.println("readByteNo= " + readByteNo);
		//배열의 offset 인덱스 위치부터 length 개 만큼 String 객체 생성
		String str = new String(bytes, 0, readByteNo -2);
		System.out.println(str);
	}
}
