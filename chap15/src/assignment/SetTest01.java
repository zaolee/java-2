package assignment;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01 {

	public static void main(String[] args) {
		
//		Set set = new HashSet();
//		
//		int[] selectNumber2 = new int[6];
//		Random r = new Random();
//		for (int j : selectNumber2) {
//			selectNumber2[j] = r.nextInt(45)+1;			
//		}
//		set.add(selectNumber2);
//		
//		Iterator<Integer> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			int element = iterator.next();
//			System.out.println(element);
//		}
		
		int n;
		Set s = new HashSet(); // -> ��� ���� ���� ���..
		TreeSet ts = new TreeSet(); // -> �� ���� ���� ���ĵǼ� ����.. ��
		// ���� �ϳ� ���ö����� ũ�� ���ؼ� ���� ������ ���еǼ� �����..(���� ����ȭ�Ǽ� ���°�) �׷��ٺ��� ������������ ���ĵǴ°�.
		Random r = new Random(); // 0.0<= Math.random() : ������ �Ǽ��� ��Ÿ���°�. <1.0
		// n = r.nextInt(45+1); // 1~45 ������ ����
		// s.add(n); // ���� �ϳ� ���ϱ�, �ݺ���(while�Ἥ 6�� ������ ����)		
		while(s.size() < 6) {
			n = r.nextInt(45+1);
			s.add(n); // s�� set�̴ϰ� �ߺ� ������, n�� �ߺ��� ���� �����͵� s���� �ȹ޾���, �˾Ƽ� �ɷ���..
		}
		ts.addAll(s); // �̷��� set���ְ� treeset�� addall �ؼ� ���ټ� ������, �� ó������ treeset���ִ°� ����.
		System.out.println(ts); // ������ ���� �Ǿ����� ����. -> TreeSet���ֱ�
	}
}	
