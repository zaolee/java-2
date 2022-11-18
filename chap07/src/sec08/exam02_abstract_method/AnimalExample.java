package sec08.exam02_abstract_method;

public class AnimalExample {
	// 메소드
	public static void main(String[] args) {
		
		Dog hotdog = new Dog();
		Cat kitty = new Cat();
		
		hotdog.Sound();
		kitty.Sound();
		
		System.out.println("\n지역변수의 자동 타입 변환");
		Animal dongmul = null; // dongmul은 참조변수, 지역변수
		dongmul = new Dog(); // 자동형 변환, 부모 <- 자식
		dongmul.Sound();		
		dongmul = new Cat(); // 자동형 변환, 부모 <- 자식
		dongmul.Sound();

		
		System.out.println("\n매개변수의 자동타입변환");
		
		aboutAnimal(new Dog()); // 자동형 변환, 부모 <- 자식 
		System.out.println();
		aboutAnimal(new Cat());

	}
	
	// 메소드
	public static void aboutAnimal (Animal animal) {
		animal.Sound();
		animal.breath();
		// animal.kind();
	}
}
