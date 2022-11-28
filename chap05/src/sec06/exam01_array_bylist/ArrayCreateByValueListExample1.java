package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		// int[] scores = { 83, 90, 87 }; -> 이게 array constants 로 지정하는 법
		int[] scores;
		
		//scores = {83, 90, 87};
		// Array constants can only be used in initializers
		// 배열 생성시 처음에 초기값에 null을 넣은 상태면 이렇게 값 넣을수가 없음.
		
		scores = new int[] {93, 90, 87};
		// 이런식으로 new연산자 써서 객체 생성 해주고 값 넣어줄수 있다.
		
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		// for(int i=0; i<3; i++) { // 배열은 반복문 활용이 굿.
		for(int i=0; i<scores.length; i++) {	
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);		
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}