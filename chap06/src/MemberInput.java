import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü �迭
		MemberInfo01[] m = new MemberInfo01[5];
		int i = 0;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է��ϼ���? ");
			String name = sc.next();
			System.out.print("���̸� �Է��ϼ���? ");
			int age = sc.nextInt();
			System.out.print("E-Mail�� �Է��ϼ���? ");
			String email = sc.next();
			System.out.print("�ּҸ� �Է��ϼ���? ");
			String address = sc.next();

			m[i] = new MemberInfo01();
			// m.name="ȫ�浿";
			m[i].setName(name);
			m[i].setAge(age);
			m[i].setEmail(email);
			m[i].setAddress(address);
			i++;

			System.out.println("����ҷ��� y, ������� n�� �Է�?");
			yn = sc.next();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("����:" + m[j].getName());
			System.out.println("����:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("�ּ�:" + m[j].getAddress());
		}
	}

}

class MemberInfo01 {
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
