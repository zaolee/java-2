package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	// �ʵ�
	// ������
	public SmartPhone(String owner) {
		// super();
		super(owner);
	}
	// �޼ҵ�
	public void internetSearch() {
		System.out.println("web searching");
	}

}
