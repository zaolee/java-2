package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// Auto Boxing
		//Integer obj = new Integer(10); // boxing
		Integer obj = 10; // Auto-boxing : ������<-�⺻��
		
		// ���Խ� Auto UnBoxing
		int value = obj; // �⺻��<-������
		System.out.println("value = " + value);
		
		// ����� Auto UnBoxing
		int result = obj + 100;
		System.out.println("result = " + result);
		
	}
}

