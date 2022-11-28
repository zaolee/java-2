package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "�&����,¥����,5����-2�ҿ�";
		String[] names = text.split("&|,|-"); // | : �Ǵ�
		// split() ���� �ɷ� ���� ��� �ɰ�
		// String ��ü �ȿ� �ִ� split �żҵ�
		
		for (String name : names) { 
			// names �ڸ� -> �迭�ֱ� name�� ������ Ÿ�� : String
			System.out.println(name);
		}
		
		System.out.println();
		
		for (int i=0; i<names.length; i++) {			
			System.out.println(names[i]);
		}
	
	}
}
