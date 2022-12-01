package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		int[] selectNumber2 = new int[6];
		Random r = new Random();
		for (int j : selectNumber2) {
			selectNumber2[j] = r.nextInt(45)+1;			
		}
		set.add(selectNumber2);
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			int element = iterator.next();
			System.out.println(element);
		}
	}
}	
