package sec04.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		// synchronized 동기화 시켜주는거. 동기화 메소드..
		// setMemory 이 스레드로 들어오는 자료들이 synchronized 이거 혜택 받을수 있음..
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}

