package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int input1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int input2 = sc.nextInt();
		
		if (1 <= input1 && input2 <= 9) {
			
			int result = input1 * input2;
			
			if (result <= 10) {
				System.out.println("�� �ڸ� �� �Դϴ�.");
			} else System.out.println("�� �ڸ� �� �Դϴ�.");
			
		}

	}

}
