package sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ҿ��̴� 26�� �Դϴ�. �����ݶ� �����մϴ�.";		
		String newStr = oldStr.replace("�����ݶ�", "������ 42�ٸ�");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

