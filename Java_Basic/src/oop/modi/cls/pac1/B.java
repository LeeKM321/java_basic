package oop.modi.cls.pac1;

//public 제한자는 접근 제한 자체가 없는 형태 (어디에서나 사용 가능)
public class B {
	
	//클래스 A의 접근제한자는 default이기 때문에 동일 패키지 내부의
	//클래스에는 접근이 가능합니다.
	A a = new A();

}
