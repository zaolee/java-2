package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws Exception {
		// 바이트기반의 파일출력스트림
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// 객체입출력 보조시스템
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		Child child = new Child();
		child.field1 = "홍길동";
		child.field2 = "홍삼원";
		oos.writeObject(child);
		oos.flush(); oos.close(); fos.close();	
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child v = (Child) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		ois.close(); fis.close();
	}
}
