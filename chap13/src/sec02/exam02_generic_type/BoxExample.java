package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("집가고싶어..");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6); // Integer = int-> Boxing 
		int num = box2.get(); // int = Integer, unboxing
	}
}
