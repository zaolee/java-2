package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}

	@Override // 추상메서드를 구현한다. implementation
	public void Sound() {
		System.out.println("멍멍이는 야옹");

	}

}
