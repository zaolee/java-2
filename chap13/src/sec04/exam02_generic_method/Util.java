package sec04.exam02_generic_method;

public class Util {
	// 제너릭 메소드
	// 메소드 이름: compare 매개변수: p1, p2 매개변수 타입: pair<K, V>, 리턴타입: boolean
	// Pair<K, V> p1, Pair<K, V> p2 : 멀티제너릭타입(클래스)
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()) ;
		boolean valueCompare = p1.getValue().equals(p2.getValue());
	    return keyCompare && valueCompare; // t && t = t
	    // T || T = T		T && T = T
	    // T || F = F		T && F = F
	    // F || T = T		F && T = F
	    // F || F = F		F && F = F
	}
}
