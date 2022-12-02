package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer>map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "1소연"), 95);
		map.put(new Student(1, "1소연"), 95); 
		// 중복이 아님 왜? Student 클래스에 동등비교 정의 안함..
		System.out.println("총 Map.Entry 수: " + map.size()); 
		// 2.. 동등비교해서 중복 걸러내기!!(key값은 중복 안되니께) -> 오버라이딩?
		
	} // map에 Key 쓸꺼면 무조건 동등비교 재정의(Set도 마찬가지_
}

