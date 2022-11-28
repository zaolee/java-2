package sec08.exam01_split_stringtokenizer;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		// split 메소드 사용안하고 더 쉬운방법
		
		String text = "쏘연/kh/근주";

		StringTokenizer st = new StringTokenizer(text, "/");
		
		// 방법1: 전체 토큰 수를 얻어 for문으로 출력
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		// 방법2: 남아있는 토큰을 확인하고 while문으로 출력
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { // 토큰이 있으면 가져와
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}