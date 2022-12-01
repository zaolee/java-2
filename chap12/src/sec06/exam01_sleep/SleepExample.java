package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		// main스레드
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) { // 원래 총 10번 쭉 나겟지
			toolkit.beep();
			try {
				Thread.sleep(3000); // 일시정지상태로 보낸다. 
				// 근데 한번 돌때 3초 일시정지니까 1번씩 3초 간경으로 10번 울림.
				// 3초 뒤에 runnable 로 가는거 
			} catch(InterruptedException e) {			
			}		
		}	
	}
}
