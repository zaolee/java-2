package sec05.exam01_field_polymorphism;

// Tire인터페이스의 HankookTire 구현클래스
public class HankookTire implements Tire {

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다람쥐");
		
	}
	
}
