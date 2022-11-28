package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.filed.wake();
		System.out.println();
		anony.method1();
		System.out.println();
		anony.method2(new Person() { // Person의 익명객체를 넣어줘야돼
			void study() {
				System.out.println("공부하기 싫다..");
			}

			@Override
			public void wake() {
				System.out.println("8시 기상!!");
				study();
			}
			
		});

	}

}
