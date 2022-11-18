package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class C extends A  {
	public void method() {
		/*
		A a = new A(); // protected라 다른 패키지인 상태에서 상속 받은게 아니니까 에러나 
		a.field = "value";  // 만약 protected가 아닌 public이면 import써서 호출 가능
		a.method();
		*/
	}
}
