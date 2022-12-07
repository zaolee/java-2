package assignment_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		String name = null; // 최고점수를 받은 아이디
		int maxScore = 0; // 최고점수
		int totalScore = 0;
		// #1 작성 위치
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for (Map.Entry<String, Integer> entry : set) {
			if (entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}

		int avgs = totalScore / map.size();
		System.out.println("평균점수: " + avgs);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}

//실행 결과
//평균점수: 91
//최고점수: 96
//최고점수를 받은 아이디: blue