package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.printf("키 %.1f인 %d살 %c %s님 반갑습니다^^\n", 
				height, age, gender, name);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int userInput1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int userInput2 = sc.nextInt();
		
		System.out.printf("더하기 결과 : %d\n", userInput1 + userInput2);
		System.out.printf("빼기 결과 : %d\n", userInput1 - userInput2);
		System.out.printf("곱하기 결과 : %d\n", userInput1 * userInput2);
		System.out.printf("나누기 몫 결과 : %d\n", userInput1 / userInput2);
		
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력 : ");
		double col = sc.nextDouble();
		System.out.print("세로 입력 : ");
		double row = sc.nextDouble();
		
		System.out.printf("면적 : %.2f\n", col * row);
		System.out.printf("둘레 : %.2f\n", (col + row) * 2);
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
		
	}
}
