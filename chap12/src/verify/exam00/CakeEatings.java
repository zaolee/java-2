package verify.exam00;

public class CakeEatings {

	public static void main(String[] args) {
		CakePlate cake = new CakePlate();// Cake ���� �غ�
		CakeEater eater = new CakeEater(cake);// cake ���� ����
		CakeMaker baker = new CakeMaker(cake);// cake ���� ����

		// baker.setPriority(6);//�켱����--���� ä�� �ְ� ��������.
		baker.start();// ���� ä�� �ְ� ��������.
		eater.start();
	}
}
