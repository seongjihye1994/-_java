package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int input2 = sc.nextInt();

		if (1 <= input1 && input2 <= 9) {
			System.out.printf("합 : %d\n", input1 + input2);			
			System.out.printf("차 : %d\n", input1 - input2);			
			System.out.printf("곱 : %d\n", input1 * input2);	
			if (input2 > 0) {
				System.out.printf("나누기 : %d\n", input1 / input2);						
			} else System.out.printf("나누기 : %d\n", 0);									
		}

	}

}
