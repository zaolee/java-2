package sec05.exam01_state;

// 하위클래스
public class TargetThread extends Thread {	
	public void run() {
		for(long i=0; i<1000000000; i++) {}
		
		try {
			//1.5초간 진행되는거. -> runnable에 있다가 timed_waitting으로 일시정지됨.
			Thread.sleep(1500); // 0.5초 단위로 봤을때 1.5초간 정지상태니까 일시정지로 출력이 되는거
		} catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {}
	}
}

