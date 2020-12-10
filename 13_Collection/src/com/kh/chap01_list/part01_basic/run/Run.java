package com.kh.chap01_list.part01_basic.run;

import com.kh.chap01_list.part01_basic.controller.ArrayListTest;
import com.kh.chap01_list.part01_basic.controller.ObjectArrayTest;
import com.kh.chap01_list.part01_basic.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
//		ObjectArrayTest at = new ObjectArrayTest();
		ArrayListTest at = new ArrayListTest();
		
		System.out.println("�л� 3�� �߰�");
		at.addStudent(new Student("�캰��", 100));
		at.addStudent(new Student("������", 50));
		at.addStudent(new Student("�迵��", 60));
		
		
		// �л� ���
		at.printStudent();
		
		System.out.println("�л� �� �� �� �߰�");
		at.addStudent(new Student("ȫ�浿", 80));

		// �߰� �� �л� ���
		at.printStudent();
		
		System.out.println("1�� �ε��� �л� ����");
		at.removeStudent(1); // 1�� �л� �ε��� ����
		
		// ���� �� �л� ���
		at.printStudent();
		
	}

}
