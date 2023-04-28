package kr.co.exam08.ex01;

public class Exam02 {
	/*
	 * throws 를 사용하면 예외가 발생 했을 때 해당 예외를 자신을 호출한 메서드로 위임하게 된다.
	 */
	public static void methodA()  throws NullPointerException{
		// methodA() 를 호출한 위치로 예외 위임.
			methodB();
	}
	
	public static void methodB() throws NullPointerException {
		// methodB() 호출한 위치로 예외 위임.
		String s = null;
		System.out.println(s.charAt(0)); // NullPointerException 발생 위치
	}
	
	public static void main(String[] args){
		// methodA(); 
		// 최종적으로 메인에서도 예외발생 처리를 하지 않으면 에러발생 됨.
		
		/*
		 * 예외가 발생하는 경우 어느 위치에서든 반드시 예외처리가 이루어져야 
		 * 프로그램의 비정상 종료가 발생하지 않는다.
		 */
		
		try{
			methodA();
		}catch(NullPointerException e) {
			System.out.println("methodA 에서 발생한 예외 처리");
			e.printStackTrace(); 
		// 정해진 예외처리가 없어서 애매할 때 e.printStackTrace() 출력하게 해서 다음 작업으로 진행되게 함.
		}
		System.out.println("나머지 작업 진행");
	}
}
