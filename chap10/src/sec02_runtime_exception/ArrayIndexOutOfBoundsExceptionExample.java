package sec02_runtime_exception;

/*public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}*/

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) { // String �迭�� args�� ���´�.
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			// String data3 = args[2]; ArrayIndexOutOfBoundsException
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[������]");
			System.out.println("ajva className �Ű�����1 �Ű�����2");
		} // �̷��� if���� ���� ���ܹ߻����� �ʰ� �����
		
		// �ش� class ��Ŭ�� -> run as -> run configuration -> arg ����.

	}
}
