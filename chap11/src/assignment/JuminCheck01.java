package assignment;

import java.io.InputStream;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JuminCheck01 {

	// �ֹι�ȣ Ÿ�缺 �˻��ϴ� �޼ҵ�
	
	static int sum;
	static int sum1;
	
	private boolean juminCheck(String jumin) {
		// �Ʒ��� ��ȿ�� �˻� �ڵ带 �Է��ϼ���.
		int[] chek = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		int[] jumin3 = new int [jumin.charAt(sum)];
		
		for (int i = 0; i < chek.length; i++) {
			for (int j = 0; j < jumin3.length-1; j++) {
				sum += (chek[i] *jumin3[j]);
			}	
		}
		
		sum1 = sum %11;
		int jumun3 = jumin3[12];
		if (jumun3 == sum1) {
			
			System.out.println("�ֹε�Ϲ�ȣ = " + jumin);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		JuminCheck01 jc = new JuminCheck01(); // �ڱ� Ŭ���� ��ü ����
		InputStream is = System.in; // ctrl + shift + o ������ imput �־���
		Scanner sc = new Scanner(is);
		// Ű���忡�� ���� �Է¹ޱ� ���� ��ü

		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin1 = sc.next(); // 111111
		String regExp1 = "{6}";
		boolean result1 = Pattern.matches(regExp1, jumin1);
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin2 = sc.next(); // 1111011
		String regExp2 = "{7}";
		boolean result2 = Pattern.matches(regExp2, jumin2);

		// ctrl + shift + f : �ڵ� ����
		if (jumin1.length() != 6) { // ù��° �Է��Ѱ� 6�ڸ��� �´���
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�"); // �ι�° �Է��Ѱ� 7�ڸ��� �´���
		} else if (!jc.juminCheck(jumin1 + jumin2)) { // ��ȿ�� �˻簡 �´���
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}
		System.out.println(sum);
		System.out.println(sum1);

	}

}
