package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		System.out.println("�迭���� ���1 : for�� ���");
		char[] arr2 = new char[4];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("\n�迭���� ���2 : System.arraycopy ���");
		char[] arr3 = new char[4];		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.out.println(Arrays.toString(arr3));
		// for���� ������� �ʰ� �迭�� ����ϴ� ���

		System.out.println("\n�迭���� ���3 : Arrays.copyOf ���");
		char[] arr4 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr4));
	}
}

