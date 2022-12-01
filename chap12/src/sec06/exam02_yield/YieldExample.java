package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = false; 
		// 3초뒤에 threadA.work : false (참고로 threadA는 true) -> 이후엔 B만 출력됨.
		// threadA가 양보

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = true; // 양보안하겠다. 번갈아가면서 나올듯.

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		} 
		// 총 딱 9초동안 진행됨
		// 처음 3초 -> 번갈아가면서
		// 3~6초 -> B만 출력
		// 6~9초 -> 번갈아가면서
		/// 종료..
		threadA.stop = true;
		threadB.stop = true; 
	}
}
