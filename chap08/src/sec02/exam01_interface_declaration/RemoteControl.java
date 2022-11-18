package sec02.exam01_interface_declaration;

public interface RemoteControl {
	// 상수
	static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상메소드: 인터페이스를 구현하는 구현클래스를 만들게 꼭 구현(재정의)해야한다.
	abstract void turnOn(); // 매개변수의 유무는 자유, 실행문은 없어. only 선언
	void turnOff(); // 추상메소드 생략가능
	void setVolume(int volume);
	
	// 디폴트메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음모드");
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 정적메소드 -> 기능을 가지고있음
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}
