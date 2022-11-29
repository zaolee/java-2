package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	// java -> main 스레드가 main() 메소드를 실행한다.
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep(); // 소리가 삑하고 나옴
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("띵"); // 소리가 5번 출력된뒤에 띵 이 5번 출력 
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
