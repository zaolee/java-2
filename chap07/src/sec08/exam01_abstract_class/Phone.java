package sec08.exam01_abstract_class;

public abstract class Phone { // 클래스 생성할때 추상클래스 체크하고 넣기
	// 추상클래스의 구성멤버
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 일반메소드
	public void turnOn() {
		System.out.println("핸드폰 전원을 켜요~~");
	}
	
	// 추상메소드
	void turnOff() {
		System.out.println("핸드폰 전원을 꺼요~~");
	}

}
