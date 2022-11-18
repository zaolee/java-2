package sec05.exam01_field_polymorphism;

public class Car {
	// 필드
	// 인터페이스 = HankookTire 구현객체; 자동형변환
	Tire forntLeftTire = new HankookTire();
	Tire forntRightTire = new HankookTire();
	Tire backlefttTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// 메소드
	void run() {
		forntLeftTire.roll();
		forntRightTire.roll();
		backlefttTire.roll();
		backRightTire.roll();
	}
	
}

