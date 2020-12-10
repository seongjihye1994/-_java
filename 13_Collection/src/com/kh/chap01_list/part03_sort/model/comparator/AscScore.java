package com.kh.chap01_list.part03_sort.model.comparator;

import java.util.Comparator;

import com.kh.chap01_list.part03_sort.model.vo.Student;

public class AscScore implements Comparator <Student> {

	@Override // 오름차순 o1 - o2
	public int compare(Student o1, Student o2) {
		return o1.getScore() - o2.getScore();
	}

	// 점수 비교하여 오름차순으로 정렬
//	@Override
//	public int compare(Object o1, Object o2) {
//		// o1 (왼쪽) vs o2 (오른쪽)
//		int standard = ((Student)o1).getScore(); // Object 클래스를 자식 클래스로 다운캐스팅 해야 getScore()를 사용할 수 있음
//		int object = ((Student)o2).getScore(); 
//		
		
//		if (standard > object) {
//			return 1; // 왼쪽이 크면 양수를 return -> 순서 변경
//		} else if (standard == object) {
//			return 0; // 왼쪽과 오른쪽의 값이 같으면 0을 return
//		} else {
//			return -1; // 오른쪽이 크면 음수를 return -> 순서 변경 x
//		}
		
//		return standard - object;
//	}

}
