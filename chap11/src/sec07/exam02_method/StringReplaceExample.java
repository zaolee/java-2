package sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "소연이는 26살 입니다. 제로콜라를 좋아합니다.";		
		String newStr = oldStr.replace("제로콜라를", "나랑드 42다를");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

