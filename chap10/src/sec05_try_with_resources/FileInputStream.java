package sec05_try_with_resources;

// 구현 클래스
public class FileInputStream implements AutoCloseable {
	// 필드
	private String file; // "file.txt"
	
	// 생성자
	public FileInputStream(String file) {
		this.file = file;
	}
	
	// 메소드
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception { // autocloseable에 있는 추상메소드
		System.out.println(file + "을 닫습니다.");
	}
}
