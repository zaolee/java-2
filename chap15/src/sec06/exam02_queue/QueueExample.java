package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// �������̽� ������� : ���, �߻�޼ҵ�, static�޼ҵ�, default�޼ҵ�
		// Queue<Messsage> messageQueue = new Queue<Message>(); 
		// �������̽� ��ü�� ���� �Ұ���
		// queue�� ���Լ���
		Queue<Message> messageQueue = new LinkedList<>(); // �������̽� = ������ü
		
		messageQueue.offer(new Message("sendMail", "1�"));
		messageQueue.offer(new Message("sendSMS", "2�"));
		messageQueue.offer(new Message("sendKaKaotalk", "3�"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command){
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ ������.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� ������.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to + "�Կ��� ī���� ������.");
			}
		}

	}

}
