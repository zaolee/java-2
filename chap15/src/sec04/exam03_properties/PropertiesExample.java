package sec04.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties��ü ���� = Map<String, String>
		Properties properties  = new Properties();
		
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		// C:\dev\workspace\java\chap15\src\sec04\exam03_properties\PropertiesExample.java
		// �̷��� �ҷ����°���
		
		path = URLDecoder.decode(path, "utf-8"); // �߰��� �ѱ� ������ �����ϱ�.
		properties.load(new FileReader(path)); // FileReader : ���� IO(�����)�� ����ϴ� Ŭ����
		// �ʱ����� �տ��� K, �ڿ��� V�� �д°�.
		// [{"driver" : "oracle.jdbc.OracleDirver"}, {"username" : "scott"},,,]�̷������� ����
		
		
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

