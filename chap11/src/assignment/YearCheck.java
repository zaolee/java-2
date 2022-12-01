package assignment;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in); // ctrl + shift + "o"
		// System.in -> ���������� ���
		int year = sc.nextInt(); 
		
		// �� ���� : ctrl + shift + "f"
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "�� �����Դϴ�.");
		} else {
			System.out.println(year + "�� ����Դϴ�.");
		}
		
		// GregorianCalendar Ŭ������ ������ üũ�ϴ� �޼ҵ带 �̿��Ͽ� ���� ���θ� �˻��Ѵ�.
		GregorianCalendar y = new GregorianCalendar();
		if(y.isLeapYear(year)) { 
			// leap year ���� �޼ҵ� ���
			System.out.println(year + "�� �����Դϴ�.");
		} else {
			System.out.println(year + "�� ����Դϴ�.");
		}
		
	}
}