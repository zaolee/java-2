package verify.exam00;

public class SleepThreadMain {
	public static void main(String[] args) {
		SleepThread t1 = new SleepThread("a");
		SleepThread t2 = new SleepThread("b");
		SleepThread t3 = new SleepThread("c");

		t2.setPriority(7);// 1~10 Ŭ���� �켭����
		t1.start();// t2�� t1���� �켱������
		try {
			t1.join();// t1�� ������ t2, t3�� �����Ѵ�.
		} catch (InterruptedException ite) {
		}
		t2.start();
		t3.start();
	}
}
