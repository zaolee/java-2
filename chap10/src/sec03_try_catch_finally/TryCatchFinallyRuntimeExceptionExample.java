package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			// ���ܹ߻������� �ڵ� �Է�
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) { 
			// ����ó�� �ڵ� �Է�
			System.out.println("[������]");
			System.out.println("java ClassName num1 num2");
			return; // main() �޼ҵ带(���α׷�) ����
		}
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		// args �� �־��ָ� ���� �߻� ����
		
		try {
			// ���ܹ߻������� �ڵ�
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(NumberFormatException e) {
			// ����ó�� �ڵ�
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			// ������ �����ϴ� �ڵ�
			System.out.println("�̾�ȣ");
		}
	}
}

