package sec03.exam01_parent_constructor_call;

public class StudentExample {
	// 필드
	// 생성자
	// 메소드
	public static void main(String[] args) {
		Student student = new Student("이소연", "201614031", 1);
		System.out.println("이름은 " + student.name + "이고, 학번은 " + student.ssn + "이며 학년은 " + student.studentNo + "학년입니다." );
	}
}

