package oop.encap.good;

public class MyBirth {
	
	/*
	 # 정보 은닉: 데이터 보호의 목적으로 사용하는
	  oop 기술 중 하나.
	  
	 - 외부에서 직접 변수에 접근할 수 없도록 멤버변수에 private 제한을 붙임.
	 */
	
	private int year;
	private int month;
	private int day;
	
	/*
	 - 정보 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만
	  private을 설정했더니 데이터 접근 자체가 불가능해집니다.
	  
	 - 따라서 데이터의 유효성을 검증할 수 있는 제어문이 포함된
	  메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데,
	  이 때 사용하는 메서드를 getter / setter 메서드라고 부릅니다.
	  
	  # setter method
	 
	 1. setter는 숨겨진 변수에 값을 저장하기 위한 메서드 입니다.
	 
	 2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여
	  적절한 데이터만 멤버변수에 저장시키고, 접근제한자는
	  public으로 설정하여 외부에서 누구나 사용할 수 있게 합니다.
	  
	 3. 메서드 이름은 일반적으로 set + 멤버변수이름 으로 설정합니다.
	 */
	
	public void setYear(int year) {
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 연도 입력입니다.");
		} else {
			this.year = year;
		}
	}
	
	/*
	 # getter method
	 
	 1. getter는 숨겨진 변수의 값을 참조할 때 사용하는 메서드입니다.
	 
	 2. setter와 마찬가지로 public제한을 통해 외부에 메서드를 공개하고,
	  이름은 일반적으로 get + 멤버변수이름 으로 지정합니다.
	 */
	
	public int getYear(String pw) {
		if(pw.equals("aaa1111!")) {
			return this.year;			
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
			return 0;
		}
	}
	
	/*
	 - month와 day의 setter / getter 메서드를 선언하세요.
	 - month: 1 ~ 12
	 - day: 1 ~ 31
	 - getter 메서드는 따로 비밀번호 등 권한 검사 없이
	  바로 return 속성값 해 주세요.
	 */
	
	public void setMonth(int month) {
		if(month > 12 || month < 1) {
			System.out.println("잘못된 월 입력입니다.");
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println("잘못된 일 입력입니다.");
		} else {
			if(this.month == 0) {
				System.out.println("일자를 입력하기 위해서는 월 입력이 선행되어야 합니다.");
				return;
			}
			if(!isValidateMonth(day)) {
				System.out.println("월에 따른 일자가 올바르지 않습니다.");
				return;
			}
			this.day = day;
		}	
	}
	
	public int getDay() {
		return day;
	}
	
	//완성된 생일 정보를 출력해 주는 메서드
	public void birthInfo() {
		//year, month, day 셋 중 단 하나라도 제대로 값이 셋팅되지 않았다면
		//출력을 해 주지 않겠다.
		if(this.year == 0 || this.month == 0 || this.day == 0) {
			System.out.println("날짜 필드 중에 초기화 되지 않은 데이터가 있습니다.");
			return;
		}
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
				, this.year, this.month, this.day);
	}
	
	private boolean isValidateMonth(int day) {
		//각 월에 적합한 일자가 세팅이 되어 있는지를 판별하는 메서드
		switch(this.month) {
		case 2:
			if(day > 28) {
				return false;
			}
		case 4: case 6: case 9: case 11:
			if(day > 30) {
				return false;
			}
		default:
			return true;			
		}
	}
	
	/*
	 - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
	  캡슐화 라고 합니다. (encapsulation)
	  데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
	 */
	

}












