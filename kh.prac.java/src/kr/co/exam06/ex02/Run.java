package kr.co.exam06.ex02;

public class Run {
	public static void main(String[] args) {
	/*
	 * 직원을 관리하기 위한 프로그램을 만들기 위해 다음의 객체 정보가 필요하다.
	 * 		- 인턴 : 출근하여 하는 일은 서류정리 및 자료복사 이다.
	 * 		- 사원 : 출근하여 하는 일은 자료조사, 문서작성, 인턴관리 이다.
	 * 		- 대리 : 출근하여 하는 일은 자료조사, 문서작성, 업체와의 통화, 사원이 작성한 문서검토 이다.
	 * 		- 과장 : 출근하여 하는 일은 업체미팅, 외부출장 이다.
	 * 
	 * 모든 객체는 이름, 나이 정보를 가지고 있으며, 각 객체마다 기본적으로 출근 및 퇴근, 점심, 야근을
	 * 수행한다.
	 * 
	 * 위 관계를 파악하여 클래스의 상속, 오버로딩, 오버라이딩, 다형성을 활용해본다.
	 */
		System.out.println("======= 전체 직원 =======");
		Employee e1 = new Intern("홍길동", 24);
		Employee e2 = new Staff("박수원", 27);
		Employee e3 = new Senior("최정원", 30);
		Employee e4 = new Manager("박고현", 35);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println("------------------------------");
		
		Employee emps[] = new Employee[4];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;
		emps[3] = e4;
		
		System.out.println("======== 직원별 하는 일 ========");
		for(int i = 0; i < emps.length; i++) {
			if(emps[i] instanceof Manager) {
				emps[i].workOn();
				((Manager)emps[i]).call();
				((Manager)emps[i]).meeting();
				emps[i].lunch();
				((Manager)emps[i]).workOut();
				((Manager)emps[i]).call();
				emps[i].night();
				emps[i].workOff();
				System.out.println("------------------------------");
			}else if(emps[i] instanceof Senior) {
				emps[i].workOn();
				((Senior)emps[i]).care();
				((Senior)emps[i]).research();
				((Senior)emps[i]).document();
				emps[i].lunch();
				((Senior)emps[i]).call();
				emps[i].night();
				emps[i].workOff();
				System.out.println("------------------------------");
			}else if(emps[i] instanceof Staff) {
				emps[i].workOn();
				((Staff)emps[i]).filing();
				((Staff)emps[i]).fileCopy();
				((Staff)emps[i]).research();
				((Staff)emps[i]).document();
				emps[i].lunch();
				((Staff)emps[i]).care();
				emps[i].night();
				emps[i].workOff();
				System.out.println("------------------------------");
			}else {
				emps[i].workOn();
				((Intern)emps[i]).filing();
				emps[i].lunch();
				((Intern)emps[i]).fileCopy();
				emps[i].night();
				emps[i].workOff();
				System.out.println("------------------------------");
			}
			
		}

		
		// 강등시키기
		System.out.println("========== 사원 강등 시키기 =========");
		System.out.println(e2);
		e2 = ((Staff)e2).degrement();
		System.out.println("=>" + e2);
		
		System.out.println();
		// 진급시키기
		System.out.println("========== 인턴 진급 시키기 =========");
		System.out.println(e1);
		e1 = ((Intern)e1).elevate();
		System.out.println("=>" + e1);
	}
}
