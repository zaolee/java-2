package sec07.exam02_method;

public class StringLengthExample {
	public static void main(String[] args) {
		
		String[] strs = new String[100]; 
		// String[] = ������, String �迭(���ڿ� �迭)
		System.out.println(strs.length); // �迭
		
		String ssn = "970808-2153222";
		int length = ssn.length(); // ���ڿ�
		System.out.println(length);
	}
}

