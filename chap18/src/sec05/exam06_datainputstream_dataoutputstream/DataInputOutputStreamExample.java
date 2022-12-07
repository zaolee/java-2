package sec05.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		// 바이트기반의 파일출력스트림
		FileOutputStream fos = new FileOutputStream("C:/temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("2소연"); // UTF-8인코딩을 사용해서 출력 스트림에 문자열을 쓴다.
		dos.writeDouble(95.55); // 실수형으로 저장 -> 바이트 단위로 들어가
		dos.writeInt(5); // 정수형으로 저장 -> 바이트 단위로 들어감
		
		dos.flush();
		dos.close();
		fos.close(); // 여기까지 출력했음
		
		// 바이트기반의 파일입력스트림
		FileInputStream fis = new FileInputStream("C:/temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<1; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
		fis.close();
	}
}

