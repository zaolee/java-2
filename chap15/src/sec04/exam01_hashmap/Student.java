package sec04.exam01_hashmap;

public class Student {
	public int sno; // 1
	public String name; // "1�ҿ�"
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode(); // name�� StringŸ���̴ϱ� �ؽ��ڵ�� ���
		// return 1 + 33(name�� �ؽ��ڵ� ��) = 34 �� ��
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	

}
