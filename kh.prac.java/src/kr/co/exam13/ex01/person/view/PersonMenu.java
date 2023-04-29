package kr.co.exam13.ex01.person.view;

import java.util.Scanner;

import kr.co.exam13.ex01.person.controller.PersonController;
import kr.co.exam13.ex01.person.model.vo.Employee;
import kr.co.exam13.ex01.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + " 명 입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + " 명 입니다.");
		
		System.out.println();
		
		while(true) {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int menuNumber = sc.nextInt(); sc.nextLine();
			
			switch(menuNumber) {
				case 1:
					studentMenu(); break;
				case 2:
					employeeMenu(); break;
				case 9:
					System.out.println("종료합니다.");
					System.exit(0);
					sc.close();
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void studentMenu() {
		while(true) {
			System.out.println();
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			
			if(pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찾기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			
			System.out.print("메뉴 번호 : ");
			int menuNumber = sc.nextInt(); sc.nextLine();
			
			if(menuNumber == 1) {
				if(pc.personCount()[0] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}else {
					System.out.println();
					insertStudent();
				}
			} else if(menuNumber == 2) {
				System.out.println();
				printStudent();
			} else if(menuNumber == 9) {
				System.out.println("메인으로 돌아갑니다.");
				System.out.println();
				mainMenu();
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void employeeMenu() {
		while(true) {
			System.out.println();
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			
			if(pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			
			System.out.print("메뉴 번호 : ");
			int menuNumber = sc.nextInt(); sc.nextLine();
			
			if(menuNumber == 1) {
				if(pc.personCount()[1] == 10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					System.out.println();
					insertEmployee();
				}
			} else if(menuNumber == 2) {
				System.out.println();
				printEmployee();
			} else if(menuNumber == 9) {
				System.out.println("메인으로 돌아갑니다.");
				System.out.println();
				mainMenu();
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertStudent() {
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt(); sc.nextLine();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble(); sc.nextLine();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble(); sc.nextLine();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt(); sc.nextLine();
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.personCount()[0] < 3) {
				System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요.");
				String choice = sc.nextLine();
				if(!(choice.equalsIgnoreCase("n"))) {
					continue;
				} else {
					break;
				}
			} else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}
		}
	}
	
	public void printStudent() {
		Student[] result = pc.printStudent();
		
		if(result.length == 0) {
			System.out.println("저장된 학생이 없습니다.");
		} else {
			for(Student s: result) {
				System.out.println("이름 : " + s.getName() + " | " + "나이 : " + s.getAge() + " | " + "키 : " + s.getHeight() + " | " 
								+ "몸무게 : " + s.getWeight() + " | " + "학년 : " + s.getGrade() + " | " + "전공 : " + s.getMajor());
			}
		}
	}
	
	public void insertEmployee() {
		while(true) {
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt(); sc.nextLine();
			System.out.print("사원 키 : ");
			double height = sc.nextDouble(); sc.nextLine();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble(); sc.nextLine();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt(); sc.nextLine();
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.personCount()[1] < 10) {
				System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요.");
				String choice = sc.nextLine();
				if(!(choice.equalsIgnoreCase("n"))) {
					continue;
				} else {
					break;
				}
			} else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}
		}
	}
	
	public void printEmployee() {
		Employee[] result = pc.printEmployee();
		
		if(result.length == 0) {
			System.out.println("저장된 사원이 없습니다.");
		} else {
			for(Employee e: result) {
				System.out.println("이름 : " + e.getName() + "나이 : " + e.getAge() + "키 : " + e.getHeight() 
								+ "몸무게 : " + e.getWeight() + "연봉 : " + e.getSalary() + "부서 : " + e.getDept());
			}
		}
	}
	
}
