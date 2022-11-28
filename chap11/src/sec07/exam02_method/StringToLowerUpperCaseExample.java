package sec07.exam02_method;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "zaolee is 26years old";
		String str2 = "ZAOLEE IS 26YEARS OLD";
		
		System.out.println(str1.equals(str2)); // F, 대소문자 구분함.
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(str1.equals(lowerStr2));
	}
}

