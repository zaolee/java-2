package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision(); // Ŭ���� Ÿ��
		
		RemoteControl rc = tv; // �������̽� Ÿ�� = ������ü(�ڵ�����ȯ)
		Searchable searchable = tv;
	}
}
