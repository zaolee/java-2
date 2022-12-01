package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		// 인터페이스 지역변수
		MyFunctionalInterface fi;

		// 인터페이스 = 익명구현객체
		fi = new MyFunctionalInterface() {

			@Override
			public void method() {
				String str = "method call1";
				System.out.println(str);
			}
		};
		fi.method();

		// 인터페이스 -> 람다식
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		// 이렇게 표현가능
		fi = () -> System.out.println("method call1");
		fi.method();
		
	}
}
