package sec03.exam01_equals;

public class Member {
	// �ʵ� (�������)
	public String id;
	
	// ������
	public Member(String id) {
		this.id = id;
	}
	
	// �޼ҵ�
	@Override
	public boolean equals(Object obj) { // ��ü�� �ּҰ� ��
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) { // String��ü�� �ִ� equals
				return true;
			}
		}
		return false;
	}

}
