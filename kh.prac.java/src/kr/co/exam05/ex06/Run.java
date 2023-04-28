package kr.co.exam05.ex06;

import java.util.Arrays;

public class Run {
public static void main(String[] args) {
				
		System.out.println("인스턴스 객체 정보 1");
		Student s = new Student("홍길동");
		System.out.println(s.toString());
		
		System.out.println("인스턴스 객체 정보 2");
		Student s2 = new Student("홍길동");
		System.out.println(s2.toString());
		
		System.out.println("==============");		
		String table = s.getGradeTable();
		System.out.print(table);
		
		double score = s.getScore("국어");
		System.out.println(score);
		
		s.addSubject("과학", 76.5);
		table = s.getGradeTable();
		System.out.print(table);
		
		System.out.println("=============");
		s.addSubject("체육", 80.34);
		s.addSubject("국어", 79.6);
		s.addSubject("수학", 76.5);
		s.addSubject(new Subject("영어", 67.68));
		table = s.getGradeTable();
		System.out.print(table);
	
		System.out.println("==============");
		s.updateSubject("과학", 95.85);
		table = s.getGradeTable();
		System.out.print(table);
	
		System.out.println("==============");
		s.removeSubject("수학");
		table = s.getGradeTable();
		System.out.print(table);
		
		System.out.println("****************");
		Subject s3= s.getSubject("영어");
		System.out.print(s3.getName() + "\t");
		System.out.print(s3.getScore() + "\t");
		System.out.print(s3.getGrade() + "\t\n");
		
		System.out.println("!!!!!!!!!!!!!!!!2");
		Subject arr[] = s.getSubjects("영어", "국어", "수학", "과학");
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^");
		
		Subject s4 = new Subject("우주", 99.99);
		s.addSubject(s4);
		System.out.println(s.getGradeTable());
		
		System.out.println("^%^%^%^%^%^%^%^%^%^%^%^");
		Subject s5 = new Subject("우주",77.77);
		s.updateSubject(s5);
		System.out.println(s.getGradeTable());
		
		System.out.println("^%^%^%^%^%^%^%^%^%^%^%^");
		Subject s6 = new Subject("우주");
		s.removeSubject(s6);
		System.out.println(s.getGradeTable());
		
		System.out.println("^%^%^%^%^%^%^%^%^%^%^%^");
		Subject s7 = new Subject("우주");
		String finds[] = {"과학","체육"};
	}
}
