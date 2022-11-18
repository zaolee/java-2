package sec03.exam01_parent_constructor_call;

public class People {
	// 필드
	public String name;
	public String ssn;
	
	// 생성자
	public People(String name, String ssn) { // 메서드는 public과 people사이에 리턴값이 있어야됨
		this.name = name;
		this.ssn = ssn;
	}

}
