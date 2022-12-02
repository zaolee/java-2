package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // ���� ������ Ÿ���� ���ʿ��� �� �����ֱ�. �������� ��������
		// Map map = new HashMap<>(); -> objectŸ������ ��
		
		// ��ü����
		map.put("2�ҿ�", 1);
		map.put("3�ҿ�", 2);
		map.put("4�ҿ�", 3);
		map.put("2�ҿ�", 4);
		System.out.println("�� Map Entry ��: " + map.size()); // Ű���� 2�ҿ��� �ߺ��Ǽ� 1 -> 4�� ����.
		System.out.println();
		// ��üã��
		System.out.println("2�ҿ� ����: " + map.get("2�ҿ�") + "\n");
		
		// ��ü�� �ϳ��� ó�� : keySet()
		Set<String> keySet = map.keySet(); // key���� set���� ���� -> ���ͷ�����(�ݺ���) �Ἥ ����Ҳ�
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		// ��ü����
		map.remove("3�ҿ�");
		System.out.println("\n�� Map Entry ��: " + map.size() + "\n");
		
		// ��ü�� �ϳ��� ó�� : Map.EntrySet()
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); 
		// ��ü��(key�� value ��) set���� ����
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value );
		}
		
		// ��ü��ü����
		map.clear();
		System.out.println("\n�� Map Entry ��: " + map.size());
		
	}
}

