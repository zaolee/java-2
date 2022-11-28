package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// key(class) 와 value(String)로 구조화 되있는것. 약산 파이썬 dictionary 느낌?
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		String value  = hashMap.get(new Key(1));
		// 주소를 비교할 것이 아니라, 논리적으로 비교해야돼, 안에 들어가있는 값이 뭐니?
		// 근데 해시코드는 주소로 비교함. 논리적 비교를 하기 위해선 재정의 필요
		System.out.println(value);
		System.out.println(value.toString());
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
		
	}
}


