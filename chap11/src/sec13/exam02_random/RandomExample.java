package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber1 = new int[6]; // 6���� int�迭 �ȿ� ���� null��
		Random random1 = new Random(5); // seed�� ����
		System.out.print("(seed�� ����)���� ��ȣ: ");
		for (int i : selectNumber1) {
			selectNumber1[i] = random1.nextInt(45)+1; 
			//random.nextInt() -2�� 32�� <= ~ <= 2�� 32�� -1
			// () �ȿ� 45�� ������ -> 0<= random.nextInt(45) < 45
			// +1 -> 1<= random.nextInt(45)+1 < 46
			System.out.print(selectNumber1[i] + " ");
			// ���� ��ȣ: 18 38 45 15 22 36 ��� ���� 
			// ��? -> seed�� ���������༭. seed���� ������������ �Ȱ��� ���� ��� ���� -> otp
			// otp�ܸ��� : �ð��� �������� ������ SEED��(������ȣ)���� ������ ������ ���� (����:�ð�)
		}
		
		int[] selectNumber2 = new int[6];
		Random random2 = new Random(); // �̷��� seed�� ���� Ǯ����
		System.out.print("\n���� ��ȣ: ");
		for (int j : selectNumber2) {
			selectNumber2[j] = random2.nextInt(45)+1; 				
			System.out.print(selectNumber2[j] + " ");			
		} // ���� �������� ���
		
		
		// ��÷��ȣ
		int[] winningNumber = new int[6];
		Random random3 = new Random(30);
		System.out.print("\n��÷ ��ȣ: ");
		for (int i : winningNumber) {
			winningNumber[i] = random3.nextInt(45)+1;
			System.out.print(winningNumber[i] + " ");
		}
		
		// ��÷����
		Arrays.sort(selectNumber2);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber2, winningNumber);
		System.out.print("\n��÷ ����: ");
		if(result) {
			System.out.print("1� ��÷��!!");
		} else {
			System.out.print("������ȸ��...");
		}
	}
}
	
