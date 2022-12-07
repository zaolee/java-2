package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis); // ������ ��Ų��.
		ClassC classC = (ClassC) ois.readObject(); 
		// classC�� ���빰�� �ٲٸ� �����Ͻ� ������ -> �ø����ȣ�� ���ʿ� �־���� �ϱ�.
		System.out.println("field1: " + classC.field1);
	}
}
