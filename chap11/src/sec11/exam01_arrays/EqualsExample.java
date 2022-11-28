package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { {1,2}, {3,4} };
		
		//얕은복사후 비교 : 참조하고 있는 주소값만 비교함.
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		// boolean java.lang.Object.equals(Object obj), 주소를 비교하는거고
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		// boolean java.util.Arrays.equals(Object[] a, Object[] a2), 내용물을 비교하는거임.
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		// 참조의 참조하고 있는 내용
		
		//깊은복사후 비교 : 참조하고 있는 주소말고 안에 내용물까지 싹다 복사함.
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length); // 얕은복사
		cloned2[0] = Arrays.copyOf(original[0], original[0].length); // 새롭게 복사 -> 얕은복사와는 달리 그 참조의 참조까지 싹다 복사하는거임.
		cloned2[1] = Arrays.copyOf(original[1], original[1].length); // 이게 깊은복사.
		System.out.println("배열 번지 비교: " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		// 애초에 original과 cloned2은 다름. -> 처음 복사할때 깊은복사로 아에 주소가 달라짐. 참조의 참조값도 새롭게 복사되었으니께
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
	}
}
