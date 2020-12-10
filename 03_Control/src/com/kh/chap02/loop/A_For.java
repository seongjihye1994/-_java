package com.kh.chap02.loop;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class A_For {
	// �ݺ��� : ���α׷��� ���� �帧�� �����ϴ� ��� �߿� �ϳ���
	// ���� �ڵ带 �ݺ������� ���������
	// ũ�� for���� while�� �� �߷��� ����
	
	// for (�ʱ��; ���ǽ�; ������) {
	// }
	
	public void method1() {
		// �ȳ��ϼ��並 10�� ���
		for (int i = 0; i < 10; i++) {
			System.out.println("�ȳ��ϼ���!");
		}
	}
	
	public void method2 () {
		// 1���� 5���� ���
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3 () {
		// 5���� 1���� ���
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 1���� 10 ������ Ȧ�� ���
		// 1 3 5 7 9
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i + " "); // ���ǽĿ��� ++. -- �ܿ��� �� �� �ִ�.
		}
		
		System.out.println(); // �ٰ���
		
	}
	
	public void method5() {
		// 1���� 10���� ������ �հ�
		// �հ踦 ����� ����
		
		int sum = 0;
		
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1���� 10������ ������ : " + sum);
	}
	
	
	public void method6() {
		// 1���� ����ڰ� Ű����� �Է��� �������� �հ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
		} System.out.println("1���� " + input + "������ ������ : " + sum);

	
	}
	
	public void method7() {
		// ������ 2�� ����ϱ�
		// 2*1 = 2
		// 2*2 = 4
		// 2*3 = 6
		// 2*4 = 8
		// 2*5 = 10...
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("\n=== %d�� ===\n", dan);
			for (int gugu = 1; gugu < 10; gugu++) {
				System.out.printf("%d X %d = %d\n", dan, gugu, gugu * dan);
			} 
		} System.out.println();

	}
	
	public void method8 () {
		// 1���� � ���� ��(1���� 10������ ���� ��)������ �հ� ���ϱ�
		// java.lang.Math Ŭ�������� �����ϴ� random() �޼ҵ�
		// ����ؼ� ���� �� �߻� ��ų �� ����
		// java.lang ��Ű���� iport�� �ʿ䰡 ����
		// -> �����Ϸ��� ���� import java.lang.*;�� ������
		
		// Math.random() -> 0.0 ~ 0.99999... ������ ���� �� �߻�
		// int random = Math.random();
		
		// 0.0 * 10 <= random < 1 * 10; -> ���ϴ� ������ ���ڸ� ���Ѵ�.
		// 0 <= random < 10
		// 0 + 1 <= random < 10 + 1 -> ���ϴ� ���� ���� ���߱� ���� ���Ѵ�.
		// 1.0 <= random < 11.0 -> int�� ����ȯ
		// 
		int random = (int) (Math.random() * 10) + 1;
		System.out.println("random : " + random);
		
		// 1���� random�� ������ �������� �հ�
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		} System.out.printf("%d���� %d������ �� : %d\n", 1, random, sum);
		
	}
	
	public void method9() {
		// ���� ������ ���
		// 2���� 9���� ���� ���� random������ ���
		int random = (int)(Math.random() * 8) + 2; // 2~9�� �� 8���� ����
		
		// random �� ���
		System.out.printf("=== %d�� ===\n", random);
		// �ݺ���
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", random, i, random * i);
		}
	}
	
	public void method10( ) {
		// ����ڿ��� �� ���� ���� �� �Է� �޾�
		// ���� ������ ū �������� �հ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		// ���� ���� ���� �Է��ϸ� ����� ������, ū ���� ���� �Է��� �� �ֱ� ������
		int min = 0; // �Է� �� ���� �� ���� ���� ������ ����
		int max = 0; // �Է� �� ���� �� ū ���� ������ ������ �д�.
		
		if (num1 > num2) { // ù��° ���� �ι�° ������ Ŭ ��
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		} for (int i = min; i <= max; i++) {
			sum += i;
		} System.out.printf("%d���� %d������ �� : %d\n", min, max, sum);
	
	
	}
	
	public void method12() {
		// 1���� 5���� ��� �Ǵ� ���� 3�� ���
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.printf("%d ", j);
			} System.out.println();
		}
	}
	
	public void method13() {
		// 0�� 0�� ~ 23�� 59�� ���
		
		// �� -> 0�ú��� 23�ñ��� ����
		// �� -> 0�к��� 59�б��� ����
		
		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				System.out.printf("%d�� %d��\n", hour, min);
			} System.out.println();
		}
	}
	
	public void method14() {
		// �����
		
		// ****
		// ****
		// ****
		// ****
		// ****
		
		for (int i = 0; i < 5; i++) { // �� 5�� �ݺ�
			for (int j = 0; j < 4; j++) { // �� 4�� �ݺ�
				System.out.print("* "); 
			} System.out.println();
		}
	}
	
	public void method15() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		// i�� 1�϶� j�� 1, i�� 2�϶� j�� 2... (if ���ǹ�)
		
		char n = '*';
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) System.out.print(i);
				else System.out.print(n);
			} System.out.println();
		} 
	
	}
	
	
	
}


