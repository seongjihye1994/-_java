package com.kh.hw2.view;

import java.util.Scanner;

import com.kh.hw2.model.vo.Employee;

public class EmpMenu {
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		Employee emp = null;
		
		while(true) {
			System.out.println("==== 사원 정보 관리 프로그램 ====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
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
				System.out.println("프로그램 종료");
				return;				
			} 
			
		}
	}
	
	public Employee inputEmployee() {
			Scanner sc = new Scanner(System.in);
		
			System.out.print("추가할 사원의 이름 : ");
			String empName = sc.nextLine();
			System.out.print("추가할 사원의 부서 : ");
			String dept = sc.nextLine();
			System.out.print("추가할 사원의 직금 : ");
			String job = sc.nextLine();
			System.out.print("추가할 사원의 나이 : ");
			int age = sc.nextInt();
			System.out.print("추가할 사원의 성별 : ");
			char gender = sc.next().charAt(0);
			System.out.print("추가할 사원의 급여 : ");
			int salary = sc.nextInt();
			System.out.print("추가할 사원의 보너스포인트 : ");
			double bonusPoint = sc.nextDouble();
			System.out.print("추가할 사원의 전화번호 : ");
			String phone = sc.nextLine(); sc.next();
			System.out.print("추가할 사원의 주소 : ");
			String address = sc.nextLine(); sc.next();
			
			return new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		
	}
	
	public void modifyEmployee(Employee emp) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 사원 정보 수정 메뉴 === ");
		System.out.println("1. 이름 변경");
		System.out.println("2. 급여 변경");
		System.out.println("3. 부서 변경");
		System.out.println("4. 직급 변경");
		System.out.println("9. 이전 메뉴로");
		
		System.out.println("원하는 메뉴 입력 : ");
		int inputMenu = sc.nextInt();
		switch (inputMenu) {
		case 1 :	
			System.out.println("변경할 이름을 입력하세요 : ");
			String reName = sc.next();
			emp.setEmpName(reName);
			break;
		case 2 :
			System.out.println("변경할 급여를 입력하세요 : ");
			int reSalay = sc.nextInt();
			emp.setSalay(reSalay);
			break;
		case 3 :
			System.out.println("변경할 부서를 입력하세요 : ");
			String reDept = sc.next();
			emp.setDept(reDept);
			break;
		case 4 :
			System.out.println("변경할 직급을 입력하세요 : ");
			String reJob = sc.next();
			emp.setJob(reJob);
			break;
		default :
			System.out.println("없는 메뉴입니다.");
			break;
		}
		
		
		
		
		
	}
}
