package com.kh.chap02.loop;

import java.util.Scanner;

public class B_while {
	
	// while문
	// [초기식]
	// wile(조건식)
	// 		실행할 코드;
	// 		[증감식];
	// }
	

	public void method1() {
		// 1부터 5까지 출력하기
		int i = 1;
		while(i < 6) {
			System.out.print(i + " ");
			i++;
		}
	}
	public void method2() {
		// 10부터 1까지 출력하기
		int i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}
	public void method3() {
		// 1부터 10까지 홀수만 출력하기
		int i = 1;
		while(i < 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}
	
	public void method4() {
		// 1부터 랜덤값 (50~100)까지의 합 구하기
		int random = (int)(Math.random() * 51) + 50;
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		} System.out.printf("%d부터 %d까지의 합 : %d\n", 1, random, sum);
	}
	
	public void method5() {
		// 사용자에게 문자열을 입력 받아서 각 인덱스별 문자를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		// 입력 받은 문자열의 길이를 알려면 --> 문자열.length() 메소드 사용
		System.out.println("문자열의 길이 : " + input.length());
		
		int i = 0;
		while(i < input.length()) { // 길이를 사용할때는 범위를 잘 설정하기!
			System.out.println(input.charAt(i));
			i++;
		}
		
	}
	
	public void method6() {
		// 2단부터 9단까지 출력
		
		int dan = 2;
		
		while(dan < 10) {
			System.out.printf("=== %d단 ===\n", dan);
			int gugu = 1; // gugu는 다시 1로 초기화 시켜줘야 한다! 아니면 내부 반복문은 돌지 않는다!
			while(gugu < 10) {
				System.out.printf("%d X %d = %d\n", dan, gugu, dan * gugu);
				gugu++;
			} dan++;
			System.out.println();
		}  
	}
	
	public void method7() {
		// 0시 0분 ~ 23시 59분 출력
		int hour = 0;
		
		while(hour < 24) {
			int min = 0;
			while(min < 60) {
				System.out.printf("%d시 %d분\n", hour, min);
				min++;
			} hour++;
			System.out.println();
		} 
	}
	
	// -> 정해진 정수만큼 반복하고자 할 때는 for문으로 이용하는 것이 편리함
	// while문은 메뉴를 만들어 프로그램을 계속해서 진행할 것인지 판단하는 용도로 주로 사용할 것
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		// while문의 조건에 true를 넣으면 계속해서 반복하는 무한루프로 만들 수 있음
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 1부터 5까지 출력");
			System.out.println("2. 10부터 1까지 출력");
			System.out.println("3. 1부터 10까지 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println();
			System.out.println("원하는 메뉴를 입력하세요. : ");
			
			int input = sc.nextInt();
			
			switch(input) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
	}
	
	public void method9() {
		// 문자열 입력 받고 입력 받은 문자열 출력 -> 입력 받은 문자열이 "exit"가 아닐 떄까지 반복
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while(!str.equals("exit") || !str.equals("EXIT")) { // 입력한 문자열이 exit가 아닐떄까지 계속 반복
			System.out.print("문자열을 입력해주세요. : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
		System.out.println("exit 입력으로 종료되었습니다.");
	} // str.equalsIgnoreCase("exit"); -->> 대소문자를 구분하지 않고 받을 수 있는 메소드

	
	
	
	
	
	
}
