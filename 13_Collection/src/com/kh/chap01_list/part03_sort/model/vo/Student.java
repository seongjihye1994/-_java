package com.kh.chap01_list.part03_sort.model.vo;


public class Student implements Comparable <Student> {
	
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		// this vs o
		// 등수 -> 점수 내림차순
		// 비교 대상의 점수 - 나의 점수
		
		return o.getScore() - score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	
	

}
