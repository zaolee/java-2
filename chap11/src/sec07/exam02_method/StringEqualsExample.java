package sec07.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("�");
		String strVar2 = "�";
		
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü ����");
		} else {
			System.out.println("�ٸ� String ��ü ����");
		}
		
		System.out.println();
		// String ��ü�� ����񱳴� String��ü.equals()�� ����ؾ���.
		if(strVar1.equals(strVar2)) {
			System.out.println("���� String ��ü ����");
		} else {
			System.out.println("�ٸ� String ��ü ����");
		}
	}
}