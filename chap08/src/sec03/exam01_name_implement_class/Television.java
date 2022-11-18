package sec03.exam01_name_implement_class;

// remoteControl 인터페이스를 구현한 구현클래스
public class Television implements RemoteControl {
	// 처음에 생성하면 다시 재정의 하라고 이름에 에러뜸. 그럼 add뭐시키 클릭하면됨.
	
	// 필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 키겠다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끄겠다.");
		
	}

	@Override // 재정의를 통해 인터페이스의 추상메소드를 구현함.
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨은 " + volume + "입니다.");
	}

}
