package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break : 가장 가까운 반복문을 빠져나가는 도구
	// *** switch의 break는 switch문만 빠져나가는 break로
	//     반복문에서 사용되는 break와 다름 ***
	
	public void method1() {
		// "exit" 입력 전까지 문자열을 계속 입력 받고 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String input = sc.next();
			
			if (input.equals("exit")) break;
			System.out.printf("입력한 문자열 : %s\n", input);
		}

	}
	
	public void method2() {
		// for문으로 1부터 사용자가 입력한 숫자까지의 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요, : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; ; i++) {
			sum += i; if (i == num) break;
		}
		
	}
	public void method3() {
		// 사용자에게 반복적으로 정수 두 개와 연산 기호(문자)를 입력받고
		// 그에 해당하는 결과를 출력하기
		// 또한 제시 된 연산 기호를 입력하지 않고 다른 연산기호를 입력했을 경우
		// 반복 종료
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 1 입력 : "); int input1 = sc.nextInt();
			System.out.print("정수 2 입력 : "); int input2 = sc.nextInt();
			System.out.print("연산기호 입력 (+, -) : "); String op = sc.nextLine();
			
			if (!op.equals("+") && !op.equals("-")) {
				System.out.println("잘못 입력하셨습니다."); break;
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
