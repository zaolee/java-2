package sec02_runtime_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = new String(); // = null; �� �ᵵ ��. �Ѵ� ������
		System.out.println(data.toString()); // NullpointException �߻�
	} // ���ܰ� �߻��ϸ� ���α׷��� ������������ ����Ǳ� ������ ���� �۾����� ��������ʾ�.
	
}

