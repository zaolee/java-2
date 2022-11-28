package sec08.exam01_split_stringtokenizer;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		// split �޼ҵ� �����ϰ� �� ������
		
		String text = "�/kh/����";

		StringTokenizer st = new StringTokenizer(text, "/");
		
		// ���1: ��ü ��ū ���� ��� for������ ���
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		// ���2: �����ִ� ��ū�� Ȯ���ϰ� while������ ���
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { // ��ū�� ������ ������
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}