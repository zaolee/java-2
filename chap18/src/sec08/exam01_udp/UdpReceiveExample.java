package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(5001);
		// ����Ÿ�� �޴�(������)���� �ڵ�
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[���� ����]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet);
						
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[���� ����: "  + packet.getSocketAddress() + "] " + data);
					}
				} catch (Exception e) {
					System.out.println("[���� ����]");
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
//		// ����Ÿ�� ������(�߽���)���� �ڵ�
//		DatagramSocket datagramSocket = new DatagramSocket(5001);
//		
//		// �۾������� ���� 
//		Thread thread = new Thread() { // �͸��ڽİ�ü�� ���鲨
//			@Override
//			public void run() {
//				System.out.println("[���� ����]");
//				try {
//					while(true) {
//						DatagramPacket packet = new DatagramPacket(new byte[100],100);
//						datagramSocket.receive(packet); // ������ �Էµɶ����� ��ٸ�.
//						
//						String data = new String(packet.getData(),0,packet.getLength(),"UTF-8"); // ���ڵ�(byte->String)
//						System.out.println("[���� ����: " + packet.getSocketAddress() + "]");
//					}
//				} catch(Exception e) {
//					System.out.println("[���� ����]");
//				}
//			} 			
//		};
//		thread.start(); // �۾������带 ���ķ� �����Ų��.
//		
//		thread.sleep(10000); // ���Ͻ����带 �Ͻ��������·� �����. 
//		datagramSocket.close();
//	}
//}

