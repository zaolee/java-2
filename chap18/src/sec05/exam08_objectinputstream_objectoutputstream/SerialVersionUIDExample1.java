package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
	public static void main(String[] args) throws Exception {
		// 바이트기반의 파일출력스트림
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// 객체입출력 보조스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		oos.writeObject(classC);
		oos.flush();	oos.close();  fos.close();	
	}
}
