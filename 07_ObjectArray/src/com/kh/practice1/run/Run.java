package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.model.vo.Student;

public class Run {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Student[] students = new Student[10];
		int count = 0;
		int sum = 0;
		int idx = 0;
		
		while(true) {
			if (count < students.length) {
				System.out.println("=== 학생 정보 입력 ===");
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				System.out.print("반 : ");
				int classroom = sc.nextInt(); sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				System.out.print("수학점수 : ");
				int math = sc.nextInt(); sc.nextLine();
				students[idx++] = new Student(grade, classroom, name, kor, eng, math);
			} else {
				System.out.println("저장 길이 부족");
				return;
			}
			
			System.out.println("현재 등록된 학생 수 : " + ++count);
			System.out.print("계속 추가하시겠습니까?(Y/N) : ");
			String more = sc.nextLine();
						
			if (more.equalsIgnoreCase("y")) {
				continue;
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}

		
		for (int i = 0; i < count; i++) {
			System.out.println(students[i].info());
			sum += (students[i].getKor() + students[i].getEng() + students[i].getMath());
		} System.out.println("평균 : " + sum / 3.0);

	}

}
