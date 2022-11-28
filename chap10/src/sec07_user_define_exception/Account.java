package sec07_user_define_exception;

public class Account {
	private long balance; // 필드 

	public Account() { } // 생성자

	public long getBalance() { // 메소드, getter/setter
 		return balance;
	}	
	public void deposit(int money) {
		balance += money; // 복합대입연산자
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
		} // BalanceInsufficientException = 사용자정의 예외클래스
		balance -= money;
	}
}

