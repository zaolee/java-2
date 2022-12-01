package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("쏘연"); // Object = String, 자동형변환
		String name = (String)box.get(); // 강제형변환, String = (String)Object
		
		box.set(new Apple()); // Object = Apple, 자동형변환
		Apple apple = (Apple)box.get(); // Apple = (Apple) Object, 강제형변환
		
	}

}
