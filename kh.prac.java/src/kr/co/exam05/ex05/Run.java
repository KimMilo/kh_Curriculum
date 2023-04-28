package kr.co.exam05.ex05;

public class Run {
	public static void main(String[] args) {
		
		FoodMenu fd = new FoodMenu();
		
		fd.addMenu("라면", 2000);
		fd.addMenu("김밥", 3000);
		fd.addMenu("돈까스", 4000);
		
		System.out.println("==전체 메뉴==");
		System.out.println(fd.printMenu());
		
		System.out.println("==가격 수정==");
		System.out.print("라면 가격은 : ");
		System.out.println(fd.findMenu("라면"));
		fd.update("라면", 4500);
		System.out.print("수정된 라면 가격은 : ");
		System.out.println(fd.findMenu("라면"));
		System.out.println();
		
		fd.removeMenu("라면");
		System.out.println("==메뉴 제외==");
		System.out.println("메뉴에서 라면 제외");
		System.out.println(fd.printMenu());
	}
}
