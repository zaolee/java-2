package sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("�Ｚ", "�����ó�Ʈ20");
		
		String strObj = myPhone.toString();  // ������ ���ϸ� �� ������� �ּҰ������ϱ� ������ �ʿ�.
		// �ڱ� �ʵ忡 ������ ����ִ��� Ȯ���Ҷ�
		// �ַ� �ν��Ͻ� �ʵ��� ���� ����ϱ� ����.
		System.out.println(strObj);
		System.out.println(myPhone);
	    
		// myPhone.information();
		
		
	}
}
