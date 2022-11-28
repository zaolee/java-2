package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {		
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		// Objects.hash(�Ű�������)�� �Ű������� ������ �ؽ��ڵ带 �����Ѵ�.
		// Objects.hashCode(�Ű����� ��ü)�� �Ű����� ��ü�� �ʵ带 ������ Object.hash()�� �ؽ��ڵ带 �����Ѵ�.
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
