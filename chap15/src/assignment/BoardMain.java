package assignment;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		do {
			System.out.println();
			System.out.println("�޴��� �Է� �ϼ���");
			System.out.println("1.�Խ��� �۾���");
			System.out.println("2.�� ��� ����");
			System.out.println("3.�� ����");
			System.out.println("4.����");
			String menu = sc.next(); // Ű���� �Է��� ����ϰ� ����.
			switch (menu) {
			case "1":
				boardSVC.writeArticle(sc);
				break;
			case "2":
				boardSVC.listArticles(sc);
				break;
			case "3":
				boardSVC.removeArticle(sc);
				break;
			case "4":
				isStop = true;
			}
		} while (!isStop);

	}

}
