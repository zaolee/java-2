package sec13.exam01_math;

public class MathRandomExample {
	public static void main(String[] args) {
		int num1 = (int)Math.random(); // 0.0 <= Math.random() < 1.0
		System.out.println("num1 : " + num1); // 항상 0나옴
		
		int num2 = (int)(Math.random()*6) + 1; // 값이 1~6 까지 int 출력
		System.out.println("num2 : " + num2);
	}
}
