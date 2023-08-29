package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포함해서 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		outer: while(true) {
			System.out.println("주민등록번호 13자리를 입력하세요");
			System.out.println("-을 포함해서 입력하세요.");
			System.out.print("> ");
			String ssn = sc.next();
			
			ssn = ssn.replace("-", "");
			
			if(ssn.length() != 13) {
				System.out.println("주민등록번호는 13자리 입니다.");
			} else {
				switch (ssn.charAt(6)) {
				case '1': case '3':
					System.out.println("남자입니다.");
					break outer;
				case '2': case '4':
					System.out.println("여자입니다.");
					break outer;
				default:
					System.out.println("잘못 입력했습니다.");
				}
			}
		}
		
		sc.close();
		
		
		
		
		
	

	}

}












