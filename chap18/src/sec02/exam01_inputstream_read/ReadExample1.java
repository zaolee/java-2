package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// 바이트기반의 파일 입력스트림 생성
		// InputStream is = new InputStream(); InputStream가 추상메소드기 때문에 이렇게 생성 못함.
		InputStream is =new FileInputStream("C:/dev/test.txt");
		// FileInputStream은 바이트기반의 파일 입력 스트림이다.
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
