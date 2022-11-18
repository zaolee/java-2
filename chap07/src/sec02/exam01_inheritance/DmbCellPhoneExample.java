package sec02.exam01_inheritance;

// ����� Ŭ����: ���డ���� Ŭ����
public class DmbCellPhoneExample {
	// �ʵ�
	// ������
	
	// �޼ҵ�
	public static void main(String[] args) {
		System.out.println("DmbCellPhone ��ü ����"); 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�����ó�Ʈs20", "��޺��", 0); 
		// DmbCellPhone ���޸𸮾ȿ� �ش� �Ű����� �־���. CellPhone ���� null.
		// �� ó���� DmbCellPhone type���� �δ���? �ٸ��� �ش� �����ڿ� �ʿ��� ������ Ÿ���� �� �¾�
		// The constructor DmbCellPhone() is undefined : �����ڿ� �����ִ°�. (�����ڸ� �����ߴٸ� �Ű������� ���缭 ���� �������ֱ�)

		System.out.println("��: " + dmbCellPhone.model); // ��ü.�ʵ��
		System.out.println("����: " + dmbCellPhone.color);
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		System.out.println("\n�θ�(CellPhone)���κ��� ��� ���� �޼ҵ� ȣ��");
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��Ͻ�. �̼ҿ��Դϴ�.");
		dmbCellPhone.sendVoice("��,, ��~~!!");
		dmbCellPhone.hangUp();
		
		System.out.println("\n�ڽ�(DmbCellPhone) �޼ҵ� ȣ��");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(8);
		dmbCellPhone.turnOffDmb();
	}

}
