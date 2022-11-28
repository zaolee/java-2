package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98, 100, 22, 33, 47};
		Arrays.sort(scores); // 정렬중 -> 중앙값 : 97
		int index = Arrays.binarySearch(scores, 99); 
		// 2: Arrays.sort()로 오름차순 정렬함.
		// 큰 단점 -> 바로 Array가 정렬이 되어있어야 함
		// Arrays.sort()를 사용후에 Arrays.binarySearch를 사용해야돼
		// binarySearch = 이진탐색 
		System.out.println("찾은 인덱스: " + index);
		
		int index2 = BSearch(scores, 99);
		System.out.println("찾은 인덱스: " + index2);
		
	}
	// the binary search algorithm
	// 전제조건 : 배열이 정렬되어 있어야 한다.
	// 일고리즘
	// if 중앙값 > 찾는값 than 왼쪽배열의 중앙값을 찾는다.
	// if 중앙값 < 찾는값 than 오른쪽배열의 중앙값을 찾는다.	
	static int BSearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		while(low<=high) {
			mid = (low + high) /2;
			if(arr[mid] == target) {
				// return arr[mid]; -> 그 해당 인덱스가 아니라 값이 나옴
				return mid; // 중앙값 찾는거
			} else  if(arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	} // 이거 대신 for문을 쓰면 시간이 더 오래걸림
}
