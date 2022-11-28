package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		// Class ��ü ��� ���
		// 1. ��ü.getClass() ȣ��
		Car car = new Car(); // �������� ����
		Class clazz1 = car.getClass(); // car ��ü�� Ŭ���� ��ü�� ��´�.
		System.out.println(clazz1.getName()); // ��Ȯ�� Ŭ���� �̸� ���
		System.out.println(clazz1.getSimpleName()); // �����ϰ� ���
		System.out.println();
		
		// 2. Class.forName("���ڿ�") ȣ���ؼ� Class��ü�� ��´�
		try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println(clazz2.getPackageName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
