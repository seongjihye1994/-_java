package com.kh.operator;

public class B_InDecrease { // 증감연산자 (전위 후위)
	
	public void method1() {
		// 증감 연산자
		// ++ : 1 증가 시키는 연산자
		// -- : 1 감소 시키는 연산자
		// 전위연산, 후위연산 구분
		
		// 전위연산
		int a = 10;
		int b = ++a; // 전위연산(라인이 바뀌기 전, 대입되기 전 먼저 연산됨)
		
		System.out.println("a : " + a + "b : " + b);
		// a => 11, b => 11
		
		// 후위연산
		int c = 10;
		int d = c++; // 후위연산(라인이 바뀐 후, 먼저 연산이 된 후 대입됨)
		
		System.out.println("c : " + c + "d : " + d);
		// c => 11, d => 10
		
		int num1 = 20;
		int result = num1++ * 3;
		// 후위연산은 다른 연산이 일어난 뒤 실행 된다.
		// 20 * 3 연산 후 대입, result => 60, 이후 후위연산 ++ num1 => 21
		
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
		
	}

}
