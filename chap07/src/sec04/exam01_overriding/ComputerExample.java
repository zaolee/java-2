package sec04.exam01_overriding;

public class ComputerExample {
	public static void main(String[] args) {	
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("원의 면적은 " + calculator.areaCircle(r) + "입니다.");
		
		System.out.println();
		Computer computer = new Computer();
		System.out.println("원의 면적은 " + computer.areaCircle(r) + "입니다.");
	
	}
}

