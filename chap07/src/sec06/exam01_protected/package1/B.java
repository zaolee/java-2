package sec06.exam01_protected.package1;


public class B {
	  
	public void method() {
	     A a = new A();   //A 가 다른 클래스이지만 같은 패기지라서 객체 생성이 가능하다.
	     a.field = "value";
	     a.method();
	   }
}


