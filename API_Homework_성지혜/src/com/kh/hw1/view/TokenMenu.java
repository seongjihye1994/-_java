package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int inputMenu = sc.nextInt();
			
			switch(inputMenu) {
			case 1: tokenMenu(); break;
			case 2: inputMenu(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); continue;
			}
			
		}
	}
	
	public void tokenMenu() { // �޴� 1
		String str = "J a v a P r o g r a m";
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		String result = tc.afterToken(str);
		System.out.println("��ū ó�� �� ���� : " + result);
		System.out.println("��ū ó�� �� ���� : " + result.length());
		System.out.println("��� �빮�ڷ� ��ȯ : " + result.toUpperCase());
	}
	
	public void inputMenu() { // �޴� 2
		System.out.print("���ڿ� �Է� : ");
		String inputStr = sc.next();
		
		String result = tc.firstCap(inputStr); // ù ���� �빮�� ����
		System.out.println("ù ���� �빮�� : " + result);
		
		System.out.print("ã�� ���� �ϳ� : ");
		char findStr = sc.next().charAt(0);
		int findResult = tc.findChar(inputStr, findStr);
		System.out.printf("%c ���ڰ� �� ���� : %d\n", findStr, findResult);		
	}

}
