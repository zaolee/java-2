package sec07.exam01_constructor;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; // �ƽ�Ű�ڵ尪
		// 1byte = 8 bits, -128~127 ������
		// �迭�� ���޸𸮿� ����
		
		String str1 = new String(bytes); // bytes �迭�� �Ű������� ���ڿ� ��ü�� ����
		System.out.println(str1); // "Hello Java"
		System.out.println(str1.toString());
		
		String str2 = new String(bytes, 6, 4); // 7��°���� 4�� 
		System.out.println(str2);
	}
}
