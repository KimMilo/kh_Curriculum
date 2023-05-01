package kr.co.exam08.ex03;
 
public class Member {
private String name;
	
	public Member() {}
	
	public Member(String name){ //에러 처리 해줌
		try {
			this.setName(name);
		}catch(UserException e) {
			this.name = ""; 
		}
	}
	
	public void setName(String name) throws UserException {
		if(name != null) {
			this.name = name;
		}else {
			throw new UserException("잘못된 사용자 이름"); 
			// throw new : 강제로 에러 발생시키는 것
			// "잘못된 사용자 이름" : 에러 네이밍을 하는 것
		}
	}
	
	public String getName() {
		return this.name;
	}

}
