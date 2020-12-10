package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	// switch 문도 if문과 같은 조건문
	// 다만 if문과의 차이점은
	// if문은 조건의 범위를 지정할 수 있었으나
	// switch문은 괄호 안에 값의 조건이 들어가야 함, 즉 동등비교를 함
	
	public void method1() {
		// 1~3 사이의 정수를 입력받아
		// 1인 경우 "빨간색입니다."
		// 2인 경우 "파란색입니다."
		// 3인 경우 "초록색입니다."
		// 그 외의 값인 경우 "잘못 입력하였습니다. " 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : 
			System.out.println("빨간색입니다.");
			break;
		case 2 : 
			System.out.println("빨간색입니다.");
			break;
		case 3 : 
			System.out.println("초록색입니다.");
			break;
		default : 
			System.out.println("잘못 입력하였습니다.");
			return;
		}

	}
	
	public void method2( ) {
		// switch-case 문에서 동등 비교 조건으로 문자열도 사용 가능
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하세요. : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 3000;
			break;
		case "복숭아" :
			price = 2000;
			break;
		default : 
			System.out.println("잘못 입력하였습니다.");
			return;
		}

		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}
	
	public void method3 () {
		// 1 ~12 월까지 입력 받아 해당하는 달의 마지막 날짜를 출력
		// 28/29일, 30일, 31일인 달로 나누어짐
		Scanner sc = new Scanner(System.in);
		System.out.print("1~2월까지 중 하나를 입력하세요. : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("입력하신 월은 31일 까지 입니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("입력하신 월은 31일 까지 입니다.");
			break;
		case 2 :
			System.out.println("입력하신 월은 28일 또는 29일 까지 입니다.");
			break;
		default :
			System.out.println("반드시 1~12월까지를 입력해야 합니다.");
			return;
		}

	}
	
	
	
	
	
	
	
	
	
	
	

}