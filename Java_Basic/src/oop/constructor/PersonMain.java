package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		/*
		 Scanner를 이용해서 사용자에게
		 이름, 나이, 키를 입력받아서 
		 해당 정보를 저장하는 객체를 디자인 해 보세요.
		 객체 내에는 해당 사람의 정보를 모두 출력 해 주는
		 info() 메서드가 존재합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Person kim = new Person();
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("키: ");
		int height = sc.nextInt();
		
		Person p = new Person(name, age, height);
		p.info();
		
		sc.close();
		
		
		

	}

}












