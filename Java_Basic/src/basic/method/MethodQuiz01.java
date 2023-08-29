package basic.method;

public class MethodQuiz01 {
	
	static int calcDivisor(int num) {
		int count = 0;
		System.out.print("약수: ");
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) {
		
		/*
		 1. calcDivisor()라는 메서드를 선언하세요.
		 2. 이 메서드는 정수 하나를 전달받아서 해당 정수의
		  모든 약수를 가로로 출력하고 약수의 개수를 리턴하는
		  메서드입니다. (가로로 출력은 메서드 내부에서 진행)
		 3. 메서드 선언을 완료하시고, main에서
		  72의 약수의 개수와 10의 약수의 개수를 출력해 보세요.
		  호출 두번 하시는 거에요.
		 */
		
		System.out.println("72의 약수의 개수: " + calcDivisor(72));
		System.out.println("10의 약수의 개수: " + calcDivisor(10));

	}

}










