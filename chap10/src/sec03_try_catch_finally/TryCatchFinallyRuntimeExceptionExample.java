package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			// 예외발생가능한 코드 입력
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) { 
			// 예외처리 코드 입력
			System.out.println("[실행방법]");
			System.out.println("java ClassName num1 num2");
			return; // main() 메소드를(프로그램) 종료
		}
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		// args 값 넣어주면 예외 발생 안함
		
		try {
			// 예외발생가능한 코드
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(NumberFormatException e) {
			// 예외처리 코드
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			// 무조건 실행하는 코드
			System.out.println("이얏호");
		}
	}
}

