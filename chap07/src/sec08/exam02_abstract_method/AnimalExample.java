package sec08.exam02_abstract_method;

public class AnimalExample {
	// �޼ҵ�
	public static void main(String[] args) {
		
		Dog hotdog = new Dog();
		Cat kitty = new Cat();
		
		hotdog.Sound();
		kitty.Sound();
		
		System.out.println("\n���������� �ڵ� Ÿ�� ��ȯ");
		Animal dongmul = null; // dongmul�� ��������, ��������
		dongmul = new Dog(); // �ڵ��� ��ȯ, �θ� <- �ڽ�
		dongmul.Sound();		
		dongmul = new Cat(); // �ڵ��� ��ȯ, �θ� <- �ڽ�
		dongmul.Sound();

		
		System.out.println("\n�Ű������� �ڵ�Ÿ�Ժ�ȯ");
		
		aboutAnimal(new Dog()); // �ڵ��� ��ȯ, �θ� <- �ڽ� 
		System.out.println();
		aboutAnimal(new Cat());

	}
	
	// �޼ҵ�
	public static void aboutAnimal (Animal animal) {
		animal.Sound();
		animal.breath();
		// animal.kind();
	}
}
