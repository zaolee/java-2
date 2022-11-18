package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision(); // 클래스 타입
		
		RemoteControl rc = tv; // 인터페이스 타입 = 구현객체(자동형변환)
		Searchable searchable = tv;
	}
}
