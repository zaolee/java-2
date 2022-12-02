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
		Set s = new HashSet(); // -> 얘는 순서 없이 출력..
		TreeSet ts = new TreeSet(); // -> 얘 쓰면 값이 정렬되서 나옴.. 굿
		// 값이 하나 들어올때마다 크기 비교해서 왼쪽 오른쪽 구분되서 저장됨..(들어갈때 구조화되서 들어가는거) 그러다보니 오름차순으로 정렬되는거.
		Random r = new Random(); // 0.0<= Math.random() : 임의의 실수를 나타내는거. <1.0
		// n = r.nextInt(45+1); // 1~45 임의의 정수
		// s.add(n); // 값이 하나 들어가니까, 반복문(while써서 6개 나오게 하자)		
		while(s.size() < 6) {
			n = r.nextInt(45+1);
			s.add(n); // s는 set이니가 중복 허용안해, n이 중복된 수를 가져와도 s에서 안받아줘, 알아서 걸러줌..
		}
		ts.addAll(s); // 이렇게 set써주고 treeset에 addall 해서 써줄수 있지만, 걍 처음부터 treeset써주는게 편함.
		System.out.println(ts); // 정렬이 아직 되어있지 않음. -> TreeSet써주기
	}
}	
