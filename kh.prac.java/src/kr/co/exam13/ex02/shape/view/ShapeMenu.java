package kr.co.exam13.ex02.shape.view;
 
import java.util.Scanner;

import kr.co.exam13.ex02.shape.controller.SquareController;
import kr.co.exam13.ex02.shape.controller.TriangleController;


public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		while(true) {
			String menu = "";
			menu += "===== 도형 프로그램 =====\n";
			menu += "3. 삼각형\n";
			menu += "4. 사각형\n";
			menu += "9. 프로그램 종료\n";
			
			System.out.print(menu);
			System.out.print("메뉴 번호(숫자) : ");
			int menuNumber = sc.nextInt();
			
			switch(menuNumber) {
				case 3:
					triangleMenu(); break;
				case 4:
					squareMenu(); break;
				case 9:
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
					sc.close();
				default:
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void triangleMenu() {
		while(true) {
			String menu = "";
			menu += "===== 삼각형 =====\n";
			menu += "1. 삼각형 면적\n";
			menu += "2. 삼각형 색칠\n";
			menu += "3. 삼각형 정보\n";
			menu += "9. 메인으로\n";
			
			System.out.print(menu);
			System.out.print("메뉴 번호(숫자) : ");
			int menuNumber = sc.nextInt(); sc.nextLine();
			
			switch(menuNumber) {
				case 1:
					inputSize(3, 1); break;
				case 2:
					inputSize(3, 2); break;
				case 3:
					printInformation(3); break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					inputMenu();
					break;
				default:
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	public void squareMenu() {
		while(true) {
			String menu = "";
			menu += "===== 사각형 =====\n";
			menu += "1. 사각형 둘레\n";
			menu += "2. 사각형 면적\n";
			menu += "3. 사각형 색칠\n";
			menu += "4. 사각형 정보\n";
			menu += "9. 메인으로\n";
			
			System.out.print(menu);
			System.out.print("메뉴 번호(숫자) : ");
			int menuNumber = sc.nextInt(); sc.nextLine();
			
			switch(menuNumber) {
				case 1:
					inputSize(4, 1); break;
				case 2:
					inputSize(4, 2); break;
				case 3:
					inputSize(4, 3); break;
				case 4:
					printInformation(4); break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					inputMenu();
					break;
				default:
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		double height, width;
		String color;
		if(type == 3) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
			} else if(menuNum == 2) {
				System.out.print("색깔을 입력하세요 : ");
				color = sc.nextLine();
				System.out.println("색이 수정되었습니다.");
				tc.paintColor(color);
			}
		} else if(type == 4) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
			} else if(menuNum == 2) {
				System.out.print("높이 : ");
				height = sc.nextDouble();
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.println("사각형 면적 : " + scr.calcArea(height, width));
			} else if(menuNum == 3) {
				System.out.print("색깔을 입력하세요 : ");
				color = sc.nextLine();				
				System.out.println("색이 수정되었습니다.");
				scr.paintColor(color);
				
			}
		}
	}
	
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		} else if(type == 4) {
			System.out.println(scr.print());
		}
	}
	
}
