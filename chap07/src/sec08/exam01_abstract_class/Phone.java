package sec08.exam01_abstract_class;

public abstract class Phone { // Ŭ���� �����Ҷ� �߻�Ŭ���� üũ�ϰ� �ֱ�
	// �߻�Ŭ������ �������
	// �ʵ�
	public String owner;
	
	// ������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// �Ϲݸ޼ҵ�
	public void turnOn() {
		System.out.println("�ڵ��� ������ �ѿ�~~");
	}
	
	// �߻�޼ҵ�
	void turnOff() {
		System.out.println("�ڵ��� ������ ����~~");
	}

}
