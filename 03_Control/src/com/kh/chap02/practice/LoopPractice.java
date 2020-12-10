package com.kh.chap02.practice;

import java.util.Random;
import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 정수 입력 : ");
		int input = sc.nextInt();
		
		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			} 			
		} else System.out.println("잘못 입력하였습니다.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while(true) {
			System.out.print("1 이상의 정수 입력 : ");
			int input = sc.nextInt();
			
			if(input <= 0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			} while(i <= input) {
			 	System.out.print(i + " ");
			 	i++;
			} System.out.println();
			break;
		}
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 정수 입력 : ");
		int input = sc.nextInt();
		
		if (input <= 0) {
			System.out.println("잘못 입력하셨습니다."); return;
		} for (int i = input; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 정수 입력 : ");
			int input = sc.nextInt();
			int i = input;
			
			if(input <= 0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			} while(i >= 1) {
			 	System.out.print(i + " ");
			 	i--;
			} System.out.println();
			break;
		}
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
			System.out.printf("%d + ", i);
		} System.out.printf("%d", sum);
		System.out.printf(" = %d\n", sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int input2 = sc.nextInt();
		int min = 0;
		int max = 0;
		
		if (input1 <= 0 || input2 <= 0) {
			System.out.println("1이상의 숫자만을 입력해주세요."); return;
		} else if (input1 > input2) {
			min = input2; max = input1;
		} else {
			min = input1; max = input2;
		} for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		} 
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int max = 0;
		
		while(true) {
			System.out.print("첫 번째 정수 : ");
			int input1 = sc.nextInt();
			System.out.print("두 번째 정수 : ");
			int input2 = sc.nextInt();
			
			if (input1 <= 0 || input2 <= 0) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
				continue;
			} if (input1 > input2) { // 1번쨰 수가 2번쨰 수보다 크다면
				min = input2; max = input1;
			} else {
				min = input1; max = input2;
			} for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			} System.out.println();	
		}
		
		
		
	}
	
	public void practice8 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		System.out.printf("=== %d단 ===\n", input);
		
		for (int gugu = 1; gugu < 10; gugu++) {
			System.out.printf("%d X %d = %d\n", input, gugu, input * gugu);
		}
		
		
	}
	
	public void practice9 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int dan = sc.nextInt();
		
		if (!(dan > 1 && dan < 10)) {
			System.out.println("2~9사이의 숫자만 입력해주세요.");
			return;
		}
		
		for (int i = dan; i < 10; i++) {
			System.out.printf("=== %d단 ===\n", i);
			for (int gugu = 1; gugu < 10; gugu++) {
				System.out.printf("%d X %d = %d\n", i, gugu, i * gugu);
			} System.out.println();
			
		}
		
	}
	public void practice10 () {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int dan = sc.nextInt();
			
			if (!(dan > 1 && dan < 10)) {
				System.out.println("2~9사이의 숫자만 입력해주세요.");
				continue;
			}
			
			for (int i = dan; i < 10; i++) {
				System.out.printf("=== %d단 ===\n", i);
				for (int gugu = 1; gugu < 10; gugu++) {
					System.out.printf("%d X %d = %d\n", i, gugu, i * gugu);
				} System.out.println();
			} break;	
		}

	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 입력 : ");
		int num = sc.nextInt();
		System.out.print("공차 입력 : ");
		int gap = sc.nextInt();
		
		int tot = 0;
		
		for (int i = num; tot < 10; i += gap) {
			System.out.print(i + " ");
			tot++;
		}
			
		
		
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");				
			} System.out.println();
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = input; i > 0; i--) {			
			for (int j = i; j > 0; j--) {
				System.out.print("*");	
			} System.out.println();
		}
		
	
	}
	
	public void practice14() {		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			if (op.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다."); break;
			} System.out.print("정수 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 2 입력 : ");
			int num2 = sc.nextInt();
			
			 if (num2 == 0 && op.equals("/")) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			} else if (!(op.equals("+")) &&
					!(op.equals("-")) && 
					!(op.equals("/")) &&
					!(op.equals("*"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			} 
			
			switch(op) {
			case "+" :
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);break;
			case "-" :
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);break;
			case "/" :
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);break;
			case "*" :
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);break;
			}

		}
		
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int i;
		
		if (input <= 2) {
			System.out.println("잘못 입력하셨습니다."); return;
		} for (i = 2; i < input; i++) {
			if (input % i == 0) {
				System.out.println("소수가 아닙니다."); 
				break;
			}
		} if (i == input) System.out.println("소수입니다.");
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			int i;
			
			if (input <= 2) {
				System.out.println("잘못 입력하셨습니다."); continue;
			} for (i = 2; i < input; i++) {
				if (input % i == 0) {
					System.out.println("소수가 아닙니다."); 
					break;
				}
			} if (i == input) System.out.println("소수입니다.");
			break;
			
		}
		
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		int j;
		
		for (int i = 2; i <= input; i++) { 
			for (j = 2; j <= i; j++) {
				if (i % j == 0) break;
				} if (i == j) {
					count++;
					System.out.print(j + " ");
				}
			} System.out.println();
		System.out.printf("2부터 %d까지의 소수 갯수는 %d개입니다.\n", input, count);
		
		
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요. : ");
		int input = sc.nextInt();
		int count = 0;
		int i;
		
		for (i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if (i % 2 == i % 3) count++;
			}
		} System.out.println();
		System.out.printf("count : %d\n", count);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	
		for (int i = 1;i < input; i++){
			for (int j = input - 1; j > 0; j--){
				if (i < j) System.out.print(" ");
				else System.out.print("*");
			} System.out.println();
		}
		
		
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		} System.out.println();
		
		for (int i = 0; i < input - 1; i++) {
			for (int j = input - i - 1; j > 0; j--) {
				System.out.print("*");
			} System.out.println();
		}
		
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			// 공백 먼저 출력
			for (int j = 0; j < input - i - 1; j++) {
				System.out.print(" ");
			}
			// 별 출력
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println(); // 개행
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (i == 0 || i == input - 1) System.out.print("*");
				else {
					if (j == 0 || j == input - 1) System.out.print("*");
					else {
						if (j == 0 || j == input - 1) System.out.print("*");
						else System.out.print(" ");
					}
				}
			} System.out.println();
		}
		
		
	}
		
	public void practice23() {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		do {
			System.out.print("정수 입력 : ");
			int inputNum = sc.nextInt();
			int rn1 = rn.nextInt(6) + 1;
			int rn2 = rn.nextInt(6) + 1;
			System.out.println(rn1 + " " + rn2);
			
			if ((rn1 + rn2 == inputNum)) {
				System.out.println("맞췄습니다.");
			} else System.out.println("틀렸습니다.");
			System.out.print("계속하시겠습니까? : (y/n)");
			String goPlay = sc.next();
			if (goPlay.equalsIgnoreCase("y")) continue;
			else {
				flag = false;
				System.out.println("프로그램을 종료합니다."); break;
			}
		} while(flag == false) ;

	}
	
	

}
