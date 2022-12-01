package sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100); // 100 : IntegerŸ��
		// <T> ����Ÿ�� boxing(T t), ���⼭ ����Ÿ���� Box<T> = Box<Integer>
		int inValue = box1.get(); // unboxing, int = Integer
		
		Box<String> box2 = Util.boxing("�"); // Util.<String>boxing("�");
		String strValue = box2.get();
	}
}
