package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

// 이름 오름차순 정렬
public class AscName implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
//		return o1.getName() - o2.getName(); // 문법적으로 불가능 (str - str x)
		// String 클래스에서 제공하는 compareTo() -> 사전순으로 앞이 크면 1, 같으면 0, 뒤가 크면 -1 반환
		return o1.getName().compareTo(o2.getName());
	}

}
