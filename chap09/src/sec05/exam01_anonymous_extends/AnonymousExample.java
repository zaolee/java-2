package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.filed.wake();
		System.out.println();
		anony.method1();
		System.out.println();
		anony.method2(new Person() { // Person�� �͸�ü�� �־���ߵ�
			void study() {
				System.out.println("�����ϱ� �ȴ�..");
			}

			@Override
			public void wake() {
				System.out.println("8�� ���!!");
				study();
			}
			
		});

	}

}
