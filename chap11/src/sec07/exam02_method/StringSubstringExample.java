package sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "970808-2451255";
		
		String firstNum = ssn.substring(0, 6); // 0부터 6전까지, 즉 0부터 5
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	} 
}

