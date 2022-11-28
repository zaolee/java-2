package sec07_user_define_exception;

// 사용자정의 예외 클래스, 내가 예외클래스 만드는거임
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message); // 부모생성자 생성
	}
	

}
