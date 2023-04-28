package kr.co.exam05.ex06;

import java.util.Arrays;

public class Student {
	public Subject subjects[];
	public String name;
	public int year;
	private int room;
	
	public Student(String name) {
		this.subjects = new Subject[0];
		this.name = name;		
	}
	
	public Student(String name, int year) {
		this(name);
		this.year = year;
	}
		
	public Student(String name, int year, int room) {
		this(name, year);
		this.year = year;
		this.room = room;
	}
	public String getGradeTable() {
		String result = "";
		for(int i = 0; i < this.subjects.length; i++) {
			Subject s = this.subjects[i];
			result += String.format("%s\t%.2f\n", 
					s.getName(), s.getScore());
		}
		return result;
	}
	private boolean isDuplicate(String subjectName) {
		return this.findIndex(subjectName) == -1 ? false : true;
	}
	private int findIndex(String subjectName) {
		for(int i = 0; i < this.subjects.length; i++) {
			Subject s = this.subjects[i];
			if(s.isExists(subjectName)) {
				return i;
			}
		}
		return -1;
		
	}
	
	public Subject getSubject(String subjectName) {
		Subject result = null;
		int idx = this.findIndex(subjectName);
		
		if(idx >= 0) {
			result = this.subjects[idx];
		}
			
		return result;
	}
	
	public Subject[] getSubjects(String...subjectNames) {
		Subject results[] = new Subject[0];
		for(int i = 0; i < subjectNames.length; i++) {
			Subject subject = this.getSubject(subjectNames[i]);
			if(subject != null) {
				results = Arrays.copyOf(results, results.length + 1);
				results[results.length - 1] = subject;
			}
		}
		return results;
	}
	
	public double getScore(String subjectName) {
		Subject result = this.getSubject(subjectName);
		
		return result != null ? result.getScore() : -1;
	}

	public void addSubject(String subjectName) {
		this.addSubject(subjectName, 0);
		
	}
	public void addSubject(String subjectName, int score) {
		this.addSubject(subjectName, (double)score);
	}
	// 객체타입 오버로딩
	public void addSubject(Subject subject) {
		this.addSubject(subject.getName(), subject.getScore());
		
	}

	public void addSubject(String subjectName, double score) {
		if(!this.isDuplicate(subjectName)) {
			int len = this.subjects.length;
			this.subjects = Arrays.copyOf(this.subjects, len + 1);
			this.subjects[len] = new Subject(subjectName, score);
		}
	}
	
	// updateSubject를 Subject 객체를 매개변수로 사용하여 기존과 동일하게 동작하는
	// 메서드로 오버로딩 하여 구현하기
	
	public void updateSubject(Subject subject) {
		this.updateSubject(subject.getName(), subject.getScore());
	}
	
	public void updateSubject(String subjectName, double score) {
		int idx = this.findIndex(subjectName);
		if(idx >= 0) {
			Subject s = this.subjects[idx];
			s.setScore(score);
		}
	}
	
	// removeSubject 를 Subject 객체를 매개변수로 사용하여 기존과 동일하게 동작하는
	// 메서드로 오버로딩 하여 구현하기
	// 여러개의 성적 정보를 삭제할 수 있게도 하세요.
	
	public void removeSubject(Subject subject) {
		this.removeSubject(subject.getName());
	}

	public void removeSubject(String subjectName) {
		int idx = this.findIndex(subjectName);
		if(idx >= 0) {
			for(int i = idx; i < this.subjects.length - 1; i++) {
				this.subjects[i] = this.subjects[i + 1];
			}
			this.subjects = Arrays.copyOf(this.subjects, this.subjects.length -1);
		}
	}
}
