package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "앙수다." : "양수가 아니다.";
		System.out.println(result);
		
		
	}
	
	public void practice2( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "앙수다." : "음수다.";
		System.out.println(result);
		
	}
	
	public void practice3( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0) ? "짝수다." : "홀수다.";
		System.out.println(result);
		
	}
	
	public void practice4( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 입력 : ");
		int inputPeople = sc.nextInt();
		System.out.print("사탕 개수 입력 : ");
		int inputCandy = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d개\n" , inputCandy / inputPeople);
		System.out.printf("남는 사탕 개수 : %d개\n", inputCandy % inputPeople);
		
		
	}
	
	public void practice5( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int myClass = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = (sc.next().charAt(0) == 'F') ? '여' : '남';
		
		System.out.print("성적(소수점 아레 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.\n"
				, grade, myClass, num, name, gender, score);
		
		
		
	}
	
	public void practice6( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result = age > 19 ? "성인" : ((age > 13 && age <= 19) ? "청소년" : "어린이");
		System.out.println(result);
	}
	
	public void practice7( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3;
		
		System.out.printf("합계 : %d\n", tot);
		System.out.printf("평균 : %.2f\n", avg);
		
		String result = (tot >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(result);
	
		
		
	}
	
	public void practice8( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char primeNum = sc.nextLine().charAt(7);
		
		String result = (primeNum == '2') ? "여자" : "남자";
		System.out.println(result);
		
	
		
		
	}
	
	public void practice9( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("또 다른 수 입력 : ");
		int anotherNum = sc.nextInt();
		
		boolean isTrue = (anotherNum <= num1 || anotherNum > num2) ? true : false;
		System.out.println(isTrue);
		
		
	}
	
	public void practice10( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = sc.nextInt();
		
		boolean isTrue = (num1 == num2 && num1 == num3);
		System.out.println(isTrue);
	
	
		
		
	}

}
