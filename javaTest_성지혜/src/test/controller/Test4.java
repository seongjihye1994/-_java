package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int input1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int input2 = sc.nextInt();

		if (1 <= input1 && input2 <= 9) {
			System.out.printf("�� : %d\n", input1 + input2);			
			System.out.printf("�� : %d\n", input1 - input2);			
			System.out.printf("�� : %d\n", input1 * input2);	
			if (input2 > 0) {
				System.out.printf("������ : %d\n", input1 / input2);						
			} else System.out.printf("������ : %d\n", 0);									
		}

	}

}
