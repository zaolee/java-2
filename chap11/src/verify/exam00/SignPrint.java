// 3. ǥ���Է���ġ(�ܼ�)�� �Է� ���� ���� num�� ���� ���� '���', '����', 
// '0'�� ����ϴ� ���α׷��� ���� �����ڸ� �̿��ؼ� �ۼ��Ͻÿ�. [20��]
package verify.exam00;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("�����Է�: ");
		int num = scan.nextInt();

		String result = num > 0 ? "���" : num == 0 ? "0" : "����" ;
		System.out.println(result);

	}
}

// ���� ���
// �����Է�: 5
// ����