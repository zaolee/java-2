package sec07.exam02_method;

public class StringCharAtExample {
	public static void main(String[] args) {
		String name = "Zao";
		String ssn = "970808-2354212";
		char sex = ssn.charAt(7); // 2 : 여자
		switch(sex){
		case '1' :
		case '3' :
			System.out.println(name + "는 남자입니다.");
			break;
		case '2' :	
		case '4' :
			System.out.println(name + "는 여자입니다.");
			break;
			
		}
	}
}

