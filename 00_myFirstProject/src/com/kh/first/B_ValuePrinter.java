package com.kh.first;

public class B_ValuePrinter {
	// * 명명규칙
	// 1. 패키지 -> 소문자러 시작
	// 2. 클래스 -> 대문자로 시작
	// 3. 메소드 -> 소문자로 시작
	
	// 여러개의 단어가 있을 땐, 각 단어의 앞자리는 대문자로 시작 -> 카멜 표기법
	// Valueprinter -> ValuePrinter
	
	public void printValue1() {
		// 여러가지 형태의 값을 출력하는 기능을 하는 메소드
		
		// 1. 숫자 출력
		System.out.println(123); // 정수
		System.out.println(1.23); // 실수
		
		// 2. 단일문자 출력
		System.out.println('a'); // 단일문자는 ''(싱글 쿼테이션) 안에, 문장은 "" 안에
		System.out.println('b');
		//System.out.println('ab'); // ''안에 단일문자가 아니면 에러!
		
		// 3. 문자열(문장)출력 (문장은 "" 안에 더블 쿼테이션)
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		// 4. 내부에서 연산 가능
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // 컴퓨터는 이진수밖에 표현할 수 없으므로, 실수 값 연산은 불완전해서 오차가 생길 수 있음
		
		// 5. 단일문자 + 숫자의 연산
		System.out.println('a' + 1); // a는 아스키코드에서 97
		System.out.println('b' + 1); // b는 아스키코드에서 98
		
		// 6. 문자열("")과 숫자의 합? -> 문자열 합치기
		System.out.println("안녕하세요" + 1);
		System.out.println("반갑습니다" + 1);
		
	}
	
	public void printValue2() {
		// 문자열과 숫자의 '+' 연산
		System.out.println(9 + 9); // 18
		System.out.println(9 + "9"); // 99
		System.out.println("9" + 9); // 99
		System.out.println(9 + 9 + "9"); // 189
		System.out.println(9 + "9" + 9); // 999
		System.out.println("9" + 9 + 9); // 999 // 문자 9랑 중간 숫자가 먼저 계산되니까 99(문자열)에서 다시 9를 더하니까 999
		System.out.println("9" + (9 + 9)); // 918
	}
	
	
	
	
	
	
	
}
