package sec04.exam01_generic_method;

public class Util {
	// ���ʸ� �޼ҵ�
	public static <T> Box<T> boxing(T t) { 
		// boxing�� �Ű����� : TŸ���� ���� t, boxing�� ����Ÿ���� Box<T>, <T>: ���ʸ� Ÿ��
		Box<T> box = new Box<T>();
		box.set(t);
		return box; // -> Box<T>�� ���ϵ�.
	}
}
