package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		// main������
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) { // ���� �� 10�� �� ������
			toolkit.beep();
			try {
				Thread.sleep(3000); // �Ͻ��������·� ������. 
				// �ٵ� �ѹ� ���� 3�� �Ͻ������ϱ� 1���� 3�� �������� 10�� �︲.
				// 3�� �ڿ� runnable �� ���°� 
			} catch(InterruptedException e) {			
			}		
		}	
	}
}
