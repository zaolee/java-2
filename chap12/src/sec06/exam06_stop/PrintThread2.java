package sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1 : interrupted()�� ������� �Ͻ����� ���·� �����Ͽ� ����(exception)�� �߻�
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);
			}	
		} catch(InterruptedException e) {		
		}
		
		//how2 : runnable/ run�� �����ΰ��, thread.interrupted()�� ������ѵ�
		// ���ܰ� �߻����� �������� Thread.interruptes() �̿��Ѵ�.
//		while(true) {
//			System.out.println("���� ��");
//			/*
//			if(Thread.interrupted()) {
//				break;
//			}
//			*/
//		}
		
		//System.out.println("�ڿ� ����");
		//System.out.println("���� ����");
	}
}

