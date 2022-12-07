package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/dev/test1.txt");
		byte[] data = "ABC".getBytes(); // String�� ����Ʈ�迭�� �����.
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]); // �� ����Ʈ�� OutStream���� �����Ѵ�.
		}
		os.flush(); 
		os.close(); // ������ ������.
	}

}
