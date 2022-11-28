package sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("file.txt");
//			fis.read();
//			throw new Exception(); // ������ ���� �߻���Ű�� �ڵ�
//		} catch(Exception e) {
//			System.out.println("���� ó�� �ڵ� ������");
//			
//		} finally {
//			try {
//				fis.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		} �̰� �ʹ� ����
		
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ� ������");		
		 } // �ּ�ó���ѰŶ� �����Ѱ�.
	}	
}
