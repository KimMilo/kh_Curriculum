package kr.co.exam12.ex01;

public class Run {
	public static void main(String[] args) {
		Subject subject = new Subject("수학", 97.6);
		
		System.out.println(subject.getGrade());
	}
}
