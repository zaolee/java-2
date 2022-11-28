package sec06.exam07_array_copy;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3}; // 3개
		// oldIntArray[3] = 4; 
		// oldIntArray는 이미 3개의 공간이 만들어졌기 때문에, 추가로 넣을수 없음.
		
		int[] newIntArray = new int[5];
		
		// 배열복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		newIntArray[3] = 4;
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
	}
}