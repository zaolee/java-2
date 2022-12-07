package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/dev/test.txt");
		char[] data = "ȫ�浿".toCharArray(); // ȫ�浿�� �����.
		for(int i =0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}

}
