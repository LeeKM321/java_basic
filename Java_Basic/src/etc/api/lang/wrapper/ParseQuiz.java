package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		/*
		 주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

		ex) 입력값: 9201013-1234567
		출력값: 1992년 10월 13일 31세 남자 
		
		입력값: 040906-4123456
		출력값: 2004년 9월 6일 19세 여자 
		
		입력값은 하이픈이 포함된 문자열이어야 합니다. 
		하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 
		1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
		또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String ssn;
		char c;
		
		while(true) {
			System.out.println("주민등록번호를 입력하세요(- 포함)");
			System.out.print("> ");
			ssn = sc.next();
			
			if(ssn.indexOf("-") == -1) {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
				continue;
			}
			
			if(ssn.length() != 14) {
				System.out.println("올바른 주민등록번호 형태가 아닙니다.");
				continue;
			}
			
			c = ssn.charAt(7);
			if(!(c == '1' || c == '2' || c == '3' || c == '4')) {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue;
			}
			
			try {
				String test = ssn.substring(0, 6);
				String test2 = ssn.substring(7);
				Integer.parseInt(test);
				Integer.parseInt(test2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자로 정확하게 입력하셔야 합니다.");
			}	
		}
		
		//921013-1234567
		int year = Integer.parseInt(ssn.substring(0, 2));
		int month = Integer.parseInt(ssn.substring(2, 4));
		int day = Integer.parseInt(ssn.substring(4, 6));
		
		String gender; int birthYear;
		
		if(c == '1' || c == '3') {
			gender = "남자";
		} else {
			gender = "여자";
		}
		
		if(c == '1' || c == '2') {
			birthYear = 1900 + year;
		} else {
			birthYear = 2000 + year;
		}
		
		int age = 2023 - birthYear;
		
		System.out.printf("%d년 %d월 %d일 %d세 %s\n", birthYear, month, day, age, gender);
		
		
		sc.close();
		

	}

}








