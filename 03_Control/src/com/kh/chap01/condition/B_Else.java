package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	// if-else문
	// if(조건식) {
	// 		실행할 코드1;
	// } else {
	// 		실행할 코드2;
	// }
	
	// 조건식의 결과가 true인 경우 코드 1 수행 후 빠져나감
	// 하지만 조건식의 결과가 false인 경우 무조건 코드2 수행
	
	// if-else if-esle문
	// if(조건식1) {
	// 		실행할 코드1;
	// } else if(조건식2){
	// 		실행할 코드2;
	// } else {
	// 		실행할 코드3;
	// }
	
	// 조건이 다수일 경우 사용하는 조건문으로
	// 조건식 1의 결과가 true인 경우 코드 1을 수행하고 빠져나감
	// 하지만 조건식 1의 결과가 false인 경우 다음 조건식 2확인
	// 조건식 2의 결과가 true인 경우 코드 2를 수행하고 빠져나감
	// 하지만 조건식 2의 결과가 false인 경우 무조건 코드 3실행
	
	public void method1() {
		// A_If 클래스의 method1() : 양수, 음수, 0 판별
		// 양수, 음수, 0 판별의 3개의 단독 if문은
		// if-else if-else문으로 변경 가능
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num > 0) System.out.println("양수다.");
		else if (num < 0) System.out.println("음수다.");
		else System.out.println("0이다.");
		
	}
	
	public void method3( ) {
	// 실습문제 5 : 성별 입력받아 남학생인지 여학생인지 구별
			Scanner sc = new Scanner(System.in);
			
			System.out.print("성별을 입력하세요.(M/F) : ");
			char input = sc.next().charAt(0);
			
			String student = "";
			// 문자열 공백으로 초기화 해두기
			
			if (input == 'M' || input == 'm') student = "남학생";
			else if (input == 'F' || input == 'f') student = "여학생";
			else System.out.println("잘못 입력하셨습니다.");
			
			System.out.println(student + "이다");
			
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int input = sc.nextInt();
		
		String result = "";
		
		if (input <= 13) result = "어린이";
		else if (input <= 19) result = "청소년";
		else result = "성인";
		
		System.out.println(result + "입니다.");
		
		// if문을 작성할 때는 조건문의 순서도 중요하다.
		
		
		
		
	}
	
	public void method5() {
		// 사용자에게 점수를 입력받아
		// 점수별로 등급을 나눠 점수와 등급을 출력하는 메소드
		
		// 90점 이상은 A등급
		// 90점 미만 80점 이상 B등급
		// 80점 미만 70점 이상 C등급
		// 70점 미만 60점 이상 D등급
		// 60점 미만 F등급
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int input = sc.nextInt();
		
		String grade = "";
		
		if (input >= 90) grade = "A";
		else if (input >= 80) grade = "B";
		else if (input >= 70) grade = "C";
		else if (input >= 60) grade = "D";
		else grade = "F";
		
		System.out.println("점수는 : " + input + "이고, " 
				 + grade + "등급 입니다.");
		
	}
	
	public void method6() {
		// 위의 문제에 각 등급별 중간 점수 이상의 경우에는
		// 등급에 "+"라는 문자를 추가하여 출력하게 하자
		// 중첩 if문을 통해서 해결해보자
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int input = sc.nextInt();
		
		String grade = "";
		
		if (input >= 90) {
			grade = "A";
			if (input >= 95) {
				grade += "+";
			}
		} else if (input >= 80) {
			grade = "B";
			if (input >= 85) {
				grade += "+";
			}
		} else if (input >= 70) {
			grade = "C";
			if (input >= 75) {
				grade += "+";
			}
		} else if (input >= 60) {
			grade = "D";
			if (input >= 65) {
				grade += "+";
			}
		} else grade = "F";
		
		System.out.println("점수는 : " + input + "이고, " 
				 + grade + "등급 입니다.");
		
	
	
	}

}
