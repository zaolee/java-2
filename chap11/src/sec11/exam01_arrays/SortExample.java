package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores); // �� �迭���� ����. Arrays�� �ִ°���
		
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
		String[] names = {"�̼ҿ�", "��ҿ�", "��ҿ�"};
		Arrays.sort(names);
		System.out.println("\n" + Arrays.toString(names));
		
		Member m1 = new Member("�̼ҿ�");
		Member m2 = new Member("��ҿ�");
		Member m3 = new Member("��ҿ�");
		// ��� ��ü�� �ָ����� ����� �迭������ �ֱ�
		
		Member[] members = {m1, m2, m3};
		// ����� ������ Ŭ������ Arrays.sort()�޼ҵ带 ����ϱ� ���� 
		// Comparable �������̽��� ������ ���� Ŭ������ �����ؾ���.
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "].name = " + members[i].name);
		}
	}
}
