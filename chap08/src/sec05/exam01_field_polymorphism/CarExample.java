package sec05.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		//Tire �������̽� = KumHoTire ������ü; // �ڵ�����ȯ
		myCar.forntLeftTire = new KumhoTire();
		myCar.forntRightTire = new KumhoTire();
		
		myCar.run();
	}
}	
