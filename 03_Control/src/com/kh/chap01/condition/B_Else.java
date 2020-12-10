package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	// if-else��
	// if(���ǽ�) {
	// 		������ �ڵ�1;
	// } else {
	// 		������ �ڵ�2;
	// }
	
	// ���ǽ��� ����� true�� ��� �ڵ� 1 ���� �� ��������
	// ������ ���ǽ��� ����� false�� ��� ������ �ڵ�2 ����
	
	// if-else if-esle��
	// if(���ǽ�1) {
	// 		������ �ڵ�1;
	// } else if(���ǽ�2){
	// 		������ �ڵ�2;
	// } else {
	// 		������ �ڵ�3;
	// }
	
	// ������ �ټ��� ��� ����ϴ� ���ǹ�����
	// ���ǽ� 1�� ����� true�� ��� �ڵ� 1�� �����ϰ� ��������
	// ������ ���ǽ� 1�� ����� false�� ��� ���� ���ǽ� 2Ȯ��
	// ���ǽ� 2�� ����� true�� ��� �ڵ� 2�� �����ϰ� ��������
	// ������ ���ǽ� 2�� ����� false�� ��� ������ �ڵ� 3����
	
	public void method1() {
		// A_If Ŭ������ method1() : ���, ����, 0 �Ǻ�
		// ���, ����, 0 �Ǻ��� 3���� �ܵ� if����
		// if-else if-else������ ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if (num > 0) System.out.println("�����.");
		else if (num < 0) System.out.println("������.");
		else System.out.println("0�̴�.");
		
	}
	
	public void method3( ) {
	// �ǽ����� 5 : ���� �Է¹޾� ���л����� ���л����� ����
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �Է��ϼ���.(M/F) : ");
			char input = sc.next().charAt(0);
			
			String student = "";
			// ���ڿ� �������� �ʱ�ȭ �صα�
			
			if (input == 'M' || input == 'm') student = "���л�";
			else if (input == 'F' || input == 'f') student = "���л�";
			else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			System.out.println(student + "�̴�");
			
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		String result = "";
		
		if (input <= 13) result = "���";
		else if (input <= 19) result = "û�ҳ�";
		else result = "����";
		
		System.out.println(result + "�Դϴ�.");
		
		// if���� �ۼ��� ���� ���ǹ��� ������ �߿��ϴ�.
		
		
		
		
	}
	
	public void method5() {
		// ����ڿ��� ������ �Է¹޾�
		// �������� ����� ���� ������ ����� ����ϴ� �޼ҵ�
		
		// 90�� �̻��� A���
		// 90�� �̸� 80�� �̻� B���
		// 80�� �̸� 70�� �̻� C���
		// 70�� �̸� 60�� �̻� D���
		// 60�� �̸� F���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String grade = "";
		
		if (input >= 90) grade = "A";
		else if (input >= 80) grade = "B";
		else if (input >= 70) grade = "C";
		else if (input >= 60) grade = "D";
		else grade = "F";
		
		System.out.println("������ : " + input + "�̰�, " 
				 + grade + "��� �Դϴ�.");
		
	}
	
	public void method6() {
		// ���� ������ �� ��޺� �߰� ���� �̻��� ��쿡��
		// ��޿� "+"��� ���ڸ� �߰��Ͽ� ����ϰ� ����
		// ��ø if���� ���ؼ� �ذ��غ���
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String grade = "";
		
		if (input >= 90) {
			grade = "A";
			if (input >= 95) {
				grade += "+";
			}
		} else if (input >= 80) {
			grade = "B";
			if (input >= 85) {
				grade += "+";
			}
		} else if (input >= 70) {
			grade = "C";
			if (input >= 75) {
				grade += "+";
			}
		} else if (input >= 60) {
			grade = "D";
			if (input >= 65) {
				grade += "+";
			}
		} else grade = "F";
		
		System.out.println("������ : " + input + "�̰�, " 
				 + grade + "��� �Դϴ�.");
		
	
	
	}

}
