package etc.exception.custom;

public class LoginUser {
	
	String userAccount; //계정명
	String userPassword; //가입시 설정한 패스워드 
	
	//객체가 생성될 때 계정과 패스워드가 지정됨.
	public LoginUser(String userAccount, String userPassword) {
		super();
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}
	
	//로그인 검증
	public String loginValidate(String inputAccount, String inputPassword) 
			throws LoginValidateException {
		
		//계정명이 일치하는가?
		if(userAccount.equals(inputAccount)) {
			//패스워드가 일치하는가?
			if(userPassword.equals(inputPassword)) {
				// 로그인 성공
				return "SUCCESS";
			} else {
				//패스워드가 틀림
				throw new LoginValidateException("비밀번호 똑바로 치세요!");
			}
		} else {
			//계정 정보가 틀림
			throw new LoginValidateException("회원가입부터 하세요!");
		}
	}
	
	

}









