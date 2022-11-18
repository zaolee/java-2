package sec08.exam02_abstract_method;

public abstract class Animal {
	// 필드
	public String kind;
	
	// 생성자
	
	// 일반메소드
	public void breath() {
		System.out.println("동물은 숨을 쉰다.");
	}
	
	// 추상메소드
	public abstract void Sound(); // 상속받은 클래스들은 얘를 꼭 재정의 하기.

}
