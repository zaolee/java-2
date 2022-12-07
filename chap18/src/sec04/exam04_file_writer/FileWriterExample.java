package sec04.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/file.txt");
		
		// ���ڱ���� ���� ��� ��Ʈ��
		FileWriter fw = new FileWriter(file,true); // true�� ������ ����ؼ� ����.. �߰��Ǵ°�(����ġ��), true �������� ������ �������� ���빰�� �� �ٲ�
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n"); // ���ڿ��� �ٷιٷ� ������ ����.
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n"); // byte������ �� ����
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
	
}

