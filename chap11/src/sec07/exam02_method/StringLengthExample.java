package sec07.exam02_method;

public class StringLengthExample {
	public static void main(String[] args) {
		
		String[] strs = new String[100]; 
		// String[] = 참조형, String 배열(문자열 배열)
		System.out.println(strs.length); // 배열
		
		String ssn = "970808-2153222";
		int length = ssn.length(); // 문자열
		System.out.println(length);
	}
}

