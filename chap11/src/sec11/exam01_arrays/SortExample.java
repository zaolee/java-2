package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores); // 걍 배열에는 없음. Arrays에 있는거임
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.print("\n[");
		for(int i=0; i<scores.length; i++) {
			if(i==2) {
				System.out.print(scores[i] + "]");
			} else {
				System.out.print(scores[i] + ", ");
			}
		}
		System.out.println();
		String[] names = {"이소연", "삼소연", "사소연"};
		Arrays.sort(names);
		System.out.println("\n" + Arrays.toString(names));
		
		Member m1 = new Member("이소연");
		Member m2 = new Member("삼소연");
		Member m3 = new Member("사소연");
		// 멤버 객체를 주르르륵 만든뒤 배열값으로 넣기
		
		Member[] members = {m1, m2, m3};
		// 사용자 정의의 클래스는 Arrays.sort()메소드를 사용하기 위해 
		// Comparable 인터페이스를 구현한 구현 클래스로 정의해야함.
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "].name = " + members[i].name);
		}
	}
}
