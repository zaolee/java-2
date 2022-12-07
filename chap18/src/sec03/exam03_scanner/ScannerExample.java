package sec03.exam03_scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		// 콘솔에서 입력스트림을 받는걸 스캐너한테 보냄. -> 기존 바이트만 가능했던 입력스트림이 다양하게 입력가능
		System.out.print("문자열입력> ");
		String inputString = scanner.nextLine(); // 바이트가 아닌 스트링으로 리턴됨.
		System.out.println(inputString); 
		
		System.out.print("\n정수입력> ");
		int inputInt = scanner.nextInt(); // 바이트가 아닌 정수로 받지롱, 근데 실수형으로 입력하면 에러나
		System.out.println(inputInt);
		
		System.out.print("\n실수입력> ");
		double inputDouble = scanner.nextDouble(); // 정수로 입력해도 실수형으로 나옴.
		System.out.println(inputDouble);
		
	}
}
