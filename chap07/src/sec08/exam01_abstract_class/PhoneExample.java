package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone("쏘연"); // 추상 클래스는 직접적으로 사용 못해
		SmartPhone iPhone = new SmartPhone("쏘연");
		
		iPhone.turnOn(); // 부모에게 상속받은 메소드
		iPhone.internetSearch(); // 자식클래스에서 정의한 메소드
		iPhone.turnOff(); // 상속
	}
}