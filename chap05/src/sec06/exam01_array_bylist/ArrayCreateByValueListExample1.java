package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		// int[] scores = { 83, 90, 87 }; -> �̰� array constants �� �����ϴ� ��
		int[] scores;
		
		//scores = {83, 90, 87};
		// Array constants can only be used in initializers
		// �迭 ������ ó���� �ʱⰪ�� null�� ���� ���¸� �̷��� �� �������� ����.
		
		scores = new int[] {93, 90, 87};
		// �̷������� new������ �Ἥ ��ü ���� ���ְ� �� �־��ټ� �ִ�.
		
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		// for(int i=0; i<3; i++) { // �迭�� �ݺ��� Ȱ���� ��.
		for(int i=0; i<scores.length; i++) {	
			sum += scores[i];
		}
		System.out.println("���� : " + sum);		
		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);
	}
}