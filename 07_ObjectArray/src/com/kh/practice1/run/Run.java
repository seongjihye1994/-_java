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
				System.out.println("=== �л� ���� �Է� ===");
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				System.out.print("�� : ");
				int classroom = sc.nextInt(); sc.nextLine();
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("�������� : ");
				int kor = sc.nextInt();
				System.out.print("�������� : ");
				int eng = sc.nextInt();
				System.out.print("�������� : ");
				int math = sc.nextInt(); sc.nextLine();
				students[idx++] = new Student(grade, classroom, name, kor, eng, math);
			} else {
				System.out.println("���� ���� ����");
				return;
			}
			
			System.out.println("���� ��ϵ� �л� �� : " + ++count);
			System.out.print("��� �߰��Ͻðڽ��ϱ�?(Y/N) : ");
			String more = sc.nextLine();
						
			if (more.equalsIgnoreCase("y")) {
				continue;
			} else {
				System.out.println("���α׷� ����");
				break;
			}
		}

		
		for (int i = 0; i < count; i++) {
			System.out.println(students[i].info());
			sum += (students[i].getKor() + students[i].getEng() + students[i].getMath());
		} System.out.println("��� : " + sum / 3.0);

	}

}
