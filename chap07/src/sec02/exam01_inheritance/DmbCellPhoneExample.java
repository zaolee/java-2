package sec02.exam01_inheritance;

// 실행용 클래스: 실행가능한 클래스
public class DmbCellPhoneExample {
	// 필드
	// 생성자
	
	// 메소드
	public static void main(String[] args) {
		System.out.println("DmbCellPhone 객체 생성"); 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시노트s20", "용달블루", 0); 
		// DmbCellPhone 힙메모리안에 해당 매개변수 넣어짐. CellPhone 안은 null.
		// 왜 처음에 DmbCellPhone type으로 두는지? 다른건 해당 생성자에 필요한 데이터 타입이 안 맞아
		// The constructor DmbCellPhone() is undefined : 생성자에 문제있는거. (생성자를 생성했다면 매개변수에 맞춰서 형식 변경해주기)

		System.out.println("모델: " + dmbCellPhone.model); // 객체.필드명
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		System.out.println("\n부모(CellPhone)으로부터 상속 받은 메소드 호출");
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세욜");
		dmbCellPhone.receiveVoice("안녕하슈. 이소연입니다.");
		dmbCellPhone.sendVoice("아,, 네~~!!");
		dmbCellPhone.hangUp();
		
		System.out.println("\n자식(DmbCellPhone) 메소드 호출");
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(8);
		dmbCellPhone.turnOffDmb();
	}

}
