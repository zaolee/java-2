package sec04.exam03_static_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// �͸�����ü
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("�߻�޼ҵ� turnOn ����");
			}

			@Override
			public void turnOff() {
			
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		rc.turnOn(); // �߻�޼ҵ�
		rc.setMute(true); // ��������.����Ʈ�޼ҵ�
		
		RemoteControl.changeBattery(); // �������̽���.�����޼ҵ�
	}
}
