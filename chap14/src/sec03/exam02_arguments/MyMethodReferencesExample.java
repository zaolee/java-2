package sec03.exam02_arguments;

public class MyMethodReferencesExample { 
	public static void main(String[] args) {
		// 인터페이스 지역변수
		MyFunctionalInterface fi;
		
		// 익명구현객체
		fi = new MyFunctionalInterface() {
			@Override
			public void method(int x, int y) {
				int result = x * y;
				System.out.println(result);
			}			
		};
		fi.method(5, 5);
		
		// 람다식 : 익명구현객체를 간략히 표현한 식
		fi = (x, y) -> { // 매개변수가 하나면 () 생략이 가능하지만, 두개이기 때문에 생략 불가
			int result = x * y;
			System.out.println(result);
		};
		fi.method(5, 5);
	}
}











