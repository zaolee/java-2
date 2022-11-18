package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}	
	
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
	
	// 인터페이스 C는 인터페이스 A,B를 상속받았기 때문에 인터페이스C를 사용하는 임플리테이션C는 추상메소드를 다 구현해줘야돼
}


