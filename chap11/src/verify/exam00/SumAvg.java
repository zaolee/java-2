//1���� 100������ �հ� ����� �����ϴ� ���α׷��� �ۼ��Ͻÿ�. (30��)
package verify.exam00;

public class SumAvg {

	public static void main(String[] args) {
		/*
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		double avg = sum / 100.0;
		
		System.out.println("1~100 �հ�: " + sum);
		System.out.println("���: " + avg);
		*/
		
		// ���콺 ����: n~m�� �� = (n+m)(n���� m������ ���� ����)/2
		// ��) 1~100�� �� = 101 * 100 / 2 = 5050
		int num = 100;
		int sum = ((1 + num) * num) / 2 ;
		double avg = (double) sum / num;
		
		System.out.println("1~100 �հ�: " + sum);
		System.out.printf("���: %.2f \n", avg);
		

	}
}
