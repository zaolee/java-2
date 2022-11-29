package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	// main Thread�� mail() �޼ҵ带 �����Ѵ�.
	public static void main(String[] args) {
		// how1 : ������ü
		Runnable beepTask = new BeepTask();
		// �۾������� ����: multi thread ȯ��
		// 1. Thread Ŭ�����κ��� ���� ����
		Thread thread = new Thread(beepTask); // �۾������� ������
		
		// how2 : �͸�����ü
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
		
		// how3 : ���ٽ�(�͸�����ü�� ������ ǥ���� ��) ���� how2 ���� how3�� ���� ���
		/*Thread thread = new Thread(() -> { // '->' ����Ű�� ���� ������ �����ض�
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		}); */
		
		thread.start(); // �۾������� (���ν����� �ȿ��� ���� : ���ı�������..)
		
		for(int i=0; i<5; i++) { // ���ν�����
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	} // �۾�������� ���ν����尡 ���ÿ� ��� (�� ������ ����� ���ÿ�)
}


