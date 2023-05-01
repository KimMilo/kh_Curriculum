package kr.co.exam08.ex03;
 
public class Run {
	public static void main(String[] args) throws UserException {
		/*
		 * 사용자 정의 예외
		 * 		Exception 클래스를 상속 받아 자신만의 예외클래스를 만드는 것
		 */
		
		Member m = new Member(null);
		// 최종적으로 UserException으로 위임함. --> Member에서 처리해줌
		
		
		m.setName(null); // 에러발생
		//m.setName("Hello"); // 출력됨. 
		
		System.out.println(m.getName());
	}
}
