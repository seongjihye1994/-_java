package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int input2 = sc.nextInt();
		
		if (1 <= input1 && input2 <= 9) {
			
			int result = input1 * input2;
			
			if (result <= 10) {
				System.out.println("한 자리 수 입니다.");
			} else System.out.println("두 자리 수 입니다.");
			
		}

	}

}
