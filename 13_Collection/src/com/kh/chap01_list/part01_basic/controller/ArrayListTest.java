package com.kh.chap01_list.part01_basic.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ArrayListTest {
	
	// ArrayList를 사용하는 경우
	private ArrayList list = new ArrayList();

	public void addStudent(Student student) {
		list.add(student);
	}

	public void printStudent() {
		for (int i = 0; i < list.size(); i++) { // list.size() -> list에 담긴 데이터 개수 리턴
			System.out.println(list.get(i));	// list.get() -> 전달 받은 인덱스 위치의 데이터 리턴
		}
		
	}

	public void removeStudent(int i) {
		list.remove(i);
		
	}
	

}
