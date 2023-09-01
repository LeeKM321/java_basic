package oop.abs.bad;

//쥬스 프랜차이즈 본사
public class HeadStore {
	
	// 상속을 받는 클래스들에게 오버라이딩을 권유 (강제 x)
	public void orderApple() {
		System.out.println("기본가격은 0원입니다. 가게에서 가격을 수정해서 적용하세요.");
	}

	public void orderBanana() {
		System.out.println("기본가격은 0원입니다. 가게에서 가격을 수정해서 적용하세요.");
	}

	public void orderGrape() {
		System.out.println("기본가격은 0원입니다. 가게에서 가격을 수정해서 적용하세요.");
	}

}
