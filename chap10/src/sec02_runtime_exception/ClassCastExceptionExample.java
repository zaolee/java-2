package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat(); // �갡 ������
		changeDog(dog);
	}
	
	public static void changeDog(Animal animal) {  // Animal animal = new Cat();
		//if(animal instanceof Dog) {
		   Dog dog = (Dog) animal; 		//ClassCastException �߻� ����
		//} // if���� ����ؼ� ClasscastException ���� ��������
	}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
}

