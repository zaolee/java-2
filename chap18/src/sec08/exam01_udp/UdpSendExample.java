package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {
	public static void main(String[] args) throws Exception {
		// ����Ÿ�� ������(�߽���)���� �ڵ�
	      DatagramSocket datagramSocket = new DatagramSocket();
	      System.out.println("[�߽� ����]");
	      
//	      for ���̿�
	      for(int i=1; i<3; i++) {

	         String data = "�޽���" + i+"from �ҿ�";

	         byte[] byteArr = data.getBytes("UTF-8");//UTF-8�� ������ ���ڼ�

	         DatagramPacket packet = new DatagramPacket(
	            byteArr, byteArr.length, //�����ڿ� �Ű����� 3�� ����
	            new InetSocketAddress("localhost", 5001)
	            //�ڵ����� ���� ���������� �����ǰԵȴ�????????
	         );
	         

	         datagramSocket.send(packet);
	         System.out.println("[���� ����Ʈ ��]: " + byteArr.length + " bytes");

	      }
	      
	      System.out.println("[�߽� ����]");

	      datagramSocket.close();
	   }
	}