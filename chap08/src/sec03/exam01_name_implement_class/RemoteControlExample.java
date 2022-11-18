package sec03.exam01_name_implement_class;



public class RemoteControlExample {
	static int num = 1; // 필드(멤버변수), 전역변수	
	public static void main(String[] args) {
		// rc는 참조변수, 지역변수
		RemoteControl rc;
		num = 1;
		rc = new Television();
		rc.turnOn();
		// RemoteControl 인터페이스를 구현한 Television 구현객체 생성
		// 자동형변환, 인터페이스 <- 구현객체
		rc = new Audio(); // 자동형변환, 인터페이스 <- 구현객체
		rc.turnOn();
	}
}
