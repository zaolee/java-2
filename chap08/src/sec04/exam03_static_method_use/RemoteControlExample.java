package sec04.exam03_static_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// 익명구현객체
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("추상메소드 turnOn 실행");
			}

			@Override
			public void turnOff() {
			
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		rc.turnOn(); // 추상메소드
		rc.setMute(true); // 참조변수.디폴트메소드
		
		RemoteControl.changeBattery(); // 인터페이스명.정적메소드
	}
}
