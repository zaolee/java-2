package sec08.exam02_abstract_method;

public abstract class Animal {
	// �ʵ�
	public String kind;
	
	// ������
	
	// �Ϲݸ޼ҵ�
	public void breath() {
		System.out.println("������ ���� ����.");
	}
	
	// �߻�޼ҵ�
	public abstract void Sound(); // ��ӹ��� Ŭ�������� �긦 �� ������ �ϱ�.

}
