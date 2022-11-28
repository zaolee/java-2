package sec03.exam03_tostring;

public class SmartPhone {
	// 필드
	private String company;
	private String os;
	
	// 생성자 = 객체를 생성하고, 필드를 초기화 한다.
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	// 메소드

	@Override
	public String toString() {
		return "내 폰은 " + company + " " + os + "입니다.";
	}
	
//	public void information() {	
//		System.out.println("내 폰은 " + company + " " + os + "입니다.");
//	}
	
//	public information() {
//		return "내 폰은 " + company + " " + os + "입니다.";
//}

	
	
}
