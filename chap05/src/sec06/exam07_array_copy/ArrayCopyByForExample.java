package sec06.exam07_array_copy;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3}; // 3��
		// oldIntArray[3] = 4; 
		// oldIntArray�� �̹� 3���� ������ ��������� ������, �߰��� ������ ����.
		
		int[] newIntArray = new int[5];
		
		// �迭����
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		newIntArray[3] = 4;
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
	}
}