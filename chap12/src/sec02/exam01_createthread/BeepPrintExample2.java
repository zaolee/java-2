package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	// main Thread가 mail() 메소드를 실행한다.
	public static void main(String[] args) {
		// how1 : 구현객체
		Runnable beepTask = new BeepTask();
		// 작업스레드 생성: multi thread 환경
		// 1. Thread 클래스로부터 직접 생성
		Thread thread = new Thread(beepTask); // 작업스레드 생성됨
		
		// how2 : 익명구현객체
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		}); */
		
		// how3 : 람다식(익명구현객체를 간략히 표현한 식) 보통 how2 보다 how3을 많이 사용
		/*Thread thread = new Thread(() -> { // '->' 가르키는 이후 내용을 실행해라
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		}); */
		
		thread.start(); // 작업스레드 (메인스레드 안에서 생성 : 병렬구조마냥..)
		
		for(int i=0; i<5; i++) { // 메인스레드
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	} // 작업스레드와 메인스레드가 동시에 출력 (띵 음성과 출력이 동시에)
}


