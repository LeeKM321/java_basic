package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			
			/*
			 - 자바에서는 문자열 동등 비교 시 '==' 연산자를
			  사용하면 제대로 비교가 되지 않습니다.
			  
			 - 문자열 String 타입이 기본 데이터 타입이 아닌
			  객체 참조 타입이기 때문입니다.
			  객체 참조 타입은 해당 값을 직접 들고 있는 게 아니라
			  객체의 주소값을 들고 있기 때문에,
			  문자열이 아무리 같더라도 주소가 다르면 false를
			  도출합니다.
			  
			 - 그러므로 문자열 동등 비교를 진행할 때는
			 [비교문자열1.equals(비교문자열2)] 를 사용하여
			 진행해야 합니다.
			 */
			
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			names[i] = name;
		}
		
//		System.out.println(Arrays.toString(names));
		
		System.out.println("-----------------------------------------------");
		System.out.print("입력받은 이름: ");
		for(String n : names) {
			if(n == null) break;
			System.out.print(n + " ");
		}
		
		
		sc.close();
		
	}

}
















