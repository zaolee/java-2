package sec07.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("쏘연");
		String strVar2 = "쏘연";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}
		
		System.out.println();
		// String 객체의 동등비교는 String객체.equals()를 사용해야함.
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}
	}
}