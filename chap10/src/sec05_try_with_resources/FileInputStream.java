package sec05_try_with_resources;

// ���� Ŭ����
public class FileInputStream implements AutoCloseable {
	// �ʵ�
	private String file; // "file.txt"
	
	// ������
	public FileInputStream(String file) {
		this.file = file;
	}
	
	// �޼ҵ�
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception { // autocloseable�� �ִ� �߻�޼ҵ�
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
}
