package sec04.exam01_overriding;

public class Computer extends Calculator {

	@Override // ������
	double areaCircle(double r) {
		System.out.println("CPU��ü�� areaCircle() ����");
		return Math.PI * r * r; 
		// MathŬ������ java.lang�̶� imput���ص� ��.
	}
	
	
	
	
}


