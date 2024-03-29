package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		// List list = Arrays.asList();
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3); 
		// list2안에 1,2,3이 들어가있는게 아니라 list[0] = Integer안에 1, 이런식으로 들어가 있는거,,
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
