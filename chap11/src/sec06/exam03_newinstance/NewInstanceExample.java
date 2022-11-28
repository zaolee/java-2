package sec06.exam03_newinstance;

import java.util.ArrayList;

public class NewInstanceExample {
	public static void main(String[] args) {
		
		Action action5 = new SendAction(); // �����ڵ�
		Action action6 = new ReceiveAction(); // �����ڵ�
		action5.execute(); 
		action6.execute(); 
		// ���� : ������ �ٲ���ߵǼ� �������� �����.
		System.out.println();
		
		
		try {
			Class clazz1 = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			Class clazz2 = Class.forName("sec06.exam03_newinstance.SendAction");
			// SendeAction Ŭ������(���ڿ���) Ŭ���� ��ü�� �����Ѵ�.
			// SendeAction Ŭ������ ��ü�ƴ�.
			// Class��ü : ��Ÿ������ : �����ϴ� Ŭ������ ������ �����ϴ� ��ü(����)
			// �̷��� ������ �ϸ� �� ������������ �Ҽ� �ִµ� �̰� args[0]������ ��
			Class clazz7 = Class.forName(args[0]);
			
			Object obj1 = clazz1.newInstance(); // ������ ��ü ���� (ReceiveAction��ü)
			Object obj2 = clazz2.newInstance(); 
			Object obj7 = clazz7.newInstance(); 
			// SendAcion() ��ü �����ǰ� ObjectŸ������ �ڵ�����ȯ
			
			Action action1 = (Action) obj1; 
			Action action2 = (Action) obj2; 
			Action action7 = (Action) obj7; 
			// ��������ȯ : Interface <- Object
			action1.execute(); // Object Ŭ�������� ���� ������ ��������ȯ ���Ѽ� �����Ű�°�
			action2.execute(); // Object Ŭ�������� ���� ������ ��������ȯ ���Ѽ� �����Ű�°�
			System.out.println();
			
			action7.execute();
			System.out.println();
			
			// SendAction obj = new SendAction();
			// SendeAction Ŭ������ ��ü
						
			Action action3 = (Action) clazz1.newInstance(); // Action 1,2�� ��ŵ�Ѱ� �̰���.
			Action action4 = (Action) clazz2.newInstance(); // ������ü����
			action3.execute();
			action4.execute();
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}


