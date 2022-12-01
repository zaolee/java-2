package sec04.exam02_generic_method;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과는 apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(2, "바나나는 banana");
		boolean result = Util.<Integer, String>compare(p1, p2);
		if(result) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<>("user1", "쏘연");
		Pair<String, String> p4 = new Pair<>("user2,", "쏘연");
		boolean result2 = Util.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}
