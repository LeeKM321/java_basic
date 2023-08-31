package oop.poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	Player() {
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	
	Player(String name) {
		this(); 
		this.name = name;
	}
	
	Player(String name, int hp) {
		this(name); 
		this.hp = hp;
	}
	
	void attack(Player target) {
			
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		//출력 메세지: x가 y를 공격합니다.
		System.out.printf("%s(이)가 %s(을)를 공격합니다.\n"
				, this.name, target.name);
		
		//맞는 사람의 hp를 10 낮추고 나의 체력을 5 회복하고 싶다.
		//결과를 출력하자. (나의 체력: XX, 상대의 체력: XX)
		target.hp -= 10; //target.hp = target.hp - 10;
		this.hp += 5;
		System.out.printf("나의 체력: %d, 상대방 체력: %d\n"
				, this.hp, target.hp);
		
	}
		
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
		System.out.println("이 메서드를 호출한 객체의 이름: " + this.name);
	}
	
}









