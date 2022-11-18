package sec04.exam01_abstract_method_use;

interface IHello4 { // �������̽�
	void sayHello(String name); // public abstract�� ������ �� �ִ�.
}

abstract class GoodBye4 { // �߻� Ŭ����
	public abstract void sayGoodBye4(String name); // public abstract�� ������ �� ����.
}

class SubClass4 extends GoodBye4 implements IHello4 {
	public void sayHello(String name) {
		System.out.println(name + "�� �ȳ��ϼ���!");
	}

	public void sayGoodBye4(String name) {
		System.out.println(name + "�� �ȳ��� ������!");
	}
}

public class InterfaceTest04 {
	public static void main(String[] args) {
		SubClass4 test = new SubClass4();
		test.sayHello("ȫ�浿");
		test.sayGoodBye4("�̼���");
	}
}
