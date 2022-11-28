package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			// 예외발생가능한 코드
			Class clazz = Class.forName("java.lang String2");
			// Class.forName("문자열")문자열에 해당하는 클래스 객체 생성하여 반환한다.
		} catch(ClassNotFoundException e) { 
			// ()-> Exception 코드는 예외처리중에 가장 상위 코드, 아니면 구체적인 예외 쓰면돼 ClasCastException e 등..
			// 예외처리코드
			System.out.println("클래스가 존재하지 않습니다.");
			
		}
		
	}
}

