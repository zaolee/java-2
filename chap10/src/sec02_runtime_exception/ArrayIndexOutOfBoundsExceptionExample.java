package sec02_runtime_exception;

/*public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}*/

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) { // String 배열로 args를 갖는다.
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			// String data3 = args[2]; ArrayIndexOutOfBoundsException
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("ajva className 매개변수1 매개변수2");
		} // 이렇게 if문을 쓰면 예외발생하지 않고 종료됨
		
		// 해당 class 우클릭 -> run as -> run configuration -> arg 설정.

	}
}
