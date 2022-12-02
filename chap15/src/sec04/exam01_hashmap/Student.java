package sec04.exam01_hashmap;

public class Student {
	public int sno; // 1
	public String name; // "1소연"
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode(); // name은 String타입이니까 해시코드로 출력
		// return 1 + 33(name의 해시코드 예) = 34 로 비교
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
