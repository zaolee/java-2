package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// Television ������ü
		rc = new Television();
		rc.turnOn(); // ��������.�߻�޼ҵ�()
		rc.setMute(true); // ��������.����Ʈ�޼ҵ�()�� ���ٰ���		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
