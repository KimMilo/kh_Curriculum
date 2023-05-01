package kr.co.exam06.ex02;
 
public class Staff extends Intern {
	public Staff() {
		role = "사원";
	}
	public Staff(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}
	
	public void research() {
		String message = String.format("%s %s이(가) 자료를 조사합니다.", role, getName());
		System.out.println(message);
	}
	public void document() {
		String message = String.format("%s %s이(가) 문서를 작성합니다.", role, getName());
		System.out.println(message);
	}
	public void care() {
		String message = String.format("%s %s이(가) 인턴을 관리합니다.", role, getName());
		System.out.println(message);
	}
	@Override
	public Employee elevate() {
		return new Senior(getName(), getAge());
	}
	@Override
	public Employee degrement() {
		return new Intern(getName(), getAge());
	}
}	
