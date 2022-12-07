package sec05.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		// ����Ʈ����� ������½�Ʈ��
		FileOutputStream fos = new FileOutputStream("C:/temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("2�ҿ�"); // UTF-8���ڵ��� ����ؼ� ��� ��Ʈ���� ���ڿ��� ����.
		dos.writeDouble(95.55); // �Ǽ������� ���� -> ����Ʈ ������ ��
		dos.writeInt(5); // ���������� ���� -> ����Ʈ ������ ��
		
		dos.flush();
		dos.close();
		fos.close(); // ������� �������
		
		// ����Ʈ����� �����Է½�Ʈ��
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

