package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat(); // 얘가 문제임
		changeDog(dog);
	}
	
	public static void changeDog(Animal animal) {  // Animal animal = new Cat();
		//if(animal instanceof Dog) {
		   Dog dog = (Dog) animal; 		//ClassCastException 발생 가능
		//} // if절을 사용해서 ClasscastException 예외 방지가능
	}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
}

