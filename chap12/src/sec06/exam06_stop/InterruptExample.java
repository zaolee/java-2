package sec06.exam06_stop;

public class InterruptExample {
	public static void main(String[] args)  {
		Thread thread = new PrintThread2(); // 작업스레드 생성
		thread.start(); // 작업스레드 실행
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt(); // 작업스레드에 interrupt() 실행
	}
}
