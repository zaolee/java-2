package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		// List ����
		
		List<String> list = new ArrayList<String>(); // �������̽� = ������ü
		
		list.add("�"); // 0
		list.add("ȭ����!"); // 1
		list.add("���ϴ°���/��������"); // 2 -> 3
		list.add(2,"�ҿ�"); // �ε���2�� ���� �ִ´�. ("���ϴ°���/��������") -> �ε���3�� ��
		list.add("ļļ"); // 4 �� �ε���0~�ε���4 ���� ����. 
		
		int size = list.size();
		System.out.println("�� ��ü��: " + size);
		
		String skill = list.get(2);
		System.out.println("\n�ε���2: " + skill.toString());
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println();
		list.remove(2); // �ε���2�� ��������, �ε���3���� ������ 1�� ����(�ε���3->�ε���2) : �ҿ� -> ���ϴ°���/�������� 
		list.remove(2); // ���ϴ°���/�������� -> ļļ
		list.remove("ļļ"); // �̷��� �ε��� ��ȣ ���� ��ü�� �����������.
		for (String str : list) {
			System.out.println(str);
		}
		// �̷��� ����Ʈ�� ������ ����
	}
}

