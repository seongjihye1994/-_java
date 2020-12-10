package com.kh.chap01_list.part01_basic.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Student;

public class ArrayListTest {
	
	// ArrayList�� ����ϴ� ���
	private ArrayList list = new ArrayList();

	public void addStudent(Student student) {
		list.add(student);
	}

	public void printStudent() {
		for (int i = 0; i < list.size(); i++) { // list.size() -> list�� ��� ������ ���� ����
			System.out.println(list.get(i));	// list.get() -> ���� ���� �ε��� ��ġ�� ������ ����
		}
		
	}

	public void removeStudent(int i) {
		list.remove(i);
		
	}
	

}
