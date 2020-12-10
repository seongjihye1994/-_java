package com.kh.example.run;

import java.util.Scanner;

import com.kh.example.model.vo.Student;
import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[3];
		
		for (int i = 0; i < student.length; i++) {
			
			System.out.println(i + 1 + "��° �л� ���� �Է�");
			
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			
			System.out.print("��ȣ : ");
			int number = sc.nextInt();
			sc.nextLine(); // ���� ����
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			student[i] = new Student(grade, classroom, number, name);
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].info());		
		}
		

	}

}
