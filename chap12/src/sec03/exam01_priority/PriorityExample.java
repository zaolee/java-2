package sec03.exam01_priority;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); 
				// i�� 1���� 9�ΰ�� 1�� �ο�
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
				// i �� 10 �ΰ�� 10 �ο�, �켱���� ���� ����
			} // �ٵ� �̰� Ȯ���̰� ���������ΰ� �ƴ�.... 
			thread.start();
		}
	}
}

