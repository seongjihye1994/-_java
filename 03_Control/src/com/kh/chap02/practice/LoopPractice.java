package com.kh.chap02.practice;

import java.util.Random;
import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 �̻��� ���� �Է� : ");
		int input = sc.nextInt();
		
		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			} 			
		} else System.out.println("�߸� �Է��Ͽ����ϴ�.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while(true) {
			System.out.print("1 �̻��� ���� �Է� : ");
			int input = sc.nextInt();
			
			if(input <= 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} while(i <= input) {
			 	System.out.print(i + " ");
			 	i++;
			} System.out.println();
			break;
		}
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 �̻��� ���� �Է� : ");
		int input = sc.nextInt();
		
		if (input <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
		} for (int i = input; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 �̻��� ���� �Է� : ");
			int input = sc.nextInt();
			int i = input;
			
			if(input <= 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} while(i >= 1) {
			 	System.out.print(i + " ");
			 	i--;
			} System.out.println();
			break;
		}
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
			System.out.printf("%d + ", i);
		} System.out.printf("%d", sum);
		System.out.printf(" = %d\n", sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int input1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int input2 = sc.nextInt();
		int min = 0;
		int max = 0;
		
		if (input1 <= 0 || input2 <= 0) {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���."); return;
		} else if (input1 > input2) {
			min = input2; max = input1;
		} else {
			min = input1; max = input2;
		} for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		} 
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int max = 0;
		
		while(true) {
			System.out.print("ù ��° ���� : ");
			int input1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int input2 = sc.nextInt();
			
			if (input1 <= 0 || input2 <= 0) {
				System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
				continue;
			} if (input1 > input2) { // 1���� ���� 2���� ������ ũ�ٸ�
				min = input2; max = input1;
			} else {
				min = input1; max = input2;
			} for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			} System.out.println();	
		}
		
		
		
	}
	
	public void practice8 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		System.out.printf("=== %d�� ===\n", input);
		
		for (int gugu = 1; gugu < 10; gugu++) {
			System.out.printf("%d X %d = %d\n", input, gugu, input * gugu);
		}
		
		
	}
	
	public void practice9 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int dan = sc.nextInt();
		
		if (!(dan > 1 && dan < 10)) {
			System.out.println("2~9������ ���ڸ� �Է����ּ���.");
			return;
		}
		
		for (int i = dan; i < 10; i++) {
			System.out.printf("=== %d�� ===\n", i);
			for (int gugu = 1; gugu < 10; gugu++) {
				System.out.printf("%d X %d = %d\n", i, gugu, i * gugu);
			} System.out.println();
			
		}
		
	}
	public void practice10 () {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� : ");
			int dan = sc.nextInt();
			
			if (!(dan > 1 && dan < 10)) {
				System.out.println("2~9������ ���ڸ� �Է����ּ���.");
				continue;
			}
			
			for (int i = dan; i < 10; i++) {
				System.out.printf("=== %d�� ===\n", i);
				for (int gugu = 1; gugu < 10; gugu++) {
					System.out.printf("%d X %d = %d\n", i, gugu, i * gugu);
				} System.out.println();
			} break;	
		}

	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int num = sc.nextInt();
		System.out.print("���� �Է� : ");
		int gap = sc.nextInt();
		
		int tot = 0;
		
		for (int i = num; tot < 10; i += gap) {
			System.out.print(i + " ");
			tot++;
		}
			
		
		
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");				
			} System.out.println();
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		for (int i = input; i > 0; i--) {			
			for (int j = i; j > 0; j--) {
				System.out.print("*");	
			} System.out.println();
		}
		
	
	}
	
	public void practice14() {		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.next();
			if (op.equalsIgnoreCase("exit")) {
				System.out.println("���α׷��� �����մϴ�."); break;
			} System.out.print("���� 1 �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("���� 2 �Է� : ");
			int num2 = sc.nextInt();
			
			 if (num2 == 0 && op.equals("/")) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else if (!(op.equals("+")) &&
					!(op.equals("-")) && 
					!(op.equals("/")) &&
					!(op.equals("*"))) {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			} 
			
			switch(op) {
			case "+" :
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);break;
			case "-" :
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);break;
			case "/" :
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);break;
			case "*" :
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);break;
			}

		}
		
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		int i;
		
		if (input <= 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
		} for (i = 2; i < input; i++) {
			if (input % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�."); 
				break;
			}
		} if (i == input) System.out.println("�Ҽ��Դϴ�.");
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� : ");
			int input = sc.nextInt();
			int i;
			
			if (input <= 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�."); continue;
			} for (i = 2; i < input; i++) {
				if (input % i == 0) {
					System.out.println("�Ҽ��� �ƴմϴ�."); 
					break;
				}
			} if (i == input) System.out.println("�Ҽ��Դϴ�.");
			break;
			
		}
		
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		int count = 0;
		int j;
		
		for (int i = 2; i <= input; i++) { 
			for (j = 2; j <= i; j++) {
				if (i % j == 0) break;
				} if (i == j) {
					count++;
					System.out.print(j + " ");
				}
			} System.out.println();
		System.out.printf("2���� %d������ �Ҽ� ������ %d���Դϴ�.\n", input, count);
		
		
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ���. : ");
		int input = sc.nextInt();
		int count = 0;
		int i;
		
		for (i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if (i % 2 == i % 3) count++;
			}
		} System.out.println();
		System.out.printf("count : %d\n", count);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
	
		for (int i = 1;i < input; i++){
			for (int j = input - 1; j > 0; j--){
				if (i < j) System.out.print(" ");
				else System.out.print("*");
			} System.out.println();
		}
		
		
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ȧ�� �Է� : ");
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		} System.out.println();
		
		for (int i = 0; i < input - 1; i++) {
			for (int j = input - i - 1; j > 0; j--) {
				System.out.print("*");
			} System.out.println();
		}
		
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			// ���� ���� ���
			for (int j = 0; j < input - i - 1; j++) {
				System.out.print(" ");
			}
			// �� ���
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println(); // ����
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ȧ�� �Է� : ");
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (i == 0 || i == input - 1) System.out.print("*");
				else {
					if (j == 0 || j == input - 1) System.out.print("*");
					else {
						if (j == 0 || j == input - 1) System.out.print("*");
						else System.out.print(" ");
					}
				}
			} System.out.println();
		}
		
		
	}
		
	public void practice23() {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		do {
			System.out.print("���� �Է� : ");
			int inputNum = sc.nextInt();
			int rn1 = rn.nextInt(6) + 1;
			int rn2 = rn.nextInt(6) + 1;
			System.out.println(rn1 + " " + rn2);
			
			if ((rn1 + rn2 == inputNum)) {
				System.out.println("������ϴ�.");
			} else System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.print("����Ͻðڽ��ϱ�? : (y/n)");
			String goPlay = sc.next();
			if (goPlay.equalsIgnoreCase("y")) continue;
			else {
				flag = false;
				System.out.println("���α׷��� �����մϴ�."); break;
			}
		} while(flag == false) ;

	}
	
	

}
