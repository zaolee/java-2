package sec04.exam01_generic_method;

// Box��� ���ʸ� Ÿ��: Ÿ���� �Ķ���ͷ� ������ Ŭ���� or �������̽�
public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
