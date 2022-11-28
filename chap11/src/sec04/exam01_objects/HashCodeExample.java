package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		// Objects.hash(매개변수들)는 매개변수를 가지고 해시코드를 생성한다.
		// Objects.hashCode(매개변수 객체)는 매개변수 객체의 필드를 가지고 Object.hash()로 해시코드를 생성한다.
	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
}
