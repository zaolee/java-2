package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	// java -> main �����尡 main() �޼ҵ带 �����Ѵ�.
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep(); // �Ҹ��� ���ϰ� ����
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("��"); // �Ҹ��� 5�� ��µȵڿ� �� �� 5�� ��� 
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
