package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = false; 
		// 3�ʵڿ� threadA.work : false (����� threadA�� true) -> ���Ŀ� B�� ��µ�.
		// threadA�� �纸

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = true; // �纸���ϰڴ�. �����ư��鼭 ���õ�.

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		} 
		// �� �� 9�ʵ��� �����
		// ó�� 3�� -> �����ư��鼭
		// 3~6�� -> B�� ���
		// 6~9�� -> �����ư��鼭
		/// ����..
		threadA.stop = true;
		threadB.stop = true; 
	}
}
