package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("�"); // Object = String, �ڵ�����ȯ
		String name = (String)box.get(); // ��������ȯ, String = (String)Object
		
		box.set(new Apple()); // Object = Apple, �ڵ�����ȯ
		Apple apple = (Apple)box.get(); // Apple = (Apple) Object, ��������ȯ
		
	}

}
