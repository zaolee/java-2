package sec05.exam04.getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("시용자 홈디렉토리: " + userHome);
		
		Properties props = System.getProperties(); 
		// HashMap : Map자료구조, <key, value> * 다양한 타입 가져와도 가능, 둘이 같기만 하면 돼 
		// properties : Map자료구조, <String, String> * only String 타입만
		// <"os.name", "Windows 10"> 이런구조로 나오는거임
		Set keys = props.keySet(); 
		// set자료구조 : 항아리? 주머니안에 순서없이(정렬이 안되있어, 입력 출력이 무작위) 
		// 데이터가 중복이 안됨. null은 하나 있음. -> properties도 이런식
		// set에 넣어놀은 데이터 빼려면 for문 사용하기
		for (Object object : keys) {
			String key = (String) object;
			String value = System.getProperty(key);
			System.out.println("[" + key + "]" + value );
		}
		
	}
}
