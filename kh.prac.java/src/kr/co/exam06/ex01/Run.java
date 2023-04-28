package kr.co.exam06.ex01;

public class Run {
	public static void main(String[] args) {
		/*
		 * 도형 클래스를 상속하는 삼각형, 사각형 클래스를 작성
		 * 
		 * 삼각형, 사각형 클래스에는 다음의 멤버 변수와 메서드가 필요하다.
		 * 		- 삼각형(Triangle)
		 * 			멤버 변수 : 가로길이, 세로길이
		 * 			멤버 메서드 : 넓이구하기
		 *		- 사각형(Square)
		 *			멤버 변수 : 가로길이, 세로길이
		 *			멤버 메서드 : 넓이구하기 
		 *
		 */	
		
		Triangle t1 = new Triangle();
		t1.setWidth(10);
		t1.setHeight(10);	
		System.out.println("Shape 상속 삼각형 면적 출력");
		System.out.println(t1.getArea());
		
		Square s1 = new Square();
		s1.setWidth(10);
		s1.setHeight(10);		
		System.out.println("Shape 상속 사각형 면적 출력");
		System.out.println(s1.getArea());
	}
}
