package sec02_runtime_exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100"; // 문자
		String data2 = "a100"; // 문자 -> 여기서 a는 숫자로 변경 못함
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // Integer.parseInt("문자열") : 문자열 -> 숫자
		// NumberFormatException 발생, 이후 밑에 코드는 실행 안함
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}

