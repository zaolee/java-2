package sec07.exam01_why_default_method;

// 구현글래스
public class MyClassA implements MyInterface {
	// 필드
	// 생성자
	public MyClassA() {
		// 기본생성자
	}
	
	// 메소드
	@Override
	public void method1() {
		System.out.println("MyClassA-method1() 실행");
		
	}
}
