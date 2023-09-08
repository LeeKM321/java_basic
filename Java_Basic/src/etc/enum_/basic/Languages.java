package etc.enum_.basic;

	/*
	 # 상수를 정의해서 코드를 작성하면 다양한 문제가 발생할 수 있다.
	 1. 상수의 값 자체는 변경이 불가하겠지만, 상수를 받는 객체의 필드 값은 안정적이지 못함.
	 2. 상수는 어느 클래스에서나 선언할 수 있기 때문에 무분별한 상수 선언이 이뤄질 수 있음.
	 3. 코드의 가독성 또한 좋지 못하다.
	 
	 # enum class를 사용하면 얻을 수 있는 장점.
	 1. 코드가 단순해지고 가독성이 좋아짐.
	 2. 정의한 상수 이외의 값을 컴파일 과정에서 막기 때문에 타입 안정성이 증가함.
	 3. 관련있는 상수들끼리 모아놓기 때문에 구현의 의도를 명확하게 파악 가능.
	 */

public enum Languages {
	
	//상수("연관시킬 문자")
	JAVA("자바"), 
	PYTHON("파이썬"), 
	CPP("c++"), 
	JAVASCRIPT("자바스크립트"), 
	C("c"); //세미콜론 붙이기
	
	private final String name; //상수와 연관시킬 문자값을 담을 필드 선언.
	
	public String getName() { // 한글 이름을 얻어내기 위한 메서드 (name -> private)
		return name;
	}
	
	//외부에서 enum 타입의 상수를 사용 시 enum 객체가 생성됨.
	//위에 선언한 방식의 상수와 연관 문자를 전달해서 name 필드에 값을 초기화.
	private Languages(String name) {
		this.name = name;
	}

}









