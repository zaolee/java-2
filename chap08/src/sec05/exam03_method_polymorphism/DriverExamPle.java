package sec05.exam03_method_polymorphism;

public class DriverExamPle {

	public static void main(String[] args) {
		BestDriver driver = new BestDriver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.BestDrive(bus); // Vehicle vehicle = new Bus(); �ڵ�����ȯ
		driver.BestDrive(taxi); // �Ű������� ������

	}

}

// �߻�Ŭ���� vs �������̽�
// "����"		  "������"