package sec03.exam03_multi_implement_class;

// 다중 인터페이스를 구현한 구현 클래스
// 상속은 부모클래스를 다중으로 구현할 수 없지만, 인터페이스는 다중으로 구현할 수 있다
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
