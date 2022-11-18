package sec03.exam01_name_implement_class;

// remoteControl �������̽��� ������ ����Ŭ����
public class Television implements RemoteControl {
	// ó���� �����ϸ� �ٽ� ������ �϶�� �̸��� ������. �׷� add����Ű Ŭ���ϸ��.
	
	// �ʵ�
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� Ű�ڴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ڴ�.");
		
	}

	@Override // �����Ǹ� ���� �������̽��� �߻�޼ҵ带 ������.
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("���� TV ������ " + volume + "�Դϴ�.");
	}

}
