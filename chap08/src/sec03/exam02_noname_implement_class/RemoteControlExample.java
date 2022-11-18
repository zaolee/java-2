package sec03.exam02_noname_implement_class;


public class RemoteControlExample {	
	public static void main(String[] args) {
		// 이전패키지는 티비, 오디오 클래스 따로따로 다 만들어서 실행했는데 이건 한번에 구현가능.
		// 개꿀?
		// 쓰는 2u : class를 안만들고 객체생성이 용이하기 때문에 유지보수 굿
		// 다만 재사용은 class를 만드는게 이득임, 일회용으로 쓸땐 익명구현객체 사용하는게 이득
		
		// 익명구현객체 = new 인터페이스명(){};
		// 익명구현객체를 구현클래스를 생성하지 않고 객체를 만들 수 있다. 일회성
		// 람다식은 익명구현객체를 단략히 표현하는 식
		
		RemoteControl rc = new RemoteControl() { 

			@Override
			public void turnOn() {
				System.out.println("익명구현객체의 turnOn() 실행");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		rc.turnOn();
		
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명구현객체2의 turnOn() 실행");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
		rc.turnOn();
	}
		

}
