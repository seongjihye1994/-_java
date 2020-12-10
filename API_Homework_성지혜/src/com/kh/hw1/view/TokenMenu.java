package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int inputMenu = sc.nextInt();
			
			switch(inputMenu) {
			case 1: tokenMenu(); break;
			case 2: inputMenu(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다."); continue;
			}
			
		}
	}
	
	public void tokenMenu() { // 메뉴 1
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String result = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + result);
		System.out.println("토큰 처리 후 개수 : " + result.length());
		System.out.println("모두 대문자로 변환 : " + result.toUpperCase());
	}
	
	public void inputMenu() { // 메뉴 2
		System.out.print("문자열 입력 : ");
		String inputStr = sc.next();
		
		String result = tc.firstCap(inputStr); // 첫 글자 대문자 리턴
		System.out.println("첫 글자 대문자 : " + result);
		
		System.out.print("찾을 문자 하나 : ");
		char findStr = sc.next().charAt(0);
		int findResult = tc.findChar(inputStr, findStr);
		System.out.printf("%c 문자가 들어간 개수 : %d\n", findStr, findResult);		
	}

}
