package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "������";
	}

	@Override // �߻�޼��带 �����Ѵ�. implementation
	public void Sound() {
		System.out.println("�۸��̴� �߿�");

	}

}
