package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// 필드
	public int studentNo;
	
	// 생성자
	public Student(String name, String ssn, int studentNo) { // 기본생성자가 아닌 매개변수생성자
		super(name, ssn); // 부모생성자를 호출해야한다.(기본생성자가 없으니까)
		this.studentNo = studentNo;
	}
	
	
	// 필드

}
