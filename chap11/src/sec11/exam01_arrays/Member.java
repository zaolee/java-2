package sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	// �ʵ�
	String name;
	// ������
//	Member() {
//	}
	
	Member(String name){
		this.name = name;
	}
	
	 @Override
	   public int compareTo(Member o) {
	      return name.compareTo(o.name);
	   }

}
