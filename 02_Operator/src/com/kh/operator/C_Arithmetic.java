package com.kh.operator;

public class C_Arithmetic {
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : " + (num1 + num2)); // 괄호가 없으면 103
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + num1 * num2); // 곱하기와 나누기는 더하기빼기보다 우선순위로 연산되니까 괄호 필요없음
		System.out.println("num1 / num2 : " + num1 / num2); // int와 int의 나누기의 몫 : 3
		System.out.println("num1 % num2 : " + num1 % num2); // 나누기의 나머지 -> 1
	
		// %(모듈러)는 이후 조건문에서 짝홀 판별 등에 많이 사용
		// 값 % 2 = 0 또는 1이라는 결과만 있음
		// 따라서 결과 값이 0이면 값이 짝수, 결과 값이 1이면 값이 홀수
		
		// 또한 배수 판별에도 자주 사용
		// 5의 배수인가?
		// 값 % 5 => 결과 값이 0이면 5의 배수
	}
	

}
