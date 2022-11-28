package sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // ���Խ�
		// ( ) : �׷��� -> 02 �Ǵ� 010 �̴�. -> 010 : T
		// \d : �Ѱ��� ����
		// {n,m} : n�� ���� m�� ���� -> �Ѱ��� ���ڰ� 3�� ���� 4�� -> 123 : T
		// \t, \d : Ư���� t, d �� ���ٴ�.
		// \\t, \\d : �׳� t, d�� ���ٴ�.
		// {n} : ��Ȯ�� n�� -> 4567 : T
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data); 
		// ��ȿ�� ���� : �ʿ��� Ư�� ������ ���˿� �´��� ����. ��) �̸��� ������ �´���?, ��ȭ��ȣ ������ �´���?
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom"; // ���� .�� ��� ����ġ
		result = Pattern.matches(regExp, data);
		// \w : �Ѱ��� ���ĺ� �Ǵ� ����.
		// + : �Ѱ��̻� -> ���ĺ��� �Ѱ� �̻� : angle : T
		// ? : ���ų� �Ѱ� -> (\\.\\w+)? : �׷��� �Ȱ� ���ų� �Ѱ�
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}
}
