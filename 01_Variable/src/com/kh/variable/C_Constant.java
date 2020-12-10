package com.kh.variable;

public class C_Constant {

	public void finalConstant() {
		int age = 20;
		final int AGE = 20; // 상수 (final 자료형 대문자변수) 는 값 초기화 후 변경 불가
		
		// 변수 값 변경
		age = 30;
		// AGE = 30; // 상수인 지역변수는 값 변경이 불가능하다.
		
	}
}
