package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2); 
		// �ε���1���� 2�� ����� : BC�� ����ǰ���.. 
		os.flush();
		os.close();
	}

}
