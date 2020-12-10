package com.kh.chap02.loop;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class A_For {
	// 반복문 : 프로그램의 수행 흐름을 제어하는 제어문 중에 하나로
	// 실행 코드를 반복적으로 수행시켜줌
	// 크게 for문과 while문 두 중류로 나뉨
	
	// for (초기식; 조건식; 증감식) {
	// }
	
	public void method1() {
		// 안녕하세요를 10번 출력
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요!");
		}
	}
	
	public void method2 () {
		// 1부터 5까지 출력
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3 () {
		// 5부터 1까지 출력
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 1부터 10 사이의 홀수 출력
		// 1 3 5 7 9
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		
		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i + " "); // 조건식에는 ++. -- 외에도 들어갈 수 있다.
		}
		
		System.out.println(); // 줄개행
		
	}
	
	public void method5() {
		// 1부터 10까지 정수의 합계
		// 합계를 기록할 변수
		
		int sum = 0;
		
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 누적합 : " + sum);
	}
	
	
	public void method6() {
		// 1부터 사용자가 키보드로 입력한 수까지의 합계
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
		} System.out.println("1부터 " + input + "까지의 누적합 : " + sum);

	
	}
	
	public void method7() {
		// 구구단 2단 출력하기
		// 2*1 = 2
		// 2*2 = 4
		// 2*3 = 6
		// 2*4 = 8
		// 2*5 = 10...
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.printf("\n=== %d단 ===\n", dan);
			for (int gugu = 1; gugu < 10; gugu++) {
				System.out.printf("%d X %d = %d\n", dan, gugu, gugu * dan);
			} 
		} System.out.println();

	}
	
	public void method8 () {
		// 1부터 어떤 랜덤 값(1부터 10사이의 랜덤 값)까지의 합계 구하기
		// java.lang.Math 클래스에서 제공하는 random() 메소드
		// 사용해서 랜덤 값 발생 시킬 수 있음
		// java.lang 패키지는 iport할 필요가 없음
		// -> 컴파일러에 의해 import java.lang.*;이 생성됨
		
		// Math.random() -> 0.0 ~ 0.99999... 사이의 랜덤 값 발생
		// int random = Math.random();
		
		// 0.0 * 10 <= random < 1 * 10; -> 원하는 범위의 숫자를 곱한다.
		// 0 <= random < 10
		// 0 + 1 <= random < 10 + 1 -> 원하는 시작 값에 맞추기 위해 더한다.
		// 1.0 <= random < 11.0 -> int로 형변환
		// 
		int random = (int) (Math.random() * 10) + 1;
		System.out.println("random : " + random);
		
		// 1부터 random값 까지의 정수들의 합계
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		} System.out.printf("%d부터 %d까지의 합 : %d\n", 1, random, sum);
		
	}
	
	public void method9() {
		// 랜덤 구구단 출력
		// 2부터 9까지 랜덤 값을 random변수에 담고
		int random = (int)(Math.random() * 8) + 2; // 2~9는 총 8개의 숫자
		
		// random 단 출력
		System.out.printf("=== %d단 ===\n", random);
		// 반복문
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", random, i, random * i);
		}
	}
	
	public void method10( ) {
		// 사용자에게 두 개의 정수 값 입력 받아
		// 작은 수부터 큰 수까지의 합계 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		// 작은 값을 먼저 입력하면 상관이 없지만, 큰 수를 먼저 입력할 수 있기 때문에
		int min = 0; // 입력 된 정수 중 작은 값을 저장할 변수
		int max = 0; // 입력 된 정수 중 큰 값을 저장할 변수를 둔다.
		
		if (num1 > num2) { // 첫번째 수가 두번째 수보다 클 때
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		} for (int i = min; i <= max; i++) {
			sum += i;
		} System.out.printf("%d부터 %d까지의 합 : %d\n", min, max, sum);
	
	
	}
	
	public void method12() {
		// 1부터 5까지 출력 되는 문장 3줄 출력
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.printf("%d ", j);
			} System.out.println();
		}
	}
	
	public void method13() {
		// 0시 0분 ~ 23시 59분 출력
		
		// 시 -> 0시부터 23시까지 증가
		// 분 -> 0분부터 59분까지 증가
		
		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				System.out.printf("%d시 %d분\n", hour, min);
			} System.out.println();
		}
	}
	
	public void method14() {
		// 별찍기
		
		// ****
		// ****
		// ****
		// ****
		// ****
		
		for (int i = 0; i < 5; i++) { // 총 5번 반복
			for (int j = 0; j < 4; j++) { // 총 4번 반복
				System.out.print("* "); 
			} System.out.println();
		}
	}
	
	public void method15() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		// i가 1일때 j도 1, i가 2일때 j도 2... (if 조건문)
		
		char n = '*';
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) System.out.print(i);
				else System.out.print(n);
			} System.out.println();
		} 
	
	}
	
	
	
}


