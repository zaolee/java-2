package sec03.exam01_name_implement_class;



public class RemoteControlExample {
	static int num = 1; // �ʵ�(�������), ��������	
	public static void main(String[] args) {
		// rc�� ��������, ��������
		RemoteControl rc;
		num = 1;
		rc = new Television();
		rc.turnOn();
		// RemoteControl �������̽��� ������ Television ������ü ����
		// �ڵ�����ȯ, �������̽� <- ������ü
		rc = new Audio(); // �ڵ�����ȯ, �������̽� <- ������ü
		rc.turnOn();
	}
}
