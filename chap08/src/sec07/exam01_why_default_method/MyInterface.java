package sec07.exam01_why_default_method;

public interface MyInterface {
	// 상수
	// abstract 메소드
	public void method1();

	// default 메소드
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
	// static 메소드

}
