package sec05.exam01_state;

// ����Ŭ����
public class TargetThread extends Thread {	
	public void run() {
		for(long i=0; i<1000000000; i++) {}
		
		try {
			//1.5�ʰ� ����Ǵ°�. -> runnable�� �ִٰ� timed_waitting���� �Ͻ�������.
			Thread.sleep(1500); // 0.5�� ������ ������ 1.5�ʰ� �������´ϱ� �Ͻ������� ����� �Ǵ°�
		} catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {}
	}
}

