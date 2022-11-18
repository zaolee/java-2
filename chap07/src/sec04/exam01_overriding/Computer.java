package sec04.exam01_overriding;

public class Computer extends Calculator {

	@Override // 재정의
	double areaCircle(double r) {
		System.out.println("CPU객체의 areaCircle() 실행");
		return Math.PI * r * r; 
		// Math클래스는 java.lang이라 imput안해도 됨.
	}
	
	
	
	
}


