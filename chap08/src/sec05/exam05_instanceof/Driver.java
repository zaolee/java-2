package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) { // ���������� if ����

		if(vehicle instanceof Bus) {
			
			Bus bus = (Bus) vehicle; // ������ ��ȯ
			bus.checkFare();
		}
		vehicle.run();	
		
	}
}
