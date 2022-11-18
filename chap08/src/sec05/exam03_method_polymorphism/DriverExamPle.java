package sec05.exam03_method_polymorphism;

public class DriverExamPle {

	public static void main(String[] args) {
		BestDriver driver = new BestDriver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.BestDrive(bus); // Vehicle vehicle = new Bus(); 자동형변환
		driver.BestDrive(taxi); // 매개변수의 다형성

	}

}

// 추상클래스 vs 인터페이스
// "통일"		  "다형성"