package sec04.exam02_generic_method;

public class Util {
	// ���ʸ� �޼ҵ�
	// �޼ҵ� �̸�: compare �Ű�����: p1, p2 �Ű����� Ÿ��: pair<K, V>, ����Ÿ��: boolean
	// Pair<K, V> p1, Pair<K, V> p2 : ��Ƽ���ʸ�Ÿ��(Ŭ����)
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
