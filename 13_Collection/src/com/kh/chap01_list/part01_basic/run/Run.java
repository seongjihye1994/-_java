package com.kh.chap01_list.part01_basic.run;

import com.kh.chap01_list.part01_basic.controller.ArrayListTest;
import com.kh.chap01_list.part01_basic.controller.ObjectArrayTest;
import com.kh.chap01_list.part01_basic.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
//		ObjectArrayTest at = new ObjectArrayTest();
		ArrayListTest at = new ArrayListTest();
		
		System.out.println("학생 3명 추가");
		at.addStudent(new Student("우별림", 100));
		at.addStudent(new Student("성지혜", 50));
		at.addStudent(new Student("김영히", 60));
		
		
		// 학생 출력
		at.printStudent();
		
		System.out.println("학생 한 명 더 추가");
		at.addStudent(new Student("홍길동", 80));

		// 추가 후 학생 출력
		at.printStudent();
		
		System.out.println("1번 인덱스 학생 제거");
		at.removeStudent(1); // 1번 학생 인덱스 제거
		
		// 제거 후 학생 출력
		at.printStudent();
		
	}

}
