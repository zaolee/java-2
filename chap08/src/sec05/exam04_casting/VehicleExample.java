package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		
		// �������̽� = ������ü, �ڵ��� ��ȯ
		Vehicle vehicle = new Bus();

		vehicle.run();
		//vehicle.checkFare(); (x) �� ����� Bus�� �մ°Ŷ� ���������� ������ ����.. ������ ���
		// ���������� ��ҵǾ� ������ �ʴ´�.

		Bus bus = (Bus) vehicle;  //����Ÿ�Ժ�ȯ, ����Ŭ���� = (����Ŭ����) �������̽�
		// ���� ����ȯ �� �ڸ���... ����Ÿ�Ժ�ȯ�� �����ϴٴ� ���.. �ƽó���..?
		// Taxi taxi = (Taxi) vehicle; �̷������� ���� ���� ������ �ȳ��µ������� �ȵ� �� 
		

		bus.run();
		bus.checkFare(); // ���������� Ȯ��ȴ�.
	}
}
