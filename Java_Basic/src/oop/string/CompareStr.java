package oop.string;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {
		
		/*
		 - String은 객체 타입입니다. 
		 여러개의 단일 문자를 변수 하나에 넣을 수가 없기 때문에
		 String객체가 생성되어서 여러 문자들을 한번에 보관하고
		 문자열을 다룰 수 있는 여러 기능들을 제공합니다. (뒤에서 할게요)
		 
		 - 그렇기 때문에 String 변수에는 문자열이 아니라
		 문자열 객체의 주소값이 들어가 있습니다.
		 우리가 평소에 String 변수를 그냥 사용해도 문자열이 제대로 나오는 것은
		 자바에서 편하게 쓰라고 기능을 제공하는 거지, 실제로는 주소값으로
		 접근해서 사용하는 것입니다.
		 
		 - 그렇기 때문에 == 연산자로 변수의 값 자체를 비교하는 것은
		 결국 주소값을 비교하겠다는 의미와 같은 것이고, 이것은 의미가 없습니다.
		 문자열의 내용 값 그 자체를 비교할 때는 equals() 메서드를 사용해야
		 합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		User kim = new User();
		kim.id = "abc1234";
		kim.pw = "aaa1111";
		
		System.out.print("비밀번호를 입력하세요: ");
		String password = sc.next();
		
		System.out.println("내가 방금 입력한 비번: " + password);
		System.out.println("객체 생성 시 지정한 비번: " + kim.pw);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("== 연산자의 결과: " + (password == kim.pw));
		System.out.println("equals의 결과: " + (password.equals(kim.pw)));
		

	}

}













