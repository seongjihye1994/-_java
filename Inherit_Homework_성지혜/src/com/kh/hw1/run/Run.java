package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.vo.Employee;
import com.kh.hw1.model.vo.Student;

public class Run {
	
	public static int count = 0;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {	
		
		Student[] student = {new Student("홍길동", 20, 180, 75, 1, "정보시스템공학과"),
				new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
				new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")};
		
		for (Student s : student) {
			System.out.println(s.toString());
		}
		
		Employee[] employee = new Employee[10];
		
		while(true) {
			if (count < employee.length) {
				
				System.out.println("=== 사원 정보 입력 ===");
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("키 : ");
				double height = sc.nextDouble();
				System.out.print("몸무게 : ");
				double weight = sc.nextDouble();
				System.out.print("급여 : ");
				int salary = sc.nextInt(); sc.nextLine();
				System.out.print("부서 : ");
				String dept = sc.nextLine();
				
				employee[count++] = new Employee(name, age, height, weight, salary, dept);
				
				System.out.println("계속 추가하시겠습니까?(Y/N) : ");
				String keep = sc.next(); sc.nextLine();
				
				if (keep.equalsIgnoreCase("y")) continue;
				else {
					System.out.println("프로그램 종료");
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
