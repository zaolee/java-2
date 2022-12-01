package sec04.exam01_generic_method;

// Box라는 제너릭 타입: 타입을 파라미터로 가지는 클래스 or 인터페이스
public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
