package sec03.exam01_equals;

public class Member {
	// 필드 (멤버변수)
	public String id;
	
	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	// 메소드
	@Override
	public boolean equals(Object obj) { // 객체의 주소값 비교
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) { // String객체에 있는 equals
				return true;
			}
		}
		return false;
	}

}
