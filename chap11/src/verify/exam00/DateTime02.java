package verify.exam00;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.Calendar

		// Calendar c2 = new Calendar();

		// Calendar c1 = new GregorianCalendar();//��ĳ����

		Calendar c = Calendar.getInstance();

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;// 0~11
		int d = c.get(Calendar.DATE);

		int h1 = c.get(Calendar.HOUR); // 12�ð�
		int ap = c.get(Calendar.AM_PM); // 0:����
										// 1:����
		int h2 = c.get(Calendar.HOUR_OF_DAY); // 24�ð�
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);

		System.out.print(y + "�� " + m + "�� " + d + "�� ");

		int w = c.get(Calendar.DAY_OF_WEEK);// 1~7
		// System.out.println("w=" + w);
		// 1:��, 2:��, 3:ȭ, 4:��, 5:��, 6:��, 7:��
		String[] week = { "��", "��", "ȭ", "��", "��", "��", "��" };

		System.out.print("(" + week[w - 1] + "����) ");

		if (ap == 0) {
			System.out.print("���� ");
		} else {
			System.out.print("���� ");
		}
		System.out.println(h1 + ":" + mm + ":" + s);
	}

}
