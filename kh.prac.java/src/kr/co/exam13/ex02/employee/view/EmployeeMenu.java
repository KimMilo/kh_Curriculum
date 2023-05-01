package kr.co.exam13.ex02.employee.view;
 
import java.util.Scanner;

import kr.co.exam13.ex02.employee.controller.EmployeeController;
import kr.co.exam13.ex02.employee.model.vo.Employee;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public void EmployeeMenu() {
		Employee e = new Employee();
		if(e.getEmpNo() == 0) {
			ec.remove();
		}
		while(true) {
			String menu = "";
			menu += "1. 사원 추가\n";
			menu += "2. 사원 수정\n";
			menu += "3. 사원 삭제\n";
			menu += "4. 사원 출력\n";
			menu += "9. 프로그램 종료";
			System.out.println(menu);
			
			System.out.print("메뉴 번호(숫자)를 누르세요 : ");
			int menuNumber = sc.nextInt(); sc.nextLine();
			
			switch(menuNumber){
				case 1:
					insertEmp(); break;
				case 2:
					updateEmp(); break;
				case 3:
					deleteEmp(); break;
				case 4:
					printEmp(); break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					sc.close();
				default:
					System.out.println("잘못된 번호입니다. 재입력 해주세요.");
			}
		}
	}
	
	public void insertEmp() {
		
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt(); sc.nextLine();
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		System.out.print("추가 정보를 더 입력하시겠습니다.?(y/n) : ");
		String addInfo = sc.nextLine();
		
		if(addInfo.equalsIgnoreCase("y")) {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.println("보너스 율 : ");
			double bonus = sc.nextDouble();
			
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
			
		} else if(addInfo.equalsIgnoreCase("n")) {
			ec.add(empNo, name, gender, phone);
		}		
	}
	
	public void updateEmp() {
		if(ec.inform() == null) {
			System.out.println("사원데이터가 없습니다.");
			EmployeeMenu();
		}
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		
		String menu = "";
		menu += "1. 전화번호\n";
		menu += "2. 사원 연봉\n";
		menu += "3. 보너스 율\n";
		menu += "9. 돌아가기";
		
		System.out.println(menu);
		System.out.print("메뉴 번호를 누르세요 : ");
		int menuNumber = sc.nextInt(); sc.nextLine();
		
		switch(menuNumber) {
		case 1:
			System.out.print("수정할 전화번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;
		case 2:
			System.out.print("수정할 사원 연봉 : ");
			int salary = sc.nextInt(); sc.nextLine();
			ec.modify(salary);
			break;
		case 3:
			System.out.print("수정할 보너스 율 : ");
			double bonus = sc.nextDouble(); sc.nextLine();
			ec.modify(bonus);
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String choice = sc.nextLine();
				
		if(choice.equalsIgnoreCase("y")){
			if(ec.inform() == null) {
			System.out.println("사원데이터가 없습니다.(실패)");
			} else if (ec.inform() != null){
				ec.remove();
				System.out.println("삭제되었습니다.(성공)");
			}
			
		}else if(choice.equalsIgnoreCase("n")){
			System.out.println("메인메뉴로 돌아갑니다.");
		}else {
			System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			deleteEmp();
		}
	}

	
	public void printEmp() {
		if(ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		} else {
			System.out.println(ec.inform());						
		}
	}
	
}
