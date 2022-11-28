package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { {1,2}, {3,4} };
		
		//���������� �� : �����ϰ� �ִ� �ּҰ��� ����.
		System.out.println("[���� ������ ��]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("�迭 ���� ��: " + original.equals(cloned1));
		// boolean java.lang.Object.equals(Object obj), �ּҸ� ���ϴ°Ű�
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned1));
		// boolean java.util.Arrays.equals(Object[] a, Object[] a2), ���빰�� ���ϴ°���.
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned1));
		// ������ �����ϰ� �ִ� ����
		
		//���������� �� : �����ϰ� �ִ� �ּҸ��� �ȿ� ���빰���� �ϴ� ������.
		System.out.println("\n[���� ������ ��]");
		int[][] cloned2 = Arrays.copyOf(original, original.length); // ��������
		cloned2[0] = Arrays.copyOf(original[0], original[0].length); // ���Ӱ� ���� -> ��������ʹ� �޸� �� ������ �������� �ϴ� �����ϴ°���.
		cloned2[1] = Arrays.copyOf(original[1], original[1].length); // �̰� ��������.
		System.out.println("�迭 ���� ��: " + original.equals(cloned2));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned2));
		// ���ʿ� original�� cloned2�� �ٸ�. -> ó�� �����Ҷ� ��������� �ƿ� �ּҰ� �޶���. ������ �������� ���Ӱ� ����Ǿ����ϲ�
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned2));
	}
}
