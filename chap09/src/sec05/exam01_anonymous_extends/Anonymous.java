package sec05.exam01_anonymous_extends;

public class Anonymous {
	// 필드 초기값으로 익명자식객체를 대입시킨다.
	Person filed = new Person() {
		
		void work() {
			System.out.println("출근이라니...");
		}

		@Override
		public void wake() {
			System.out.println("6시 기상!!");
			work();
		}
		
		
	}; // 부모형 = 익명 자식객체
	// 생성자
	
	// 메소드
	void method1() {
		// 로컬변수값으로 익명자식객체를 대입시킨다.
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책간다!!");
			}
			@Override
			public void wake() {
				System.out.println("7시 기상!!");
				walk();
			}			
		}; // 익명자식객체
		
		localVar.wake();
	}
	
	void method2(Person person) { // 매개변수에 익명자식객체를 대입시킨다.
		person.wake();
	}

}
