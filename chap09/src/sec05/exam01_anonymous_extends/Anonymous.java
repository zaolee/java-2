package sec05.exam01_anonymous_extends;

public class Anonymous {
	// �ʵ� �ʱⰪ���� �͸��ڽİ�ü�� ���Խ�Ų��.
	Person filed = new Person() {
		
		void work() {
			System.out.println("����̶��...");
		}

		@Override
		public void wake() {
			System.out.println("6�� ���!!");
			work();
		}
		
		
	}; // �θ��� = �͸� �ڽİ�ü
	// ������
	
	// �޼ҵ�
	void method1() {
		// ���ú��������� �͸��ڽİ�ü�� ���Խ�Ų��.
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å����!!");
			}
			@Override
			public void wake() {
				System.out.println("7�� ���!!");
				walk();
			}			
		}; // �͸��ڽİ�ü
		
		localVar.wake();
	}
	
	void method2(Person person) { // �Ű������� �͸��ڽİ�ü�� ���Խ�Ų��.
		person.wake();
	}

}
