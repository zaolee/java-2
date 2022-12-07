package sec05.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception {		
		// 바이트기반의 출력시스템
		FileOutputStream fos = new FileOutputStream("c:/temp/file.txt");
		// 문자기반의 출력시스템
		Writer writer = new OutputStreamWriter(fos); // 문자기반 -> 바이트기반으로 변환
		
		String data = "바이트 출력 스트임을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
	}
}

