package kr.co.exam13.ex01.person.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name= " + super.getName() + ", age= " + super.getAge() + ", height= " + super.getHeight() + ", weight= "  + super.getWeight() + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
	
}
