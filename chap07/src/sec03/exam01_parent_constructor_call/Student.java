package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// �ʵ�
	public int studentNo;
	
	// ������
	public Student(String name, String ssn, int studentNo) { // �⺻�����ڰ� �ƴ� �Ű�����������
		super(name, ssn); // �θ�����ڸ� ȣ���ؾ��Ѵ�.(�⺻�����ڰ� �����ϱ�)
		this.studentNo = studentNo;
	}
	
	
	// �ʵ�

}
