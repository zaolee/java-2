package assignment;

public class MyRunMain {

	public static void main(String[] args) {
		MyRun mr1 = new MyRun(); // 1.Runnable 인터페이스의 MyRun 구현 객체
		Thread t1 = new Thread(mr1); // 작업 스레드 생성
		Thread t2 = new MyThread() { // 작업 스레드 생성 2.Thread의 하위 클래스 객체
			@Override
			public void run() {
				for(int i=0; i<500; i++) {
					System.out.print("T");
				}
			}
		};
		
		Thread main = Thread.currentThread();
		main.setPriority(10);
		t1.setPriority(1);
		t2.setPriority(5); // 우선순위 부여한거.
		
		t1.start(); // 작업스레드 실행
		t2.start(); // 작업스레드 실행
		for (int i = 0; i < 500; i++) {
			System.out.print("M");
		}		
		// 총 3개의 스레드가 동시에 실행되는거.
	}

}
