package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		switch(point / 10) {
		
		case 10:
			if(point > 100) {
				System.out.println("잘못된 점수입니다.");
				break;
			} 
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		
		default:
			if(point > 100 || point < 0) {
				System.out.println("점수를 잘못 입력하셨습니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}
		
		}
		
		sc.close();
		
		
		
		
		
		
		sc.close();

	}

}









