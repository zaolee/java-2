package sec04.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/file.txt");
		
		// 문자기반의 파일 출력 스트림
		FileWriter fw = new FileWriter(file,true); // true를 넣으면 계속해서 쌓임.. 추가되는거(엎어치기), true 빼버리면 기존꺼 없어지고 내용물이 싹 바뀜
		fw.write("FileWriter은 한글로된 " + "\r\n"); // 문자열을 바로바로 넣을수 있음.
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n"); // byte형식은 핵 귀찬
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
	
}

