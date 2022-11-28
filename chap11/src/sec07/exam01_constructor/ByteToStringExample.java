package sec07.exam01_constructor;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; // 아스키코드값
		// 1byte = 8 bits, -128~127 정수형
		// 배열은 힙메모리에 생성
		
		String str1 = new String(bytes); // bytes 배열을 매개변수로 문자열 객체를 생성
		System.out.println(str1); // "Hello Java"
		System.out.println(str1.toString());
		
		String str2 = new String(bytes, 6, 4); // 7번째부터 4개 
		System.out.println(str2);
	}
}
