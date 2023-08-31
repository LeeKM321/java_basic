package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("김철수", 32, "남자");
//		Person lee = new Person("이영희", 25, "여자");
//		Person park = new Person("박뽀삐", 50, "남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
//		int[] arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("김철수", 32, "남자");
		
//		int[] arr = {1, 2, 3, 4, 5};
		Person[] people = {
				new Person("김철수", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("박뽀삐", 50, "남자")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();

//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p : people) {
			p.personInfo();
		}
		
		
	}

}












