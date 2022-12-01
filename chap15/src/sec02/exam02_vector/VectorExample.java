package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>(); // �����Ѵ�� ArrayList���� ����
		
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		list.remove(2);
		list.remove(3); // ��������� 1,2,4�� ���Ե�.
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.toString());
		}
	}

}
