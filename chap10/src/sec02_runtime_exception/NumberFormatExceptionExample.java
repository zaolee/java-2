package sec02_runtime_exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100"; // ����
		String data2 = "a100"; // ���� -> ���⼭ a�� ���ڷ� ���� ����
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // Integer.parseInt("���ڿ�") : ���ڿ� -> ����
		// NumberFormatException �߻�, ���� �ؿ� �ڵ�� ���� ����
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}

