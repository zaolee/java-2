package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		System.out.println("배열복사 방법1 : for문 사용");
		char[] arr2 = new char[4];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("\n배열복사 방법2 : System.arraycopy 사용");
		char[] arr3 = new char[4];		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.out.println(Arrays.toString(arr3));
		// for문을 사용하지 않고 배열을 출력하는 방법

		System.out.println("\n배열복사 방법3 : Arrays.copyOf 사용");
		char[] arr4 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr4));
	}
}

