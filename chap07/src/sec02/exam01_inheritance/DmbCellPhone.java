package sec02.exam01_inheritance;

// API용(library용) 클래스: main 메소드가 없는 클래스, 자체실행이 안됨.
public class DmbCellPhone extends CellPhone {
	// 클래스의 구성멤버
	// 필드
	int channel;
	
	// 생성자
	DmbCellPhone(String model, String color, int channel){
		super(); // 부모생성자를 호출하여 부모객체를 생성한다. 
		// 생략해도 컴파일러가 알아서 컴파일 해줌, 대신 부모에 기본생성자 생성되어 있어야함.
		this.model = model; // 부모필드 상속받아 옴
		this.color = color; // 상속
		this.channel = channel; // 생성
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신 시작합니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}

