package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// 논리 연산자
	// 두 개의 논리값을 연산하는 연산자
	// &&(AND), ||(OR)
	public void method1() {
		// 사용자가 입력한 정수 값이 1부터 100사이의 값인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		boolean isTrue;
		// isTrue = (1 <= input <= 100);
		isTrue = (input >= 1) && (input <= 100);
		// && -> 의미 : 그리고, ~하면서 (두 가지 조건을 모두 만족해야함)
		System.out.println("사용자가 입력한 값이 1부터 100 사이입니까? : " + isTrue);
		
		// && : 두 개의 조건이 모두 true 여야 && 연산의 결과 값이 trueㅇ다.
		//		하나라도 조건이 false가 된다면 && 연산의 결과 값은 false
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자 값이 영어 대문자인지 확인하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char input = sc.next().charAt(0);
		
		// char형은 실제로 정수형
		// 'A'에서 'Z'에 해당하는 유티코드 값은 65 ~ 90
		// boolean isTrue = (input >= 65) && (input <= 90);
		boolean isTrue = (input >= 'A') && (input <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까? : " + isTrue);
		
		
	}
	
	public void method3() {
		// 사용자에게 프로그램 종료 여부 묻기
		Scanner sc = new Scanner(System.in);
		System.out.print("계속핫려면 y 또는 Y를 입력하세요. : ");
		
		char input = sc.nextLine().charAt(0);
		
		boolean isTrue = (input == 'y') || (input == 'Y');
		// || 의미 : 또는, ~거나
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? : " + isTrue);
	}
	
	public void method4( ) {
		// &&, || 연산의 특징 : 첫 번째 조건에서 결과를 도출할 수 있다면
		// 두 번째 조건을 체크하지 않는다.
		
		int num = 10;
		System.out.println("&& 연산 전의 num 값 : " + num);
		
		boolean result1 = false && ++num > 0;
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num 값 : " + num);
		// && 연산자 앞에 이미 false가 있으므로 뒤쪽의 연산은 실행되지 않음
		// --> dead code라는 경고창 확인할 수 있음
		
		boolean result2 = true || ++num < 0;
		System.out.println("result2 : " + result2);
		System.out.println("|| 연산 후의 num값 : " + num);
		// || 연산자 앞에 이미 true가 있으므로 뒤쪽의 연산은 실행되지 않음
		// --> dead code라는 경고창 확인할 수 있음
		
		
		
	}

}
