package verify;

public class Arr04 {

	public static void main(String[] args) {

		int[][] score = { { 85, 60, 70 }, // 0 ��
				{ 90, 95, 80 }, // 1 ��
				{ 75, 80, 100 }, // 2 ��
				{ 80, 70, 95 }, // 3 ��
				{ 100, 65, 80 } // 4 ��
		};
		int[] subject = new int[3]; // �������� ����
		int[] student = new int[5]; // �л��� ���� ����
		String[] subName = { "����:", "����:", "����:" };
		String[] stuName = { "1���л�:", "2���л�:", "3���л�:", "4���л�:", "5���л�:" };
		// subject[0]=0, student[0]=0;
		int r, c;

		System.out.println("�� ���� �������ϱ� ");
		for (c = 0; c < 3; c++) { // ����
			for (r = 0; r < 5; r++) { // �л�
				subject[c] += score[r][c];
			} // subject[c]=subject[c]+score[r][c];
			System.out.println(subName[c] + subject[c]);
		}

		System.out.println();
		System.out.println("�л��� �������ϱ�");
		for (r = 0; r < 5; r++) { // �л�
			for (c = 0; c < 3; c++) { // ����
				student[r] += score[r][c];
			} // student[r]=student[r]+score[r][c];
			// System.out.println((r+1)+"�� �л�:" + student[r]);
			System.out.println(stuName[r] + student[r]);
		}

	}// main() end
}// class end