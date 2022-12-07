package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis); // 역직렬 시킨거.
		ClassC classC = (ClassC) ois.readObject(); 
		// classC의 내용물을 바꾸면 컴파일시 에러나 -> 시리얼번호를 애초에 넣어놓고 하기.
		System.out.println("field1: " + classC.field1);
	}
}
