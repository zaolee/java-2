package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {
	public static void main(String[] args) throws Exception {
		// 데이타를 보내는(발신자)쪽의 코드
	      DatagramSocket datagramSocket = new DatagramSocket();
	      System.out.println("[발신 시작]");
	      
//	      for 문이용
	      for(int i=1; i<3; i++) {

	         String data = "메시지" + i+"from 소연";

	         byte[] byteArr = data.getBytes("UTF-8");//UTF-8은 가변용 문자셋

	         DatagramPacket packet = new DatagramPacket(
	            byteArr, byteArr.length, //생성자에 매개변수 3개 있음
	            new InetSocketAddress("localhost", 5001)
	            //자동으로 누가 보내는지는 생성되게된다????????
	         );
	         

	         datagramSocket.send(packet);
	         System.out.println("[보낸 바이트 수]: " + byteArr.length + " bytes");

	      }
	      
	      System.out.println("[발신 종료]");

	      datagramSocket.close();
	   }
	}