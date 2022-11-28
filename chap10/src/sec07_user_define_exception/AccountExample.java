package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(15000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // e.getMessage()는 문자열을 반환한다.
			System.out.println(message);
			e.printStackTrace(); // e.printStackTrace()는 예외에 대한 상세 정보를 반환한다.
		}
		
	}
}
