package sec05.exam01_exit;


public class ExitExample {
	public static void main(String[] args)  {
		System.out.println("���α׷��� ����˴ϴ�..");
		// System.exit(0); // ���α׷� ���� ��Ű�°�
		//���� ������ ����
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				} // �̰� �ڵ� ������ �˾ƺ��°� �ð�������
			}
		});
		
		for(int i=0; i<10; i++) {
			//i�� ���
			System.out.println(i);
			try {
				//JVM ���� ��û
				System.exit(i); // Ư���� ��ȣ�� ������ ����
			} catch(SecurityException e) { }
		}
	}
}

