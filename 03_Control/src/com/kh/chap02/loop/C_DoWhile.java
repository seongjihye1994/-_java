package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	// do while��
	// [�ʱ��];
	// do {
	//		������ �ڵ�;
	// 		[������ or �б⹮];
	// } while(���ǽ�); 	
	
	// do while�������� while(���ǽ�)�ڿ� �� ;�����ݷ��� �پ���Ѵ�.

	public void method1() {
		// while���� �ٸ� ���� ������ ���� �ʾƵ�
		// �ݵ�� �� ���� ������ ���� �ϰ� ���� �˻縦 �Ѵٴ� ��
		
		int num = 0;
		do {
			System.out.println(num);
		} while(num != 0); // ��Ģ�����δ� ��ȣ ���� ������ ������ ������, do while�������� �����ϴ�.
	}
	
	public void method2() {
		// 1���� 5���� ���
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 5); 
	}
	
	public void method3() {
		// 1���� ���� ��(17 ~ 24) ������ �� ���ϱ�
		int random = (int)(Math.random() * 8) + 17;
		System.out.println("���� �� : " + random);
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= random);
		
		System.out.printf("%d���� %d������ �� : %d\n", 1, random, sum);
	}
	
	public void method4() {
		// ����ڿ��� ���ڿ��� �Է� �޾Ƽ� �� �ε����� ���ڸ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String input = sc.nextLine();
		
		// �Է� ���� ���ڿ��� ���̸� �˷��� --> ���ڿ�.length() �޼ҵ� ���
		System.out.println("���ڿ��� ���� : " + input.length());
		
		int i = 0;
		do { // ������ �����ϴ� ����
			System.out.println(input.charAt(i));
			i++;
		} while(i < input.length());
		
		// ���࿡ �� ���ڿ��� �Է� ���� ���, ���� �߻� --> do while���� �ϴ� �� �� �����ϰ� ������
		// Ȯ���ϱ� ����
		
			
	}
	
	
	
	
	
}
