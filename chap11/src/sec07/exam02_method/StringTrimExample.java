package sec07.exam02_method;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 97";
		String tel2 = "080  ";
		String tel3 = "  8   ";
		
		String tel = tel1.trim() + tel2.trim() +tel3.trim();
		System.out.println(tel);
	}
}

