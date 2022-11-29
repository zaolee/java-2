package sec03.exam01_priority;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); 
				// i가 1부터 9인경우 1로 부여
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
				// i 가 10 인경우 10 부여, 우선순위 제일 높음
			} // 근데 이거 확률이고 무조건적인건 아님.... 
			thread.start();
		}
	}
}

