package oop.obj_arr;

public class Person {
	
	/*
	 - alt + shift + s -> generate getters and setters
	 - alt + shift + s -> generate constructor using fields
	 */
	
	private String name;
	private int age;
	private String gender;
	
	public Person() {}
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void personInfo() {
		System.out.printf("이름: %s\n나이: %d세\n성별: %s\n"
				, this.name, this.age, this.gender);
	}
	
	

}









