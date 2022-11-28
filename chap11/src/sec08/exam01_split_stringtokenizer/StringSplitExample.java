package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "쏘연&근주,짜오리,5근주-2소연";
		String[] names = text.split("&|,|-"); // | : 또는
		// split() 넣은 걸로 구분 지어서 쪼개
		// String 객체 안에 있는 split 매소드
		
		for (String name : names) { 
			// names 자리 -> 배열넣기 name의 데이터 타입 : String
			System.out.println(name);
		}
		
		System.out.println();
		
		for (int i=0; i<names.length; i++) {			
			System.out.println(names[i]);
		}
	
	}
}
