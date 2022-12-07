package sec04.exam03_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:\\dev\\workspace\\java\\chap18\\src\\sec04\\exam03_fileoutputstream\\house.jpg";
		String targetFileName = "C:/Temp/house.jpg"; // 위에 파일안에 있는 그림을 바이트로 읽어서 지금 템프파일에 넣을꺼얌
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다."); // 저 house.jpg가 우리가 지정한 파일로 복사됨..
	}
}

