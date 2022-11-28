package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		// Class 객체 얻는 방법
		// 1. 객체.getClass() 호출
		Car car = new Car(); // 정적으로 고정
		Class clazz1 = car.getClass(); // car 객체의 클래스 객체를 얻는다.
		System.out.println(clazz1.getName()); // 정확한 클래스 이름 출력
		System.out.println(clazz1.getSimpleName()); // 심플하게 출력
		System.out.println();
		
		// 2. Class.forName("문자열") 호출해서 Class객체를 얻는다
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
