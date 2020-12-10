package com.kh.hw2.view;

import java.util.Scanner;

import com.kh.hw2.model.vo.Employee;

public class EmpMenu {
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		Employee emp = null;
		
		while(true) {
			System.out.println("==== ��� ���� ���� ���α׷� ====");
			System.out.println("1. �� ��� ���� �Է�");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ��� ���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int input = sc.nextInt();
			if (input == 1) {
				emp = inputEmployee();
			} else if (input == 2) {
				modifyEmployee(emp);
			} else if (input == 3) {
				emp.setEmpName(null);
			} else if (input == 4) {
				Employee emp4 = new Employee();
				emp4.info();
			} else if (input == 9) {
				System.out.println("���α׷� ����");
				return;				
			} 
			
		}
	}
	
	public Employee inputEmployee() {
			Scanner sc = new Scanner(System.in);
		
			System.out.print("�߰��� ����� �̸� : ");
			String empName = sc.nextLine();
			System.out.print("�߰��� ����� �μ� : ");
			String dept = sc.nextLine();
			System.out.print("�߰��� ����� ���� : ");
			String job = sc.nextLine();
			System.out.print("�߰��� ����� ���� : ");
			int age = sc.nextInt();
			System.out.print("�߰��� ����� ���� : ");
			char gender = sc.next().charAt(0);
			System.out.print("�߰��� ����� �޿� : ");
			int salary = sc.nextInt();
			System.out.print("�߰��� ����� ���ʽ�����Ʈ : ");
			double bonusPoint = sc.nextDouble();
			System.out.print("�߰��� ����� ��ȭ��ȣ : ");
			String phone = sc.nextLine(); sc.next();
			System.out.print("�߰��� ����� �ּ� : ");
			String address = sc.nextLine(); sc.next();
			
			return new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		
	}
	
	public void modifyEmployee(Employee emp) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== ��� ���� ���� �޴� === ");
		System.out.println("1. �̸� ����");
		System.out.println("2. �޿� ����");
		System.out.println("3. �μ� ����");
		System.out.println("4. ���� ����");
		System.out.println("9. ���� �޴���");
		
		System.out.println("���ϴ� �޴� �Է� : ");
		int inputMenu = sc.nextInt();
		switch (inputMenu) {
		case 1 :	
			System.out.println("������ �̸��� �Է��ϼ��� : ");
			String reName = sc.next();
			emp.setEmpName(reName);
			break;
		case 2 :
			System.out.println("������ �޿��� �Է��ϼ��� : ");
			int reSalay = sc.nextInt();
			emp.setSalay(reSalay);
			break;
		case 3 :
			System.out.println("������ �μ��� �Է��ϼ��� : ");
			String reDept = sc.next();
			emp.setDept(reDept);
			break;
		case 4 :
			System.out.println("������ ������ �Է��ϼ��� : ");
			String reJob = sc.next();
			emp.setJob(reJob);
			break;
		default :
			System.out.println("���� �޴��Դϴ�.");
			break;
		}
		
		
		
		
		
	}
}
