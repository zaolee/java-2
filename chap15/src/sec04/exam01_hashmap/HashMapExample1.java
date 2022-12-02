package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // 보면 데이터 타입을 왼쪽에는 꼭 적어주기. 오른쪽은 생략가능
		// Map map = new HashMap<>(); -> object타입으로 들어감
		
		// 객체저장
		map.put("2소연", 1);
		map.put("3소연", 2);
		map.put("4소연", 3);
		map.put("2소연", 4);
		System.out.println("총 Map Entry 수: " + map.size()); // 키값인 2소연이 중복되서 1 -> 4로 변함.
		System.out.println();
		// 객체찾기
		System.out.println("2소연 값은: " + map.get("2소연") + "\n");
		
		// 객체를 하나씩 처리 : keySet()
		Set<String> keySet = map.keySet(); // key값을 set으로 묶음 -> 이터레이터(반복자) 써서 출력할꺼
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		// 객체삭제
		map.remove("3소연");
		System.out.println("\n총 Map Entry 수: " + map.size() + "\n");
		
		// 객체를 하나씩 처리 : Map.EntrySet()
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); 
		// 전체를(key랑 value 다) set으로 묶음
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value );
		}
		
		// 객체전체삭제
		map.clear();
		System.out.println("\n총 Map Entry 수: " + map.size());
		
	}
}

