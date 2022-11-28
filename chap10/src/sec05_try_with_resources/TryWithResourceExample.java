package sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("file.txt");
//			fis.read();
//			throw new Exception(); // 강제로 예외 발생시키는 코드
//		} catch(Exception e) {
//			System.out.println("예외 처리 코드 실행중");
//			
//		} finally {
//			try {
//				fis.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		} 이거 너무 복잡
		
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드 실행중");		
		 } // 주석처리한거랑 동일한거.
	}	
}
