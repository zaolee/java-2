package sec07.exam02_method;

public class StringValueOfExample {
	public static void main(String[] args) {
		int bDay = 970808;
		String str1 = String.valueOf(bDay); 
		// String ��ü�� bDay�� ���� ����Ű��?? ����ȯ : ������(String) <- �⺻��(int)
		System.out.println(str1); // "970808"
		
		String str2 = String.valueOf(26); // "26"
		String str3 = String.valueOf(true); // "true"
		
		System.out.println(str2);
		System.out.println(str3);
	}
}

