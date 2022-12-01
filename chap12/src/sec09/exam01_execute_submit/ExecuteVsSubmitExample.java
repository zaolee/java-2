package sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		// Thread Pool ����
		ExecutorService executorService = Executors.newFixedThreadPool(2); // Ǯ�ȿ��� �ΰ��� ������ ������

		for (int i = 0; i < 10; i++) { // �͸�����ü
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// ������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��"); // ���� �����尡 �׾������ ���Ӱ� ���� �ٵ� �׻� 2�� ����
				}
			};
			// Thread Pool ����
			executorService.execute(runnable); // �������̽� Runnable�� �͸�����ü�ؼ� ����
			// executorService.submit(runnable);

			Thread.sleep(10);
		}

		executorService.shutdown();
	}
}
