package sec05.exam01_field_polymorphism;

public class Car {
	// �ʵ�
	// �������̽� = HankookTire ������ü; �ڵ�����ȯ
	Tire forntLeftTire = new HankookTire();
	Tire forntRightTire = new HankookTire();
	Tire backlefttTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// �޼ҵ�
	void run() {
		forntLeftTire.roll();
		forntRightTire.roll();
		backlefttTire.roll();
		backRightTire.roll();
	}
	
}

