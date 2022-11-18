package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A { // A클래스를 상속받았기 때문에 접근가능
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
