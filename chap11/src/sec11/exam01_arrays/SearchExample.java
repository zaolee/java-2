package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98, 100, 22, 33, 47};
		Arrays.sort(scores); // ������ -> �߾Ӱ� : 97
		int index = Arrays.binarySearch(scores, 99); 
		// 2: Arrays.sort()�� �������� ������.
		// ū ���� -> �ٷ� Array�� ������ �Ǿ��־�� ��
		// Arrays.sort()�� ����Ŀ� Arrays.binarySearch�� ����ؾߵ�
		// binarySearch = ����Ž�� 
		System.out.println("ã�� �ε���: " + index);
		
		int index2 = BSearch(scores, 99);
		System.out.println("ã�� �ε���: " + index2);
		
	}
	// the binary search algorithm
	// �������� : �迭�� ���ĵǾ� �־�� �Ѵ�.
	// �ϰ���
	// if �߾Ӱ� > ã�°� than ���ʹ迭�� �߾Ӱ��� ã�´�.
	// if �߾Ӱ� < ã�°� than �����ʹ迭�� �߾Ӱ��� ã�´�.	
	static int BSearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		while(low<=high) {
			mid = (low + high) /2;
			if(arr[mid] == target) {
				// return arr[mid]; -> �� �ش� �ε����� �ƴ϶� ���� ����
				return mid; // �߾Ӱ� ã�°�
			} else  if(arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	} // �̰� ��� for���� ���� �ð��� �� �����ɸ�
}
