package oop.inter.good;

/*
 - 회원 관리에 대한 모든 로직을 같은 이름의 메서드를 이용해서
  일괄 처리하기 위해 인터페이스를 선언했습니다.
  
 - 또한, 객체를 생성할 때 인터페이스 타입 하나만으로
 여러가지 객체들을 상황에 맞게 교체할 수 있다는 장점도 생깁니다. (다형성)
 */

public interface IUserService {
	
	void execute(); //추상메서드 선언

}
