package sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // 정규식
		// ( ) : 그룹핑 -> 02 또는 010 이다. -> 010 : T
		// \d : 한개의 숫자
		// {n,m} : n개 부터 m개 까지 -> 한개의 숫자가 3개 부터 4개 -> 123 : T
		// \t, \d : 특수한 t, d 로 쓰겟다.
		// \\t, \\d : 그냥 t, d로 쓰겟다.
		// {n} : 정확히 n개 -> 4567 : T
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data); 
		// 유효성 검토 : 필요한 특정 데이터 포맷에 맞는지 검증. 예) 이메일 형식이 맞는지?, 전화번호 형식이 맞는지?
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom"; // 지금 .이 없어서 불일치
		result = Pattern.matches(regExp, data);
		// \w : 한개의 알파벳 또는 숫자.
		// + : 한개이상 -> 알파벳이 한개 이상 : angle : T
		// ? : 없거나 한개 -> (\\.\\w+)? : 그룹핑 된게 없거나 한개
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
