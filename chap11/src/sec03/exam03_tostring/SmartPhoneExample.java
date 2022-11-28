package sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성", "갤럭시노트20");
		
		String strObj = myPhone.toString();  // 재정의 안하면 걍 쓸대없는 주소값나오니까 재정의 필요.
		// 자기 필드에 무엇이 들어있는지 확인할때
		// 주로 인스턴스 필드의 값을 출력하기 위함.
		System.out.println(strObj);
		System.out.println(myPhone);
	    
		// myPhone.information();
		
		
	}
}
