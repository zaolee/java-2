package sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	// 필드
	String name;
	// 생성자
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
