package verify.exam00;

import java.util.Arrays;

public class LottoPlayNormal {

	// playNormal() �޼ҵ��� �Ű������� Ÿ���� int �迭 Ÿ������ �����մϴ�.
	void playNormal(int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 46) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		// �迭�� �ø��������� �����մϴ�.
		Arrays.sort(num);  

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
