// 2. 5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�. �Է¹��� ������ ���� ���� ����Ѵ�. [20��]
// ���࿡ �Է¹��� ���� 100 �̻��̸�, �ݺ��� 5ȸ�� �ƴ����� ��� �����Ű�� ���α׷��� �ۼ��Ͻÿ�.
package verify.exam00;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("�Է�: ");
			int num = scan.nextInt();

			sum += num;
			
			System.out.println("����: " + num + ", ��: " + sum);

			if (sum >= 100) {
				break;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}

// ���� ���
// �Է�: 7
// ����: 7, ��: 7
// �Է�: 14
// ����: 14, ��: 21
// �Է�: 1000 
// ����: 1000, ��: 1021
// ���α׷� ����!
