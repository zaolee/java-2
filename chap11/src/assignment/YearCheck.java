package assignment;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in); // ctrl + shift + "o"
		// System.in -> 정수형으로 출력
		int year = sc.nextInt(); 
		
		// 줄 정리 : ctrl + shift + "f"
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년입니다.");
		} else {
			System.out.println(year + "은 평년입니다.");
		}
		
		// GregorianCalendar 클래스의 윤년을 체크하는 메소드를 이용하여 윤년 여부를 검사한다.
		GregorianCalendar y = new GregorianCalendar();
		if(y.isLeapYear(year)) { 
			// leap year 윤년 메소드 사용
			System.out.println(year + "은 윤년입니다.");
		} else {
			System.out.println(year + "은 평년입니다.");
		}
		
	}
}