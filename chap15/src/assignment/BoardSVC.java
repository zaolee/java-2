package assignment;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class BoardSVC {
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList();
	}

	// �� �Է� ó�� �޼ҵ�
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��ǿ� ���� �ۼ� �ϼ���.");
		System.out.print("�ۼ���:");
		String register = sc.next();
		System.out.print("�̸���:");
		String email = sc.next();
		System.out.print("��й�ȣ:");
		String passwd = sc.next();
		System.out.print("����:");
		String subject = sc.next();
		System.out.print("�۳���:");
		String content = sc.next();
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);
	}

	// �� �ۼ�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// �۸�� ���
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		} else {
			System.out.println("��ϵ� ���� �����ϴ�.");
		}
	}

	// ������ ���� �ۼ��� �� ��й�ȣ �Է��ϴ� �޼ҵ�
	public void removeArticle(Scanner sc) {
		if(boardList.size() >0) {
			System.out.println("������ ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
			System.out.print("�ۼ���:");
			String register = sc.next();
			System.out.print("��й�ȣ:");
			String passwd = sc.next();
			boolean isRemoved = false;
			
			for(int i=0; i< boardList.size(); i++) {
				if(boardList.get(i).getRegister().equals(register) && boardList.get(i).getPasswd().equals(passwd)) {
					boardList.remove(i--); // i : 0 ����ڿ� i-- : -1��. �ٽ� �ö󰡸� i++�Ǽ� 0 
					isRemoved = true;				
				} else {
					System.out.println("�ش� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				} 
			} if(isRemoved) {
				System.out.println("�ش� �Խñ��� ���������ϴ�.");
			}
		} else {
			System.out.println("�Խ��ǿ� ���� �����ϴ�.");
		}		
	}
}