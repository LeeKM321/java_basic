package oop.final_.method;

/*
	- 클래스 선언 시 final을 사용하면 그 클래스는 상속이 불가능해집니다.
	
	- final 클래스는 자식 클래스를 가질 수 없고, 오직 외부에서 객체 생성을
	통해서만 사용할 수 있습니다.
	
	- 대표적인 final 클래스는 String 입니다.
*/

public class Parent {
	
	void method1() {}
	void method2() {}
	final void method3() {}

}
