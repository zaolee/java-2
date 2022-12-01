package sec03.exam03_return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) ->{
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(3, 3));
		
		// sum �޼��带 �̿��� ���ٽ�
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(3, 3));
		
		// sum �޼��带 �̿��� �͸�����ü
		fi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return sum(x,y);
			}
		};
		System.out.println(fi.method(3, 3));
	}	
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}










