package sec05.exam01_exit;


public class ExitExample {
	public static void main(String[] args)  {
		System.out.println("프로그램이 종료됩니다..");
		// System.exit(0); // 프로그램 종료 시키는거
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				} // 이거 코드 일일히 알아보는거 시간낭비임
			}
		});
		
		for(int i=0; i<10; i++) {
			//i값 출력
			System.out.println(i);
			try {
				//JVM 종료 요청
				System.exit(i); // 특정한 번호가 들어갈수도 있음
			} catch(SecurityException e) { }
		}
	}
}

