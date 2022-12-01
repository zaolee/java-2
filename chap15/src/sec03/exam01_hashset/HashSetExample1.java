package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // �������̽� =������ü
		
		set.add("�");
		set.add("ȭ����!!");
		set.add("������ �ؾߵ�..");
		set.add("�ҿ�"); 
		set.add("ȭ����!!"); // �ߺ��� �ڷῡ overwrite�Ѵ�.
		int size = set.size(); 
		// �̷��� �����ؼ� ������ ���� int size�� �����Ǿ� �ִ°Ŷ� (��ǻ�Ͱ� �ڵ带 ��-> �Ʒ��� �����ϴϱ�..)
		// �ٲ𶧸��� �ʱ�ȭ�ؼ�(���μ���) ����ؾߵ�. 
				
		System.out.println("�� ��ü��: " + set.size()); // 5�� �ƴ� 4��
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("�ҿ�");
		set.remove("������ �ؾߵ�..");
		
		System.out.println("�� ��ü��: " + set.size()); // 2
		
		for (String element : set) {
			System.out.println(element);			
		}
		
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������.");
		}
	}
}

