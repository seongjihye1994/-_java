package com.kh.chap03.branch;

public class B_Continue {
	// continue : 반복문 안에서만 사용 가능하며
	// continue를 만나게 되면 아래의 내용을 실행하지 않고
	// 가장 가까운 반복문의, 처음으로 (=for문의 증감식, while문의 조건식) 돌아가라는 의미
	
	public void method1() {
		// 1부터 10까지 홀수 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) continue;
			System.out.print(i + " ");
		} 
	}
	
	public void method2() {
		// 1부터 100까지의 정수들의 합 출력
		// 단, 4의 배수는 빼고 계산
		int sum = 0;
		
		for (int i = 1; i < 101; i++) {
			if (i % 4 == 0) continue;
			sum += i;
		} System.out.printf("1부터 100까지의 합(4의 배수 제외) : %d\n", sum);
	}
	
	public void method3() {
		// 2~9단까지의 구구단 출력
		// 단, 4의 배수의 단은 빼고 출력
		for (int dan = 2; dan < 10; dan++) {
			if (dan % 4 == 0) continue;
			for (int gugu = 1; gugu < 10; gugu++) {
				System.out.printf("%d X %d = %d\n", dan, gugu, dan * gugu);
			}
		}
	}
	
	public void method4() {
		// 2 ~ 9단까지의 구구단 출력
		// 단, 곱하는 수에서 짝수는 빼고 출력
		
		for (int dan = 2; dan < 10; dan++) {
			for (int gugu = 1; gugu < 10; gugu++) {
				if (gugu % 2 == 0) continue;
				System.out.printf("%d X %d = %d\n", dan, gugu, dan * gugu);
			}
		}
	}

}
