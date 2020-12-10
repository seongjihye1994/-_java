package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscScore implements Comparator <Student> {

	@Override // �������� o1 - o2
	public int compare(Student o1, Student o2) {
		return o1.getScore() - o2.getScore();
	}

	// ���� ���Ͽ� ������������ ����
//	@Override
//	public int compare(Object o1, Object o2) {
//		// o1 (����) vs o2 (������)
//		int standard = ((Student)o1).getScore(); // Object Ŭ������ �ڽ� Ŭ������ �ٿ�ĳ���� �ؾ� getScore()�� ����� �� ����
//		int object = ((Student)o2).getScore(); 
//		
		
//		if (standard > object) {
//			return 1; // ������ ũ�� ����� return -> ���� ����
//		} else if (standard == object) {
//			return 0; // ���ʰ� �������� ���� ������ 0�� return
//		} else {
//			return -1; // �������� ũ�� ������ return -> ���� ���� x
//		}
		
//		return standard - object;
//	}

}
