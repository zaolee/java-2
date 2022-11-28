package sec05.exam04.getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("�ü�� �̸�: " + osName);
		System.out.println("����� �̸�: " + userName);
		System.out.println("�ÿ��� Ȩ���丮: " + userHome);
		
		Properties props = System.getProperties(); 
		// HashMap : Map�ڷᱸ��, <key, value> * �پ��� Ÿ�� �����͵� ����, ���� ���⸸ �ϸ� �� 
		// properties : Map�ڷᱸ��, <String, String> * only String Ÿ�Ը�
		// <"os.name", "Windows 10"> �̷������� �����°���
		Set keys = props.keySet(); 
		// set�ڷᱸ�� : �׾Ƹ�? �ָӴϾȿ� ��������(������ �ȵ��־�, �Է� ����� ������) 
		// �����Ͱ� �ߺ��� �ȵ�. null�� �ϳ� ����. -> properties�� �̷���
		// set�� �־���� ������ ������ for�� ����ϱ�
		for (Object object : keys) {
			String key = (String) object;
			String value = System.getProperty(key);
			System.out.println("[" + key + "]" + value );
		}
		
	}
}
