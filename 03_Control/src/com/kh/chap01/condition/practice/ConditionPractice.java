package com.kh.chap01.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		String result = "";
		
		switch (input) {
		case 1 :
			result = "입력";
			break;
		case 2 :
			result = "수정";
			break;
		case 3 :
			result = "조회";
			break;
		case 4 :
			result = "삭제";
			break;
		case 9 :
			result = "종료";
			break;
		default :
			System.out.println("없는 번호입니다.");
		}
		
		System.out.println(result + " 메뉴입니다.");
		
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요. : ");
		int input = sc.nextInt();
		
		String result = "";
		
		if (input < 0) result = "양수만 입력해주세요.";
		else if (input % 2 == 0 && input > 0) result = "짝수다.";
		else result = "홀수다";

		System.out.println(result);
		
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3;
		
		if (kor > 40 && eng > 40 && mat > 40) {
			if (tot >= 60) {
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("수학 : %d\n", mat);
				System.out.printf("합계 : %d\n", tot);
				System.out.printf("평균 : %.2f\n", avg);
				System.out.println("축하합니다, 합격입니다.");
			}
		}else System.out.println("불합격입니다.");
		
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result = "";
		
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			result = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			result = "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			result = "여름";
			break;
		case 9 :
		case 10 :
		case 11 :
			result = "가을";
			break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.\n", month);
		}
		System.out.printf("%d월은 %s 입니다.\n", month, result);
		
		
	}
	
	public void practice5 () {
		Scanner sc = new Scanner(System.in);
		
		String ORIGINALID = "hello";
		String ORIGINALPW = "1234";
		
		System.out.println("id 입력 : ");
		String id = sc.nextLine();
		System.out.println("pw 입력 : ");
		String pw = sc.nextLine();
		
		if (!id.equals(ORIGINALID)) System.out.println("아이디가 틀렸습니다.");
		else if (!pw.equals(ORIGINALPW)) System.out.println("비밀번호가 틀렸습니다.");
		else System.out.println("로그인 성공!");
		
		
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급(관리자/회원/비회원) : ");
		String lv = sc.nextLine();
		
		switch(lv) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원" :
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default :
			System.err.println("잘못 입력하였습니다.");
			return;
		}

	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m) : ");
		double height = sc.nextDouble();
		System.out.println("몸무게 (kg): ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("bmi 지수 : " + bmi);
		
		if (bmi < 18.5) System.out.println("저체중");
		else if (bmi >= 18.5 & bmi < 23) System.out.println("정상체중");
		else if (bmi >= 23 & bmi < 25) System.out.println("과체중");
		else System.out.println("고도비만");
		
		
		
		
		
	}
	
	public void practice8 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력 : ");
		int input1 = sc.nextInt();
		System.out.println("피연산자2 입력: ");
		int input2 = sc.nextInt();
		System.out.println("연산자를 입력 : ");
		char ysj = sc.next().charAt(0);
		
		int result;
		
		switch(ysj) {
		case '/' :
			result = input1 / input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '+' :
			result = input1 + input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '-' :
			result = input1 - input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '*' :
			result = input1 * input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '%' :
			result = input1 % input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		default :
			System.out.println("잘못 입력했습니다.");
			return;
		} 
		
	
	
	
	}
		
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int end = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int ott = sc.nextInt();
		
		double tot = mid*0.2 + end*0.3 + homework*0.3 + (double)ott;
		int deadline = 70;
		int day = 20;
		int notOtt = day - ott; // 출석 안한 날짜
		
		String result = "";
		
		System.out.println("=========결과=========");
		System.out.printf("중간 고사 점수(20) : %.1f\n", mid * 0.2);
		System.out.printf("기말 고사 점수(30) : %.1f\n", end * 0.3);
		System.out.printf("과제 점수(30) : %.1f\n", homework * 0.3);
		System.out.printf("출석 점수(20) : %.1f\n", (double)ott);
		System.out.printf("총점 : %.1f\n", tot);
		
		if (tot >= deadline) { 
			if (notOtt <= ott*0.2) {
				result = "PASS";
				System.out.println(result);	
			} else { 
				result = "FAIL"; 
				System.out.printf("%s [출석 횟수 부족] (%d/%d)\n", result, ott, day);
			}
		} else if (notOtt >= ott*0.2) { 
			result = "FAIL";
			System.out.printf("%s [출석 횟수 부족] (%d/%d)\n", result, ott, day);
			System.out.printf("%s [점수 미달] (총점 %.1f)\n", result, tot);
		} else {
			result = "FAIL";
			System.out.printf("%s [점수 미달] (총점 %.1f)\n", result, tot);			
		}
		

		
	}
	
	public void practice10 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass / Fail");
		System.out.println();
		System.out.println("실행할 기능을 선택하세요. : ");
		
		int inputMenu = sc.nextInt();
		
		switch(inputMenu) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		case 10:
			practice10();
			break;
		default :
			System.out.println("없는 메뉴입니다.");
			return;
		}
	}
		
		
		
		
		
}
		
		
		
		
		
		
	
	
	


	
	


