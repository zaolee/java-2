package sec07_user_define_exception;

// ��������� ���� Ŭ����, ���� ����Ŭ���� ����°���
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message); // �θ������ ����
	}
	

}
