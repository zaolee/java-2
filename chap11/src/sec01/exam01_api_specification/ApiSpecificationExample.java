package sec01.exam01_api_specification;

public class ApiSpecificationExample {
	public static void main(String[] args) {
		String myName = "½î¿¬";
		System.out.println(myName);
		System.out.println(myName.toString());
		
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}
}

