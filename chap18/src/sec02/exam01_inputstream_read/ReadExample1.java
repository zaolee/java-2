package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// ����Ʈ����� ���� �Է½�Ʈ�� ����
		// InputStream is = new InputStream(); InputStream�� �߻�޼ҵ�� ������ �̷��� ���� ����.
		InputStream is =new FileInputStream("C:/dev/test.txt");
		// FileInputStream�� ����Ʈ����� ���� �Է� ��Ʈ���̴�.
		int readByte;
		
		while(true){
			readByte = is.read();
			System.out.println(readByte);
			if(readByte == -1) break;
			System.out.println((char)readByte);
		} 
		is.close();
	}

}
