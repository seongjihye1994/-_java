package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		char gender = sc.next().charAt(0);
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		
		System.out.printf("Ű %.1f�� %d�� %c %s�� �ݰ����ϴ�^^\n", 
				height, age, gender, name);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int userInput1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ��� : ");
		int userInput2 = sc.nextInt();
		
		System.out.printf("���ϱ� ��� : %d\n", userInput1 + userInput2);
		System.out.printf("���� ��� : %d\n", userInput1 - userInput2);
		System.out.printf("���ϱ� ��� : %d\n", userInput1 * userInput2);
		System.out.printf("������ �� ��� : %d\n", userInput1 / userInput2);
		
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		double col = sc.nextDouble();
		System.out.print("���� �Է� : ");
		double row = sc.nextDouble();
		
		System.out.printf("���� : %.2f\n", col * row);
		System.out.printf("�ѷ� : %.2f\n", (col + row) * 2);
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
		
		
	}
}
