package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/dev/test1.txt");
		byte[] data = "ABC".getBytes(); // String을 바이트배열로 만든다.
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]); // 한 바이트씩 OutStream으로 전송한다.
		}
		os.flush(); 
		os.close(); // 파일이 생성됨.
	}

}
