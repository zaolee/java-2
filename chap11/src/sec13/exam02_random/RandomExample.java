package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber1 = new int[6]; // 6개의 int배열 안에 값은 null임
		Random random1 = new Random(5); // seed값 고정
		System.out.print("(seed값 고정)선택 번호: ");
		for (int i : selectNumber1) {
			selectNumber1[i] = random1.nextInt(45)+1; 
			//random.nextInt() -2의 32승 <= ~ <= 2의 32승 -1
			// () 안에 45를 넣으면 -> 0<= random.nextInt(45) < 45
			// +1 -> 1<= random.nextInt(45)+1 < 46
			System.out.print(selectNumber1[i] + " ");
			// 선택 번호: 18 38 45 15 22 36 계속 나옴 
			// 왜? -> seed값 고정시켜줘서. seed값이 정해져있으면 똑같은 값만 계속 나옴 -> otp
			// otp단말기 : 시간을 기준으로 개인의 SEED값(고유번호)으로 임의의 정수를 생성 (변수:시간)
		}
		
		int[] selectNumber2 = new int[6];
		Random random2 = new Random(); // 이렇게 seed값 고정 풀어줘
		System.out.print("\n선택 번호: ");
		for (int j : selectNumber2) {
			selectNumber2[j] = random2.nextInt(45)+1; 				
			System.out.print(selectNumber2[j] + " ");			
		} // 값이 랜덤으로 출력
		
		
		// 당첨번호
		int[] winningNumber = new int[6];
		Random random3 = new Random(30);
		System.out.print("\n당첨 번호: ");
		for (int i : winningNumber) {
			winningNumber[i] = random3.nextInt(45)+1;
			System.out.print(winningNumber[i] + " ");
		}
		
		// 당첨여부
		Arrays.sort(selectNumber2);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber2, winningNumber);
		System.out.print("\n당첨 여부: ");
		if(result) {
			System.out.print("1등에 당첨됨!!");
		} else {
			System.out.print("다음기회에...");
		}
	}
}
	
