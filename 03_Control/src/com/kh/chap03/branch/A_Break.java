package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break : ���� ����� �ݺ����� ���������� ����
	// *** switch�� break�� switch���� ���������� break��
	//     �ݺ������� ���Ǵ� break�� �ٸ� ***
	
	public void method1() {
		// "exit" �Է� ������ ���ڿ��� ��� �Է� �ް� ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String input = sc.next();
			
			if (input.equals("exit")) break;
			System.out.printf("�Է��� ���ڿ� : %s\n", input);
		}

	}
	
	public void method2() {
		// for������ 1���� ����ڰ� �Է��� ���ڱ����� �հ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���, : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; ; i++) {
			sum += i; if (i == num) break;
		}
		
	}
	public void method3() {
		// ����ڿ��� �ݺ������� ���� �� ���� ���� ��ȣ(����)�� �Է¹ް�
		// �׿� �ش��ϴ� ����� ����ϱ�
		// ���� ���� �� ���� ��ȣ�� �Է����� �ʰ� �ٸ� �����ȣ�� �Է����� ���
		// �ݺ� ����
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� 1 �Է� : "); int input1 = sc.nextInt();
			System.out.print("���� 2 �Է� : "); int input2 = sc.nextInt();
			System.out.print("�����ȣ �Է� (+, -) : "); String op = sc.nextLine();
			
			if (!op.equals("+") && !op.equals("-")) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
			}
			
			switch(op) {
			case "+" :
				System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2);
			case "-" :
				System.out.printf("%d - %d = %d\n", input1, input2, input1 - input2);
			} break;
		}
	}

}
