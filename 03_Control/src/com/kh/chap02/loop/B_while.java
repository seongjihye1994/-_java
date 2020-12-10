package com.kh.chap02.loop;

import java.util.Scanner;

public class B_while {
	
	// while��
	// [�ʱ��]
	// wile(���ǽ�)
	// 		������ �ڵ�;
	// 		[������];
	// }
	

	public void method1() {
		// 1���� 5���� ����ϱ�
		int i = 1;
		while(i < 6) {
			System.out.print(i + " ");
			i++;
		}
	}
	public void method2() {
		// 10���� 1���� ����ϱ�
		int i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}
	public void method3() {
		// 1���� 10���� Ȧ���� ����ϱ�
		int i = 1;
		while(i < 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}
	
	public void method4() {
		// 1���� ������ (50~100)������ �� ���ϱ�
		int random = (int)(Math.random() * 51) + 50;
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		} System.out.printf("%d���� %d������ �� : %d\n", 1, random, sum);
	}
	
	public void method5() {
		// ����ڿ��� ���ڿ��� �Է� �޾Ƽ� �� �ε����� ���ڸ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String input = sc.nextLine();
		
		// �Է� ���� ���ڿ��� ���̸� �˷��� --> ���ڿ�.length() �޼ҵ� ���
		System.out.println("���ڿ��� ���� : " + input.length());
		
		int i = 0;
		while(i < input.length()) { // ���̸� ����Ҷ��� ������ �� �����ϱ�!
			System.out.println(input.charAt(i));
			i++;
		}
		
	}
	
	public void method6() {
		// 2�ܺ��� 9�ܱ��� ���
		
		int dan = 2;
		
		while(dan < 10) {
			System.out.printf("=== %d�� ===\n", dan);
			int gugu = 1; // gugu�� �ٽ� 1�� �ʱ�ȭ ������� �Ѵ�! �ƴϸ� ���� �ݺ����� ���� �ʴ´�!
			while(gugu < 10) {
				System.out.printf("%d X %d = %d\n", dan, gugu, dan * gugu);
				gugu++;
			} dan++;
			System.out.println();
		}  
	}
	
	public void method7() {
		// 0�� 0�� ~ 23�� 59�� ���
		int hour = 0;
		
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%d�� %d��\n", hour, min);
				min++;
			} hour++;
			System.out.println();
		} 
	}
	
	// -> ������ ������ŭ �ݺ��ϰ��� �� ���� for������ �̿��ϴ� ���� ����
	// while���� �޴��� ����� ���α׷��� ����ؼ� ������ ������ �Ǵ��ϴ� �뵵�� �ַ� ����� ��
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		// while���� ���ǿ� true�� ������ ����ؼ� �ݺ��ϴ� ���ѷ����� ���� �� ����
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. 1���� 5���� ���");
			System.out.println("2. 10���� 1���� ���");
			System.out.println("3. 1���� 10���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.println();
			System.out.println("���ϴ� �޴��� �Է��ϼ���. : ");
			
			int input = sc.nextInt();
			
			switch(input) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
	}
	
	public void method9() {
		// ���ڿ� �Է� �ް� �Է� ���� ���ڿ� ��� -> �Է� ���� ���ڿ��� "exit"�� �ƴ� ������ �ݺ�
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while(!str.equals("exit") || !str.equals("EXIT")) { // �Է��� ���ڿ��� exit�� �ƴҋ����� ��� �ݺ�
			System.out.print("���ڿ��� �Է����ּ���. : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
		System.out.println("exit �Է����� ����Ǿ����ϴ�.");
	} // str.equalsIgnoreCase("exit"); -->> ��ҹ��ڸ� �������� �ʰ� ���� �� �ִ� �޼ҵ�

	
	
	
	
	
	
}
