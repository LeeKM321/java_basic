package oop.inter.good;

public class Login implements IUserService {

	@Override
	public void execute() {
		System.out.println("사용자가 입력한 id, pw를 받고, 데이터 베이스와의 비교 등등등....");
	}

}
