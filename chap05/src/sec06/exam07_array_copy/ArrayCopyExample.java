package sec06.exam07_array_copy;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		// 배열복사 : 왜써? 기존꺼에다 양 더 넣으려고
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// oldStrArray 0번째 부터 newStrArray 0번째에다 oldStrArray.length 만큼 복사해주삼

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}