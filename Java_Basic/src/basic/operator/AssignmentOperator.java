package basic.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 # 대입(할당) 연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /=, %=)
		 - 변수에 값을 대입할 때 사용하는 연산자 입니다.
		 - 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태입니다.
		 */
		
		int a = 5;
		int b = 3;
		
		b =+ 3; // b = +3
		System.out.println(b);
		
		a += 3; // a = a + 3
		System.out.println(a);
		
		a -= 4; //4
		System.out.println(a);
		
		a *= 6; //24
		System.out.println(a);
		
		a /= 5; //4
		System.out.println(a);
		
		a %= 3; //1
		System.out.println(a);

		

	}

}






