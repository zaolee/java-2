package sec03.exam03_tostring;

public class SmartPhone {
	// �ʵ�
	private String company;
	private String os;
	
	// ������ = ��ü�� �����ϰ�, �ʵ带 �ʱ�ȭ �Ѵ�.
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	// �޼ҵ�

	@Override
	public String toString() {
		return "�� ���� " + company + " " + os + "�Դϴ�.";
	}
	
//	public void information() {	
//		System.out.println("�� ���� " + company + " " + os + "�Դϴ�.");
//	}
	
//	public information() {
//		return "�� ���� " + company + " " + os + "�Դϴ�.";
//}

	
	
}
