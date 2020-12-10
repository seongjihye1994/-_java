package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.vo.Employee;
import com.kh.hw1.model.vo.Student;

public class Run {
	
	public static int count = 0;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {	
		
		Student[] student = {new Student("ȫ�浿", 20, 180, 75, 1, "�����ý��۰��а�"),
				new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�"),
				new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�")};
		
		for (Student s : student) {
			System.out.println(s.toString());
		}
		
		Employee[] employee = new Employee[10];
		
		while(true) {
			if (count < employee.length) {
				
				System.out.println("=== ��� ���� �Է� ===");
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("Ű : ");
				double height = sc.nextDouble();
				System.out.print("������ : ");
				double weight = sc.nextDouble();
				System.out.print("�޿� : ");
				int salary = sc.nextInt(); sc.nextLine();
				System.out.print("�μ� : ");
				String dept = sc.nextLine();
				
				employee[count++] = new Employee(name, age, height, weight, salary, dept);
				
				System.out.println("��� �߰��Ͻðڽ��ϱ�?(Y/N) : ");
				String keep = sc.next(); sc.nextLine();
				
				if (keep.equalsIgnoreCase("y")) continue;
				else {
					System.out.println("���α׷� ����");
					break;
				}
			}
		}
		
		for (Employee e : employee) {
			if (e == null) break;
			System.out.println(e.toString());
		}

	}

}
