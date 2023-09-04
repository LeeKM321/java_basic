package oop.inter.good;

public class Join implements IUserService {

	@Override
	public void execute() {
		System.out.println("회원 가입 로직이 실행됩니다.");
		System.out.println("DB 접속도 하고, 입력값도 가져 오고, 값을 집어 넣고 등등등....");
	}

}
