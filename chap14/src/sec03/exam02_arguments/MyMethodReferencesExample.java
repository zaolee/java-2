package sec03.exam02_arguments;

public class MyMethodReferencesExample { 
	public static void main(String[] args) {
		// �������̽� ��������
		MyFunctionalInterface fi;
		
		// �͸�����ü
		fi = new MyFunctionalInterface() {
			@Override
			public void method(int x, int y) {
				int result = x * y;
				System.out.println(result);
			}			
		};
		fi.method(5, 5);
		
		// ���ٽ� : �͸�����ü�� ������ ǥ���� ��
		fi = (x, y) -> { // �Ű������� �ϳ��� () ������ ����������, �ΰ��̱� ������ ���� �Ұ�
			int result = x * y;
			System.out.println(result);
		};
		fi.method(5, 5);
	}
}











