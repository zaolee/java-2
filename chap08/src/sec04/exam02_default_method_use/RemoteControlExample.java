package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// Television 구현객체
		rc = new Television();
		rc.turnOn(); // 참조변수.추상메소드()
		rc.setMute(true); // 참조변수.디폴트메소드()로 접근가능		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
