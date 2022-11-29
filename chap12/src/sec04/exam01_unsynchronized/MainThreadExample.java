package sec04.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // 작업스레드 생성 user1 : 100
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2(); // 50
		user2.setCalculator(calculator);
		user2.start();
	}
	// 출력하면 둘다 50이 출력됨.. 왜? 유저1(100) 입력시 2초간 멈추고, 그때 유저2(50) 입력되어 들어오니까
	// 값이 50으로 바뀌게 되고 유저1이 출력될땐 값이 유저2가 뒤에 들어온 상태라 50이 되어버린 상태임.
	// 그래서 100이란 값이 없어져버려.. 이렇게 시간 제한 있으면 이런 오류가 발생할 수 있음...
	// 동기화메소드, 동기화블록 써서 이 오류 없애기.
}

