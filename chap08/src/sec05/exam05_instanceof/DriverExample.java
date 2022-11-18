package sec05.exam05_instanceof;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // vehicle 인터페이스 = Bus 구현객체, 자동형변환
		driver.drive(taxi);
	}
	
	
}

