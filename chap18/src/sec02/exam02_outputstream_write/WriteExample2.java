package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/test.txt");
		byte[] data = "ABC".getBytes(); 
		os.write(data); // for문 대신 byte[]로 OutStream으로 한꺼번에 전송한다. 
		os.flush();
		os.close();
	}

}
