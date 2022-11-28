package sec07.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// m1:참조형지역변수. 
		MyInterface mi1 = new MyClassA();
		mi1.method1(); // MyClassA-method1() 실행
		mi1.method2(); // 기존 MyInterface 내용으로 출력 
		
		mi1 = new MyClassB();
		mi1.method1(); // MyClassB-method1() 실행
		mi1.method2(); // 재정의 되서 MyClassB-method 내용으로 출력 -> 디폴트 메소드 쓰는이유

	}

}
