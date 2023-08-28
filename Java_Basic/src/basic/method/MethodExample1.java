package basic.method;

/*
# 메서드 (method)

- 메서드는 반복되는 코드 블록에 이름을 붙여놓은 것입니다.

- 메서드는 반복되는 코드를 줄여주고
 좀 더 구조화 시켜서 우리가 코드를 알아보기 쉽게 합니다. (코드의 모듈화)
 
- 메서드는 선언하는 과정과 호출하는 과정으로 나누어집니다.

- 메서드의 선언은 메서드 내부에서는 불가능합니다. 새로운 메서드의 선언은
 반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능합니다.
 
- 메서드의 호출은 메서드나 생성자 내부에서만 가능합니다.

- 메서드의 호출은 곧 메서드를 사용하는 것을 의미하며,
1. 메서드가 필요로 하는 데이터(매개값)를 호출부에서 전달하면
2. 그 값을 받아서 메서드 내부로 전달하고, 로직이 실행됩니다.
3. 실행 결과값을 메서드를 호출한 곳으로 다시 반환합니다.
4. 반환된 값은 변수에 담아서 저장하거나, 출력하는 등 다양하게 활용합니다.
*/

public class MethodExample1 {

	//메서드의 선언! (static은 뒤에서 알려드릴게요. 지금은 없다고 생각하세요.)
	static int calcTotal(int x) {
		int total = 0;
		for(int i=1; i<=x; i++) {
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		int total = calcTotal(10); // int total = 55;
		System.out.println(total);
		
		System.out.println("1~100까지의 누적합: " + calcTotal(100));
		System.out.println("1~200까지의 누적합: " + calcTotal(200));
		System.out.println("1~300까지의 누적합: " + calcTotal(300));
		System.out.println("1~400까지의 누적합: " + calcTotal(400));
		System.out.println("1~500까지의 누적합: " + calcTotal(500));
		System.out.println("1~600까지의 누적합: " + calcTotal(600));
		System.out.println("1~700까지의 누적합: " + calcTotal(700));
		
		
		
		
	}

}














