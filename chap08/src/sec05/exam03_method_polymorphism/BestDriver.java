package sec05.exam03_method_polymorphism;

public class BestDriver {
	// 필드
	// 생성자
	// 메소드
	// 반환값 메소드명(매개변수){실행문;}
	void BestDrive(Vehicle vehicle) { // 매개변수의 다형성을 구현하기 위해 인터페이스 타입으로 지정하기
		vehicle.run();		
	}

}
