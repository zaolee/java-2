package sec05.exam01_string_equals;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		System.out.println("strVar1="+System.identityHashCode(strVar1));
		System.out.println("strVar2="+System.identityHashCode(strVar2));

		if (strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ���  ����");
		}

		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		System.out.println("strVar3="+System.identityHashCode(strVar3));
		System.out.println("strVar4="+System.identityHashCode(strVar4));

		if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ���  ����");
		}
	}
}
