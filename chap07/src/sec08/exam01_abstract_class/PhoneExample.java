package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone("�"); // �߻� Ŭ������ ���������� ��� ����
		SmartPhone iPhone = new SmartPhone("�");
		
		iPhone.turnOn(); // �θ𿡰� ��ӹ��� �޼ҵ�
		iPhone.internetSearch(); // �ڽ�Ŭ�������� ������ �޼ҵ�
		iPhone.turnOff(); // ���
	}
}