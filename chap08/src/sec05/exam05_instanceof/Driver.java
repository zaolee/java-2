package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) { // 오류방지로 if 써줘

		if(vehicle instanceof Bus) {
			
			Bus bus = (Bus) vehicle; // 강제형 변환
			bus.checkFare();
		}
		vehicle.run();	
		
	}
}
