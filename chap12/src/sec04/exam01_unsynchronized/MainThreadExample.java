package sec04.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // �۾������� ���� user1 : 100
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2(); // 50
		user2.setCalculator(calculator);
		user2.start();
	}
	// ����ϸ� �Ѵ� 50�� ��µ�.. ��? ����1(100) �Է½� 2�ʰ� ���߰�, �׶� ����2(50) �ԷµǾ� �����ϱ�
	// ���� 50���� �ٲ�� �ǰ� ����1�� ��µɶ� ���� ����2�� �ڿ� ���� ���¶� 50�� �Ǿ���� ������.
	// �׷��� 100�̶� ���� ����������.. �̷��� �ð� ���� ������ �̷� ������ �߻��� �� ����...
	// ����ȭ�޼ҵ�, ����ȭ��� �Ἥ �� ���� ���ֱ�.
}

