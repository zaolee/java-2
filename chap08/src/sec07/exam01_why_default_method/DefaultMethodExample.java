package sec07.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// m1:��������������. 
		MyInterface mi1 = new MyClassA();
		mi1.method1(); // MyClassA-method1() ����
		mi1.method2(); // ���� MyInterface �������� ��� 
		
		mi1 = new MyClassB();
		mi1.method1(); // MyClassB-method1() ����
		mi1.method2(); // ������ �Ǽ� MyClassB-method �������� ��� -> ����Ʈ �޼ҵ� ��������

	}

}
