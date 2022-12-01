package sec02.exam02_generic_type;

// 제네릭 타입 : class<T>, interface<T>
public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
