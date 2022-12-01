package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		// �������̽� ��������
		MyFunctionalInterface fi;

		// �������̽� = �͸�����ü
		fi = new MyFunctionalInterface() {

			@Override
			public void method() {
				String str = "method call1";
				System.out.println(str);
			}
		};
		fi.method();

		// �������̽� -> ���ٽ�
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		// �̷��� ǥ������
		fi = () -> System.out.println("method call1");
		fi.method();
		
	}
}
