package oop.overloading;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 - Calculator 클래스에 calcRectArea() 메서드를 선언하여
		 
		 1. 길이를 하나만 전달하면 정사각형의 넓이를 리턴.
		 2. 길이를 두 개 전달하면 (가로, 세로) 직사각형의 넓이를 리턴.
		 3. 길이를 세 개 전달하면 (밑변, 윗변, 높이) 사다리꼴의 넓이를 리턴.
		 
		 MainClass에서 객체를 생성한 후 직접 메서드를 호출해서 출력해 보세요.
		 (길이가 5인 정사각형의 넓이, 가로10 세로20인 직사각형의 넓이
		 윗변 5 밑변 13 높이 7인 사다리꼴의 넓이) 
		 */
		
		Calculator c = new Calculator();
		System.out.println("정사각형의 넓이: " + c.calcRectArea(5));
		System.out.println("직사각형의 넓이: " + c.calcRectArea(10, 20));
		System.out.println("사다리꼴의 넓이: " + c.calcRectArea(5, 13, 7));
		
		
		
	}

}









