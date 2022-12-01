package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // 인터페이스 =구현객체
		
		set.add("쏘연");
		set.add("화이팅!!");
		set.add("열심히 해야됨..");
		set.add("소연"); 
		set.add("화이팅!!"); // 중복된 자료에 overwrite한다.
		int size = set.size(); 
		// 이렇게 선언해서 쓰꺼면 여기 int size는 고정되어 있는거라 (컴퓨터가 코드를 위-> 아래로 진행하니까..)
		// 바뀔때마다 초기화해서(새로선언) 사용해야됨. 
				
		System.out.println("총 객체수: " + set.size()); // 5가 아닌 4개
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("소연");
		set.remove("열심히 해야됨..");
		
		System.out.println("총 객체수: " + set.size()); // 2
		
		for (String element : set) {
			System.out.println(element);			
		}
		
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음.");
		}
	}
}

