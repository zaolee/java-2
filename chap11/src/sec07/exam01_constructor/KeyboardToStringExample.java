package sec07.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		// Ű���忡�� ���� �о� bytes�����ϰ� ���� ������ readByteNo�� �����Ѵ�.
		
		System.out.println("readByteNo= " + readByteNo);
		//�迭�� offset �ε��� ��ġ���� length �� ��ŭ String ��ü ����
		String str = new String(bytes, 0, readByteNo -2);
		System.out.println(str);
	}
}
