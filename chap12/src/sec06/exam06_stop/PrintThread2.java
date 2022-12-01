package sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1 : interrupted()를 실행시켜 일시정지 상태로 변경하여 예외(exception)를 발생
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}	
		} catch(InterruptedException e) {		
		}
		
		//how2 : runnable/ run인 상태인경우, thread.interrupted()를 실행시켜도
		// 예외가 발생하지 않음으로 Thread.interruptes() 이용한다.
//		while(true) {
//			System.out.println("실행 중");
//			/*
//			if(Thread.interrupted()) {
//				break;
//			}
//			*/
//		}
		
		//System.out.println("자원 정리");
		//System.out.println("실행 종료");
	}
}

