package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(5001);
		// 데이타를 받는(수신자)쪽의 코드
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet);
						
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[받은 내용: "  + packet.getSocketAddress() + "] " + data);
					}
				} catch (Exception e) {
					System.out.println("[수신 종료]");
				}
			}			
		};
		thread.start();
		
		Thread.sleep(10000);
		datagramSocket.close();
	}
}
//import java.net.InetSocketAddress;
//
//public class UdpSendExample {
//	public static void main(String[] args) throws Exception {
//		// 데이타를 보내는(발신자)쪽의 코드
//		DatagramSocket datagramSocket = new DatagramSocket(5001);
//		
//		// 작업스레드 생성 
//		Thread thread = new Thread() { // 익명자식객체로 만들꺼
//			@Override
//			public void run() {
//				System.out.println("[수신 시작]");
//				try {
//					while(true) {
//						DatagramPacket packet = new DatagramPacket(new byte[100],100);
//						datagramSocket.receive(packet); // 데이터 입력될때까지 기다림.
//						
//						String data = new String(packet.getData(),0,packet.getLength(),"UTF-8"); // 디코딩(byte->String)
//						System.out.println("[받은 내용: " + packet.getSocketAddress() + "]");
//					}
//				} catch(Exception e) {
//					System.out.println("[수신 종료]");
//				}
//			} 			
//		};
//		thread.start(); // 작업스레드를 병렬로 실행시킨다.
//		
//		thread.sleep(10000); // 메일스레드를 일시정지상태로 만든다. 
//		datagramSocket.close();
//	}
//}

