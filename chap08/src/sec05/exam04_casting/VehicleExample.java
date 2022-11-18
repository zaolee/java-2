package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		
		// 인터페이스 = 구현객체, 자동형 변환
		Vehicle vehicle = new Bus();

		vehicle.run();
		//vehicle.checkFare(); (x) 이 기능은 Bus에 잇는거라 참조변수는 넣을수 없어.. 참조형 축소
		// 참조영역이 축소되어 보이지 않는다.

		Bus bus = (Bus) vehicle;  //강제타입변환, 구현클래스 = (구현클래스) 인터페이스
		// 먼저 형변환 된 자만이... 강제타입변환이 가능하다는 사실.. 아시나요..?
		// Taxi taxi = (Taxi) vehicle; 이런식으로 막상 보면 에러가 안나는듯하지만 안돼 ㅋ 
		

		bus.run();
		bus.checkFare(); // 참조영역이 확대된다.
	}
}
