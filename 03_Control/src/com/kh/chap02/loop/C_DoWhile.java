package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	// do while문
	// [초기식];
	// do {
	//		실행할 코드;
	// 		[증감식 or 분기문];
	// } while(조건식); 	
	
	// do while문에서는 while(조건식)뒤에 꼭 ;세미콜론을 붙어야한다.

	public void method1() {
		// while문과 다른 점은 조건이 맞지 않아도
		// 반드시 한 번은 수해을 먼저 하고 조건 검사를 한다는 점
		
		int num = 0;
		do {
			System.out.println(num);
		} while(num != 0); // 원칙적으로는 괄호 안의 조건이 맞지는 않지만, do while문에서는 가능하다.
	}
	
	public void method2() {
		// 1부터 5까지 출력
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 5); 
	}
	
	public void method3() {
		// 1부터 랜덤 수(17 ~ 24) 까지의 합 구하기
		int random = (int)(Math.random() * 8) + 17;
		System.out.println("랜덤 수 : " + random);
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= random);
		
		System.out.printf("%d부터 %d까지의 합 : %d\n", 1, random, sum);
	}
	
	public void method4() {
		// 사용자에게 문자열을 입력 받아서 각 인덱스별 문자를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		// 입력 받은 문자열의 길이를 알려면 --> 문자열.length() 메소드 사용
		System.out.println("문자열의 길이 : " + input.length());
		
		int i = 0;
		do { // 무조건 실행하는 문장
			System.out.println(input.charAt(i));
			i++;
		} while(i < input.length());
		
		// 만약에 빈 문자열을 입력 받은 경우, 오류 발생 --> do while문은 일단 한 번 실행하고 조건을
		// 확인하기 때문
		
			
	}
	
	
	
	
	
}
