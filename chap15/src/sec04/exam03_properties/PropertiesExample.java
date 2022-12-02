package sec04.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties객체 생성 = Map<String, String>
		Properties properties  = new Properties();
		
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		// C:\dev\workspace\java\chap15\src\sec04\exam03_properties\PropertiesExample.java
		// 이런거 불러오는거임
		
		path = URLDecoder.decode(path, "utf-8"); // 중간에 한글 들어갈수도 있으니까.
		properties.load(new FileReader(path)); // FileReader : 파일 IO(입출력)을 담당하는 클래스
		// 맵구조로 앞에는 K, 뒤에는 V로 읽는거.
		// [{"driver" : "oracle.jdbc.OracleDirver"}, {"username" : "scott"},,,]이런식으로 생성
		
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password"); 
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}

