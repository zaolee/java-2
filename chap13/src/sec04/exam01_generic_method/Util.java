package sec04.exam01_generic_method;

public class Util {
	// 제너릭 메소드
	public static <T> Box<T> boxing(T t) { 
		// boxing의 매개변수 : T타입의 변수 t, boxing의 리턴타입은 Box<T>, <T>: 제너릭 타입
		Box<T> box = new Box<T>();
		box.set(t);
		return box; // -> Box<T>로 리턴됨.
	}
}
