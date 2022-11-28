package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		
		// ����ϱ�
		try {
			account.withdraw(15000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // e.getMessage()�� ���ڿ��� ��ȯ�Ѵ�.
			System.out.println(message);
			e.printStackTrace(); // e.printStackTrace()�� ���ܿ� ���� �� ������ ��ȯ�Ѵ�.
		}
		
	}
}
