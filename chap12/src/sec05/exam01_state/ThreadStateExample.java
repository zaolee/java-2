package sec05.exam01_state;

public class ThreadStateExample {
	public static void main(String[] args) {
		// 작업스레드 생성
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start(); // 작업스레드 실행 statePrintThread.run 실행
	}
}
