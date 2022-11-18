package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	// 필드
	// 생성자
	public SmartPhone(String owner) {
		// super();
		super(owner);
	}
	// 메소드
	public void internetSearch() {
		System.out.println("web searching");
	}

}
