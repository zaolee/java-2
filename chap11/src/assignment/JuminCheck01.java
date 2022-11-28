package assignment;

import java.io.InputStream;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JuminCheck01 {

	// 주민번호 타당성 검사하는 메소드
	
	static int sum;
	static int sum1;
	
	private boolean juminCheck(String jumin) {
		// 아래에 유효성 검사 코드를 입력하세요.
		int[] chek = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		int[] jumin3 = new int [jumin.charAt(sum)];
		
		for (int i = 0; i < chek.length; i++) {
			for (int j = 0; j < jumin3.length-1; j++) {
				sum += (chek[i] *jumin3[j]);
			}	
		}
		
		sum1 = sum %11;
		int jumun3 = jumin3[12];
		if (jumun3 == sum1) {
			
			System.out.println("주민등록번호 = " + jumin);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		JuminCheck01 jc = new JuminCheck01(); // 자기 클래스 객체 생성
		InputStream is = System.in; // ctrl + shift + o 저절로 imput 넣어줌
		Scanner sc = new Scanner(is);
		// 키보드에서 값을 입력받기 위한 객체

		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.next(); // 111111
		String regExp1 = "{6}";
		boolean result1 = Pattern.matches(regExp1, jumin1);
		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.next(); // 1111011
		String regExp2 = "{7}";
		boolean result2 = Pattern.matches(regExp2, jumin2);

		// ctrl + shift + f : 코드 정렬
		if (jumin1.length() != 6) { // 첫번째 입력한게 6자리가 맞는지
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력"); // 두번째 입력한게 7자리가 맞는지
		} else if (!jc.juminCheck(jumin1 + jumin2)) { // 유효성 검사가 맞는지
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}
		System.out.println(sum);
		System.out.println(sum1);

	}

}
