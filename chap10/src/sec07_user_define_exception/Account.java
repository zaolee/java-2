package sec07_user_define_exception;

public class Account {
	private long balance; // �ʵ� 

	public Account() { } // ������

	public long getBalance() { // �޼ҵ�, getter/setter
 		return balance;
	}	
	public void deposit(int money) {
		balance += money; // ���մ��Կ�����
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����:"+(money-balance)+" ���ڶ�");
		} // BalanceInsufficientException = ��������� ����Ŭ����
		balance -= money;
	}
}

