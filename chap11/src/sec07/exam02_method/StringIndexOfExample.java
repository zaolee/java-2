package sec07.exam02_method;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 3, 공백포함 주의
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("5252...자바와 관련된 책이군...");
		} else {
			System.out.println("야레야레.. 자바와 관련없쿤...");
		}
	}
}

