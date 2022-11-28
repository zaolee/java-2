package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// key(class) �� value(String)�� ����ȭ ���ִ°�. ��� ���̽� dictionary ����?
		
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� �о��
		String value  = hashMap.get(new Key(1));
		// �ּҸ� ���� ���� �ƴ϶�, �������� ���ؾߵ�, �ȿ� ���ִ� ���� ����?
		// �ٵ� �ؽ��ڵ�� �ּҷ� ����. ���� �񱳸� �ϱ� ���ؼ� ������ �ʿ�
		System.out.println(value);
		System.out.println(value.toString());
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
		
	}
}


