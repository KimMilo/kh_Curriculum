package kr.co.exam13.ex03.member.view;
 
import java.util.Scanner;

import kr.co.exam13.ex03.member.controller.MemberController;
import kr.co.exam13.ex03.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		System.out.println("최대 등록 가능한 회원 수는 10명 입니다.");
		System.out.println("현재 등록 가능한 회원 수는 " + (10 - mc.existMemberNum()) + "명 입니다.");
		System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + " 입니다.");
		
		while(true) {
			int menuNumber = 0;
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				
				System.out.print("메뉴 번호 : ");
				menuNumber = sc.nextInt(); sc.nextLine();
			} else {
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				
				System.out.print("메뉴 번호 : ");
				menuNumber = sc.nextInt(); sc.nextLine();
			}
			
			switch(menuNumber) {
			case 1:
				insertMember(); break;
			case 2:
				searchMember(); break;
			case 3:
				updateMember(); break;
			case 4:
				deleteMember(); break;
			case 5:
				printAll(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				sc.close();
			default:
				System.out.println("없는 번호입니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void insertMember() {
		String id, name, password, email;
		char gender;
		int age;
		
		while(true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			if(mc.checkId(id) == true) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			}else {
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("비밀번호 : ");
				password = sc.nextLine();
				System.out.print("이메일 : ");
				email = sc.nextLine();

				while(true) {
					System.out.print("성별 : ");
					String genderStr = sc.nextLine();
					
					if(genderStr.equalsIgnoreCase("m") || genderStr.equalsIgnoreCase("f")) {
						gender = genderStr.charAt(0);
						System.out.print("나이 : ");
						age = sc.nextInt(); sc.nextLine();
						break;
					} else {
						System.out.println("성별을 m 또는 f로 다시 입력해주세요.");	
					}
				}
				mc.insertMember(id, name, password, email, gender, age);	
				mainMenu();
				break;
			}
		}
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int menuNumber = sc.nextInt(); sc.nextLine();
		
		switch(menuNumber) {
			case 1:
				searchId(); break;
			case 2:
				searchName(); break;
			case 3:
				searchEmail(); break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu(); break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				mainMenu();	
		}
		
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 입력 : ");
		String id = sc.nextLine();
		
		String result = mc.searchId(id);
		if(result != null) {
			System.out.println(mc.searchId(id));
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		String result = mc.searchName(name);
		if(result != null) {
			System.out.println(mc.searchName(name));
		} else {
			System.out.println("검색 결과가 없어요.");
		}
		
	}
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();
		
		String result = mc.searchEmail(email);
		if(result != null) {
			System.out.println(mc.searchEmail(email));
		} else {
			System.out.println("검색 결과가 없어요.");
		}
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int menuNumber = sc.nextInt(); sc.nextLine();
		
		switch(menuNumber) {
			case 1:
				updatePassword(); break;
			case 2:
				updateName(); break;
			case 3:
				updateEmail(); break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu(); break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				mainMenu();	
		}
	}
	
	public void updatePassword() {
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("수정할 비밀번호 입력 : ");
		String password = sc.nextLine();
		
		
		boolean result = mc.updatePassword(id, password);
		if(result) {
			System.out.println("수정이 성공적으로 되었습니다.");
			mc.updatePassword(id, password);
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updateName() {
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이름 입력 : ");
		String name = sc.nextLine();
		
		
		boolean result = mc.updateName(id, name);
		if(result) {
			System.out.println("수정이 성공적으로 되었습니다.");
			mc.updateName(id, name);
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updateEmail() {
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 입력 : ");
		String email = sc.nextLine();
		
		
		boolean result = mc.updateEmail(id, email);
		if(result) {
			System.out.println("수정이 성공적으로 되었습니다.");
			mc.updateEmail(id, email);
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int menuNumber = sc.nextInt(); sc.nextLine();
		
		switch(menuNumber) {
			case 1:
				deleteOne(); break;
			case 2:
				deleteAll(); break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu(); break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				mainMenu();	
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제 할 아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("y")) {
			boolean result = mc.delete(id);
			if(result) {
				System.out.println("성공적으로 삭제하였습니다.");			
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
				mainMenu();
			}
		} else if(choice.equalsIgnoreCase("n")){
			mainMenu();
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}
	
	public void deleteAll() {
		System.out.print("정말로 전체 삭제 하시겠습니까?(y/n) : ");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("y")) {
			System.out.println("성공적으로 삭제하였습니다.");
			mc.delete();
			//mainMenu();
		}
	}
	
	public void printAll() {
		Member[] result = mc.printAll();
		
		if(result.length == 0) {
			System.out.println("저장된 회원이 없습니다.");
		}else {
			for(Member m: result) {
				System.out.println("아이디 : " + m.getId() + " | " + "이름 : " + m.getName() + " | " + "비밀번호 : " + m.getPassword() + " | " + "이메일 : " + m.getEmail() + " | " + "성별 : "+ m.getGender() + " | " + "나이 : " + m.getAge());
			}
		}
	}
}
