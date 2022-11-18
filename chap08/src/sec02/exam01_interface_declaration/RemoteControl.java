package sec02.exam01_interface_declaration;

public interface RemoteControl {
	// ���
	static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻�޼ҵ�: �������̽��� �����ϴ� ����Ŭ������ ����� �� ����(������)�ؾ��Ѵ�.
	abstract void turnOn(); // �Ű������� ������ ����, ���๮�� ����. only ����
	void turnOff(); // �߻�޼ҵ� ��������
	void setVolume(int volume);
	
	// ����Ʈ�޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("�������");
		} else {
			System.out.println("��������");
		}
	}
	
	// �����޼ҵ� -> ����� ����������
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}

}
