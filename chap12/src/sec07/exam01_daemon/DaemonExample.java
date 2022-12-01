package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		// 주(main)스레드
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // 작업스레드
		autoSaveThread.setDaemon(true); // 작업스레드 -> 데몬스레드로 변경
		// 보조역할 : main이 멈추면 얘도 멈춤, 데몬이 없으면 메인이 끝나도 작업스레드는 계속해서 출력함..
		autoSaveThread.start(); 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}
}
