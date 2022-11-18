package sec02.exam01_inheritance;

// API��(library��) Ŭ����: main �޼ҵ尡 ���� Ŭ����, ��ü������ �ȵ�.
public class DmbCellPhone extends CellPhone {
	// Ŭ������ �������
	// �ʵ�
	int channel;
	
	// ������
	DmbCellPhone(String model, String color, int channel){
		super(); // �θ�����ڸ� ȣ���Ͽ� �θ�ü�� �����Ѵ�. 
		// �����ص� �����Ϸ��� �˾Ƽ� ������ ����, ��� �θ� �⺻������ �����Ǿ� �־����.
		this.model = model; // �θ��ʵ� ��ӹ޾� ��
		this.color = color; // ���
		this.channel = channel; // ����
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ���� �����մϴ�.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}

