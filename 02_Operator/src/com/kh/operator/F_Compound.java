package com.kh.operator;

public class F_Compound {
	// 복합 대입 연산자 : 산술 연산자와 대입 연산자를 함께 사용하는 연산자
	// 연산 속도가 훨씬 빠르므로 사용을 권장함
	
	public void method1() {
		
		int num = 12;
		
		// num을 3 증가시키기
		// num = num + 3;
		num += 3; // 15
		
		// num을 5 감소 시키기
		num -= 5; // 10
		
		// num을 6배 증가
		num *= 6; // 60
		
		// num을 2배 감소
		num /= 2; // 30
		
		// num을 4로 나누었을 때 나머지
		num %= 4; // 2
		
		System.out.println("num : " + num);
		
		
		
	}

}
