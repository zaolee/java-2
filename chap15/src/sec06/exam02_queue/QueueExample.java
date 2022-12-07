package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// 인터페이스 구성멤버 : 상수, 추상메소드, static메소드, default메소드
		// Queue<Messsage> messageQueue = new Queue<Message>(); 
		// 인터페이스 자체로 생성 불가능
		// queue는 선입선출
		Queue<Message> messageQueue = new LinkedList<>(); // 인터페이스 = 구현객체
		
		messageQueue.offer(new Message("sendMail", "1쏘연"));
		messageQueue.offer(new Message("sendSMS", "2쏘연"));
		messageQueue.offer(new Message("sendKaKaotalk", "3쏘연"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command){
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보낸다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보낸다.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to + "님에게 카톡을 보낸다.");
			}
		}

	}

}
