package sec03.exam03_scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		// �ֿܼ��� �Է½�Ʈ���� �޴°� ��ĳ������ ����. -> ���� ����Ʈ�� �����ߴ� �Է½�Ʈ���� �پ��ϰ� �Է°���
		System.out.print("���ڿ��Է�> ");
		String inputString = scanner.nextLine(); // ����Ʈ�� �ƴ� ��Ʈ������ ���ϵ�.
		System.out.println(inputString); 
		
		System.out.print("\n�����Է�> ");
		int inputInt = scanner.nextInt(); // ����Ʈ�� �ƴ� ������ ������, �ٵ� �Ǽ������� �Է��ϸ� ������
		System.out.println(inputInt);
		
		System.out.print("\n�Ǽ��Է�> ");
		double inputDouble = scanner.nextDouble(); // ������ �Է��ص� �Ǽ������� ����.
		System.out.println(inputDouble);
		
	}
}
