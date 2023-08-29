package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 1. 스캐너를 통해 id를 입력받습니다.
		 2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높습니다.
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력후
		 종료하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ID: ");
			String id = sc.nextLine();
			id = id.trim();
			id = id.replace(" ", "");
			
			if(id.length() < 5) {
				System.out.println("아이디는 5글자 이상이어야 합니다.");
			} else {
				System.out.println("ID가 등록되었습니다.");
				break;
			}
			
		}
		
		sc.close();
		
		
		
		
		
		

	}

}
