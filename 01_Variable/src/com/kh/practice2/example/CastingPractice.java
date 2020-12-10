package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		
		char ch = sc.next().charAt(0);
		System.out.printf("%c unicode : %d\n", ch, (int)ch);
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int students = 3;
		int tot = (int) (kor + eng + mat);
		int avg = (int) ((kor + eng + mat) / students);
		
		System.out.printf("총점 : %d\n", tot);
		System.out.printf("평균 : %d\n", avg);
		
	}
	
	public void method3() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 -iNum2 * 2);
		System.out.println((int)dNum);
		
		System.out.println((double)iNum2 * 2 + (int)dNum);
		System.out.println((double)iNum1);
		
		System.out.println((double)iNum1 / iNum2); 
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1 / (int)fNum);
		
		System.out.println((float)iNum1 / fNum);
		System.out.println((double)iNum1 / fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch + iNum1); 
		System.out.println((char)(ch + iNum1));
		
	}

}
