package sec04.exam01_overriding;

public class Calculator {
	// 메소드
	double areaCircle(double r) { // 여기서 double은 반환값(return값)
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r; 
	}
}

