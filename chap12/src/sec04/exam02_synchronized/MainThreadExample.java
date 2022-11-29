package sec04.exam02_synchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		// Calculator클래스에 동기화메소드 써줘서 유저1은 100이 나옴.
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	} 
}
// 대신 유저1이 출력후 또다시 2초뒤에 유저2가 나와서 느릴수도?
// 이런 오류 있을때만 써주면 돼..
