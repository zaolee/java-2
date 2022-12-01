package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 생성
		
		List<String> list = new ArrayList<String>(); // 인터페이스 = 구현객체
		
		list.add("쏘연"); // 0
		list.add("화이팅!"); // 1
		list.add("뭐하는거지/나도몰라"); // 2 -> 3
		list.add(2,"소연"); // 인덱스2에 끼워 넣는다. ("뭐하는거지/나도몰라") -> 인덱스3이 됨
		list.add("캬캬"); // 4 총 인덱스0~인덱스4 까지 있음. 
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		
		String skill = list.get(2);
		System.out.println("\n인덱스2: " + skill.toString());
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println();
		list.remove(2); // 인덱스2가 지워지고, 인덱스3부터 앞으로 1씩 변경(인덱스3->인덱스2) : 소연 -> 뭐하는거지/나도몰라 
		list.remove(2); // 뭐하는거지/나도몰라 -> 캬캬
		list.remove("캬캬"); // 이렇게 인덱스 번호 말고 객체를 지울수도있음.
		for (String str : list) {
			System.out.println(str);
		}
		// 이렇게 리스트는 삭제가 용이
	}
}

