package kr.co.exam13.ex03.member.controller;
 
import kr.co.exam13.ex03.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[10];
	public int size = 0; 
	
	public int existMemberNum() {
		return size;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i < this.m.length; i++) {
			Member m = this.m[i];
			if(m != null && m.isExists(inputId)) {
			return true;
			}
		}
		return false;
	}
	
	private int findIndex(String inputId) {
		for(int i = 0; i < size; i++) {
			Member m = this.m[i];
			if(m.isExists(inputId)) {
				return i;
			} 
		}
		return -1;
		
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		if(checkId(id) == false) {
			if(size < 10) {
				this.m[size] = new Member();
				this.m[size].setId(id);
				this.m[size].setName(name);
				this.m[size].setPassword(password);
				this.m[size].setEmail(email);
				this.m[size].setGender(gender);
				this.m[size].setAge(age);
				size++;
			}
		}
	}
	
	public String searchId(String id) {
		int idx = this.findIndex(id);
		
		String result = null;
		if(idx != -1) {
			result = "아이디 : " + this.m[idx].getId() + " | " + "이름 : "+ this.m[idx].getName() + " | " + "비밀번호 : " +  this.m[idx].getPassword() + " | " + "이메일 : " +  this.m[idx].getEmail() + " | "  + "성별 : "+ this.m[idx].getGender() + " | " + "나이 : "  + this.m[idx].getAge();
		}
		return result;
	}
	
	public String searchName(String name) {
		String result = null;
		for(int i = 0; i < size; i++) {
			Member m = this.m[i];
			if(m.getName().equals(name)) {
				result = "아이디 : " + this.m[i].getId() + " | " + "이름 : "+ this.m[i].getName() + " | " + "비밀번호 : " +  this.m[i].getPassword() + " | " + "이메일 : " +  this.m[i].getEmail() + " | "  + "성별 : "+ this.m[i].getGender() + " | " + "나이 : "  + this.m[i].getAge();
			} 
		}
		return result;
	}
	
	public String searchEmail(String email) {
		String result = null;
		for(int i = 0; i < size; i++) {
			Member m = this.m[i];
			if(m.getEmail().equals(email)) {
				result = "아이디 : " + this.m[i].getId() + " | " + "이름 : "+ this.m[i].getName() + " | " + "비밀번호 : " +  this.m[i].getPassword() + " | " + "이메일 : " +  this.m[i].getEmail() + " | "  + "성별 : "+ this.m[i].getGender() + " | " + "나이 : "  + this.m[i].getAge();
			} 
		}
		return result;
	}
	
	public boolean updatePassword(String id, String password) {
		int idx = this.findIndex(id);
		if(idx != -1) {
			Member m = this.m[idx];
			m.setPassword(password);
			return true;
		}
		return false;
		
	}
	
	public boolean updateName(String id, String name) {
		int idx = this.findIndex(id);
		if(idx != -1) {
			Member m = this.m[idx];
			m.setName(name);
			return true;
		}
		return false;
		
	}
	
	public boolean updateEmail(String id, String email) {
		int idx = this.findIndex(id);
		if(idx != -1) {
			Member m = this.m[idx];
			m.setEmail(email);
			return true;
		}
		return false;
		
	}
	
	public boolean delete(String id) {
		int idx = this.findIndex(id);
		if(idx != -1) {
			for(int i = idx; i < size; i++) {
				this.m[i] = this.m[i + 1];
				size--;
			}
			return true;
		}
		return false;
	}
	
	public void delete() {
		m = new Member[10];
		size = 0;
	}
	
	public Member[] printAll() {
		Member[] result = new Member[size];
		for(int i = 0; i < size; i++) { 
			result[i] = new Member();
			result[i].setId(m[i].getId());
			result[i].setName(m[i].getName());
			result[i].setPassword(m[i].getPassword());
			result[i].setEmail(m[i].getEmail());
			result[i].setGender(m[i].getGender());
			result[i].setAge(m[i].getAge());
		}
		return result;
	}
}
