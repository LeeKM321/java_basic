package oop.modi.protec.pac1;

public class B {
	
	A a1 = new A(30); //protected
	A a2 = new A(3.14); //default
	
	public B() {
		a1.x = 1;
		a1.y = 2;
		
		a1.method1();
		a1.method2();
	}

}
