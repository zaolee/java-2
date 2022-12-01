package sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100); // 100 : Integer타입
		// <T> 리턴타입 boxing(T t), 여기서 리턴타입은 Box<T> = Box<Integer>
		int inValue = box1.get(); // unboxing, int = Integer
		
		Box<String> box2 = Util.boxing("쏘연"); // Util.<String>boxing("쏘연");
		String strValue = box2.get();
	}
}
