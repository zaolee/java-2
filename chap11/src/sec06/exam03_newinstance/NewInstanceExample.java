package sec06.exam03_newinstance;

import java.util.ArrayList;

public class NewInstanceExample {
	public static void main(String[] args) {
		
		Action action5 = new SendAction(); // 정적코드
		Action action6 = new ReceiveAction(); // 정적코드
		action5.execute(); 
		action6.execute(); 
		// 단점 : 일일이 바꿔줘야되서 유지보수 힘들어.
		System.out.println();
		
		
		try {
			Class clazz1 = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			Class clazz2 = Class.forName("sec06.exam03_newinstance.SendAction");
			// SendeAction 클래스의(문자열의) 클래스 객체를 생성한다.
			// SendeAction 클래스의 객체아님.
			// Class객체 : 메타데이터 : 지정하는 클래스의 내용을 설명하는 객체(설명서)
			// 이렇게 일일히 하면 왜 정적변수일지 할수 있는데 이걸 args[0]넣으면 돼
			Class clazz7 = Class.forName(args[0]);
			
			Object obj1 = clazz1.newInstance(); // 설명서로 객체 만듦 (ReceiveAction객체)
			Object obj2 = clazz2.newInstance(); 
			Object obj7 = clazz7.newInstance(); 
			// SendAcion() 객체 생성되고 Object타입으로 자동형변환
			
			Action action1 = (Action) obj1; 
			Action action2 = (Action) obj2; 
			Action action7 = (Action) obj7; 
			// 강제형변환 : Interface <- Object
			action1.execute(); // Object 클래스에는 없기 때문에 강제형변환 시켜서 실행시키는거
			action2.execute(); // Object 클래스에는 없기 때문에 강제형변환 시켜서 실행시키는거
			System.out.println();
			
			action7.execute();
			System.out.println();
			
			// SendAction obj = new SendAction();
			// SendeAction 클래스의 객체
						
			Action action3 = (Action) clazz1.newInstance(); // Action 1,2를 스킵한게 이거임.
			Action action4 = (Action) clazz2.newInstance(); // 동적객체생성
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


