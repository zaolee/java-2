package sec03.exam02_noname_implement_class;


public class RemoteControlExample {	
	public static void main(String[] args) {
		// ������Ű���� Ƽ��, ����� Ŭ���� ���ε��� �� ���� �����ߴµ� �̰� �ѹ��� ��������.
		// ����?
		// ���� 2u : class�� �ȸ���� ��ü������ �����ϱ� ������ �������� ��
		// �ٸ� ������ class�� ����°� �̵���, ��ȸ������ ���� �͸�����ü ����ϴ°� �̵�
		
		// �͸�����ü = new �������̽���(){};
		// �͸�����ü�� ����Ŭ������ �������� �ʰ� ��ü�� ���� �� �ִ�. ��ȸ��
		// ���ٽ��� �͸�����ü�� �ܷ��� ǥ���ϴ� ��
		
		RemoteControl rc = new RemoteControl() { 

			@Override
			public void turnOn() {
				System.out.println("�͸�����ü�� turnOn() ����");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		rc.turnOn();
		
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("�͸�����ü2�� turnOn() ����");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
		rc.turnOn();
	}
		

}
