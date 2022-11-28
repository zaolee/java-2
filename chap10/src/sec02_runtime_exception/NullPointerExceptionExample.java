package sec02_runtime_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = new String(); // = null; 로 써도 돼. 둘다 같은거
		System.out.println(data.toString()); // NullpointException 발생
	} // 예외가 발생하면 프로그램이 비정상적으로 종료되기 때문에 이후 작업들은 수행되지않아.
	
}

