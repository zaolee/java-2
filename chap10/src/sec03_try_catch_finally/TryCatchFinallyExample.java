package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			// ���ܹ߻������� �ڵ�
			Class clazz = Class.forName("java.lang String2");
			// Class.forName("���ڿ�")���ڿ��� �ش��ϴ� Ŭ���� ��ü �����Ͽ� ��ȯ�Ѵ�.
		} catch(ClassNotFoundException e) { 
			// ()-> Exception �ڵ�� ����ó���߿� ���� ���� �ڵ�, �ƴϸ� ��ü���� ���� ����� ClasCastException e ��..
			// ����ó���ڵ�
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			
		}
		
	}
}

