package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer>map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "1�ҿ�"), 95);
		map.put(new Student(1, "1�ҿ�"), 95); 
		// �ߺ��� �ƴ� ��? Student Ŭ������ ����� ���� ����..
		System.out.println("�� Map.Entry ��: " + map.size()); 
		// 2.. ������ؼ� �ߺ� �ɷ�����!!(key���� �ߺ� �ȵǴϲ�) -> �������̵�?
		
	} // map�� Key ������ ������ ����� ������(Set�� ��������_
}

