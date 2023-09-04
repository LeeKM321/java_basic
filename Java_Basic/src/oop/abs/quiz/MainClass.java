package oop.abs.quiz;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape r = new Rect("정사각형", 5);
		System.out.println("도형의 이름: " + r.getName());
		System.out.println("넓이: " + r.getArea());
		
		System.out.println("=====================================");
		
		Shape c = new Circle("원", 4);
		System.out.println(c.getName());
		System.out.printf("넓이: %.2f", c.getArea());
		
	}

}
