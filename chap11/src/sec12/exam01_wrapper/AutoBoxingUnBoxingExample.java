package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// Auto Boxing
		//Integer obj = new Integer(10); // boxing
		Integer obj = 10; // Auto-boxing : 참조형<-기본형
		
		// 대입시 Auto UnBoxing
		int value = obj; // 기본형<-참조형
		System.out.println("value = " + value);
		
		// 연산시 Auto UnBoxing
		int result = obj + 100;
		System.out.println("result = " + result);
		
	}
}

