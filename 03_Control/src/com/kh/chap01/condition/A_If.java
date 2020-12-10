package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	// ���α׷��� �⺻������ ���������� ���त������
	// ���� �κ��� ���������� �����ؾ� �� ��
	// �Ǵ� �ݺ������� ���� �ؾ� �� ��
	// "���"�� �̿���
	
	// ���������� �����ϴ� ���ù� -> ���ǹ�
	// �ݺ������� �����ϴ� �ݺ��� -> �ݺ���
	// �� ���� �帧 ���� -> �б⹮
	
	// < ���ǹ� >
	// ���ǽ��� ���� ������ ���������� �Ǵ��ؼ�
	// �ش� ������ �����ϴ� ��� �׿� �ش��ϴ� ���๮�� ����
	
	// -> ���ǽ��� ����� true/false�� �����̿��� ��
	// -> �񱳿�����(��Һ� / �����), �������� (&&, ||)�� ���ǽĿ��� �����
	
	// ���ǹ��� ũ�� if���� switch������ ���ƴ���
	// if���� ũ�� �������� ����
	// 1. �ܵ� if��
	// 2. if else��
	// 3. if else if��
	
	// �ܵ� if��
	// if(���ǽ�) {
	// 		������ �ڵ�;
	// }
	
	// -> ���ǽ��� ��� ���� true(��)�̸� �߰�ȣ({}) ���� �ڵ带 ����
	// -> ���Ž��� ��� ���� false(����)�̸� �ڵ� �������� �ʰ� Ż��
	
	public void method1() {
		// ������ �������� 1, 2 : ���, ����, 0�Ǻ��� if������ ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		if (input > 0) System.out.println("�����.");
		if (input < 0) System.out.println("������.");
		if (input == 0) System.out.println("0�̴�.");
		
		
	}
	
	public void method2( ) {
		// �ǽ� ���� 3 : ¦Ȧ �Ǻ��� if������ ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		if (input % 2 == 0) System.out.println("¦��");
		if (input % 2 != 0) System.out.println("Ȧ��");
		
	}
	
	public void method3( ) {
		// �ǽ����� 5 : ���� �Է¹޾� ���л����� ���л����� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���.(M/F) : ");
		char input = sc.next().charAt(0);
		
		String student = "";
		// ���ڿ� �������� �ʱ�ȭ �صα�
		
		if (input == 'M' || input == 'm') student = "���л�";
		if (input == 'F' || input == 'f') student = "���л�";
		
		System.out.println(student + "�̴�");
		
		// M, m, F, f �̿��� �ٸ� ���ڸ� �Է����� ���� "�߸� �Է��ϼ̽��ϴ�." ��� ���
		if (input != 'M' && input != 'm' && input != 'F' && input != 'f') 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
		
		
		
	}
	
	public void method4() {
		// ���ο� ����
		// �Է� �� �̸��� ������ �´��� Ȯ���ϴ� �޼ҵ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���. : ");
		String name = sc.next();
		
//		if (name == "������") System.out.println("�����Դϴ�.");
//		if (name != "������") System.out.println("������ �ƴմϴ�.");
		
		// �⺻ �ڷ����� �� �ÿ� ==, != �� ���� ����񱳸� �� �� ������
		// String �� �⺻�ڷ����� �ƴ� �����ڷ����̹Ƿ�
		// StringŬ�������� �����ϴ� equals() �޼ҵ带 ����ؼ� ���ؾ� ��
		
		if (name.equals("������")) System.out.println("�����Դϴ�.");
		if (!name.equals("������")) System.out.println("������ �ƴմϴ�.");
		
	}
	
}
