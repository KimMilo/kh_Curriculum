package kr.co.exam13.ex01.person.controller;

import kr.co.exam13.ex01.person.model.vo.Employee;
import kr.co.exam13.ex01.person.model.vo.Student;

public class PersonController { 
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	public int studentCnt = 0;
	public int employeeCnt = 0;
	
	public int[] personCount() {
		int[] count = new int[2];
		
		count[0] = studentCnt;
		count[1] = employeeCnt;
		
		return count;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		if(studentCnt < 3) {
			this.s[studentCnt] = new Student();
			this.s[studentCnt].setName(name);
			this.s[studentCnt].setAge(age);
			this.s[studentCnt].setHeight(height);
			this.s[studentCnt].setWeight(weight);
			this.s[studentCnt].setGrade(grade);
			this.s[studentCnt].setMajor(major);
			studentCnt++;
		}
	}
	
	public Student[] printStudent() {
		Student[] result = new Student[studentCnt];
		for(int i = 0; i < studentCnt; i++) {
			result[i] = new Student();
			result[i].setName(s[i].getName());
			result[i].setAge(s[i].getAge());
			result[i].setHeight(s[i].getHeight());
			result[i].setWeight(s[i].getWeight());
			result[i].setGrade(s[i].getGrade());
			result[i].setMajor(s[i].getMajor());
		}
		return result;		
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		if(employeeCnt < 10) {
			this.e[employeeCnt] = new Employee();
			this.e[employeeCnt].setName(name);
			this.e[employeeCnt].setAge(age);
			this.e[employeeCnt].setHeight(height);
			this.e[employeeCnt].setWeight(weight);
			this.e[employeeCnt].setSalary(salary);
			this.e[employeeCnt].setDept(dept);
			employeeCnt++;
		}
	}
	
	public Employee[] printEmployee() {
		Employee[] result = new Employee[employeeCnt];
		for(int i = 0; i < employeeCnt; i++) {
			result[i] = new Employee();
			result[i].setName(e[i].getName());
			result[i].setAge(e[i].getAge());
			result[i].setHeight(e[i].getHeight());
			result[i].setWeight(e[i].getWeight());
			result[i].setSalary(e[i].getSalary());
			result[i].setDept(e[i].getDept());
		}
		return result;
	}
}
