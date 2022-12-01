package sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		// Thread Pool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2); // 풀안에다 두개의 스래스 생성함

		for (int i = 0; i < 10; i++) { // 익명구현객체
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// 스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
					// 예외 발생 시킴
					int value = Integer.parseInt("삼"); // 기존 스레드가 죽어버려서 새롭게 생성 근데 항상 2개 유지
				}
			};
			// Thread Pool 실행
			executorService.execute(runnable); // 인터페이스 Runnable를 익명구현객체해서 넣음
			// executorService.submit(runnable);

			Thread.sleep(10);
		}

		executorService.shutdown();
	}
}
