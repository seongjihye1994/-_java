package com.kh.chap02_set.part03_treeSet.model.vo;

public class Student implements Comparable<Student> {

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

	// 1. 이름 오름차순
//	@Override
//	public int compareTo(Student o) {
//		return name.compareTo(o.getName());
//	}
	
	// 2. 성적순 -> score 내림차순
	@Override
	public int compareTo(Student o) {
		return o.getScore() - score;
	}
	
	
}
