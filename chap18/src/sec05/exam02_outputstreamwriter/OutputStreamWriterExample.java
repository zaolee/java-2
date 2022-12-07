package sec05.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception {		
		// ����Ʈ����� ��½ý���
		FileOutputStream fos = new FileOutputStream("c:/temp/file.txt");
		// ���ڱ���� ��½ý���
		Writer writer = new OutputStreamWriter(fos); // ���ڱ�� -> ����Ʈ������� ��ȯ
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");
	}
}

