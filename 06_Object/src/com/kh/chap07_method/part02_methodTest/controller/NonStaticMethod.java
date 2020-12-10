package com.kh.chap07_method.part02_methodTest.controller;

public class NonStaticMethod {
	// 매개변수 유무와 반환값 유무에 따른 구분
	
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환 값이 둘 다 없는 메소드입니다.");
	// return; // 모든 메소드에 생략 되어 있음(JVM이 자동 생성)
	}
	
	// 2. 매개변수 없고 반환 값 있는 메소드
	public String method2() {
		String str = "매개변수 없고 반환 값 있는 메소드입니다."; 
		return str;
	}
	
	// 3. 매개변수 있고 반환 값이 없는 메소드
	public void method(int num1, int num2) {
		// 이 메소드를 호출하는 곳에서 잔달한 전달 값을 받기 위해 선언하는 것이 매개변수
		System.out.println(num1 - num2);
	}
	
	// 4. 매개변수 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	
	
	
	
	

}
