package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 # 사용자에게 구구단 단수를 입력받아서
		 해당 단수의 구구단을 출력해 보세요.
		 ex)
		 
		 구구단을 입력하세요: 4
		 *** 구구단 4 단 ***
		 4 x 1 = 4
		 4 x 2 = 8
		 4 x 3 = 12
		 4 x 4 = 16 
		 .
		 .
		 .
		 4 x 9 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 입력하세요: ");
		int dan = sc.nextInt();
		System.out.println("*** 구구단 " + dan + "단 ***");
		
		int hang = 1;
		while(hang <= 9) {
			System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
			hang++;
		}
		
		sc.close();
		

	}

}







