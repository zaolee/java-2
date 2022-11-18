package sec05.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		//Tire 인터페이스 = KumHoTire 구현객체; // 자동형변환
		myCar.forntLeftTire = new KumhoTire();
		myCar.forntRightTire = new KumhoTire();
		
		myCar.run();
	}
}	
