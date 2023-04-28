package kr.co.exam08.ex01;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * Exception
		 * 		- NullPointerException
		 * 		try - catch : 실행하였을 때 발생하는 에러를 체크
		 *      finally : 예외가 발생하든 안하든 무조건 실행
		 */

		String s[] = {"A", "B" , "C", null, "D", "E"};
		
		for(int i = 0; i <= s.length; i++) {
			// ArrayIndexOutOfBounds
			try {
				System.out.println(s[i].charAt(0));
				
			}catch(NullPointerException e) {
				System.out.println(i + "번 위치에 NULL이 있습니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위를 벗어났습니다.");
			}finally {
				System.out.println("예외가 발생하든 안하든 무조건 실행됩니다.");
			}
		}
		
	}
}
