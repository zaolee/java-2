package sec04.exam02_synchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		// CalculatorŬ������ ����ȭ�޼ҵ� ���༭ ����1�� 100�� ����.
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	} 
}
// ��� ����1�� ����� �Ǵٽ� 2�ʵڿ� ����2�� ���ͼ� ��������?
// �̷� ���� �������� ���ָ� ��..
