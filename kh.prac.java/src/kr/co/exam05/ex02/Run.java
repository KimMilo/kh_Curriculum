package kr.co.exam05.ex02;

public class Run {
	public static void main(String[] args) {
		/*
		 * 삼각형, 사각형 클래스를 만들고 각 도형의 넓이와
		 * 둘레를 구할 수 있도록 만드세요.
		 * 
		 * 1. 두 클래스의 생성자는 밑변 정보만 받아서 생성하는 생성자와
		 * 	  밑변과 높이 정보를 받아서 생성하는 생성자로 만드세요.
		 * 
		 * 2. 생성자로 만들어진 삼각형, 사각형 인스턴스는 넓이와 둘레가
		 * 	  바로 초기화 되어 각 멤버필드에 저장될 수 있도록 하세요.
		 * 
		 * 3. getter 메서드만을 만들어서 밑변, 높이, 넓이 , 둘레 정보만
		 *    사용할 수 있도록 하세요.
		 */
		
		System.out.println("밑변 정보만 받은 경우");
		Square s1 = new Square(10);
		System.out.println("[사각형]");
		System.out.println("가로/세로");
		System.out.println(s1.getWidth() + " / " + s1.getHeight());
		System.out.println("둘레/면적");
		System.out.println(s1.getRound() + " / " + s1.getArea());
		
		Triangle t1 = new Triangle(10);
		System.out.println("[삼각형]");
		System.out.println("밑변/높이");
		System.out.println(t1.getWidth() + " / " + t1.getHeight());
		System.out.println("둘레/면적");
		System.out.printf("%.3f / %.1f\n", t1.getRound(), t1.getArea());
		
		System.out.println("============================================");
		System.out.println("밑변과 높이 정보를 받은 경우");
		Square s2 = new Square(10 , 15);
		System.out.println("[사각형]");
		System.out.println("밑변/높이");
		System.out.println(s2.getWidth() + " / " + s2.getHeight());
		System.out.println("둘레/면적");
		System.out.println(s2.getRound() + " / " + s2.getArea());
		
		Triangle t2 = new Triangle(10, 15);
		System.out.println("[사각형]");
		System.out.println("밑변/높이");
		System.out.println(t2.getWidth() + " / " + t2.getHeight());
		System.out.println("둘레/면적");
		System.out.printf("%.3f / %.1f", t2.getRound(), t2.getArea());
	}
}
