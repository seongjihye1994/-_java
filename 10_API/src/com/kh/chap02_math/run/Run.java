package com.kh.chap02_math.run;

public class Run {

	public static void main(String[] args) {
		
		// Math 클래스를 보면 피르는 모두 상수 필드, 메소드는 모두 static
		
		// static --> 프로그램 시작 할 때 딱 한 번 static 영역(정적 메모리 영역)
		// 			    에 올리고 객체 생성해서 사용할 필요 없이 Math. 으로 접근해서 사용
		
		// Math는 심지어 생성자도 private -> 생성할 필요 없으므로 생성하지 못하도록
		
		// 상수 필드
		System.out.println("파이 : " + Math.PI); // 파이 : 3.141592653589793
	
		// 절대값 -> abs
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1)); // 절대값 : 10
		
		// 올림 -> ceil
		double num2 = 4.349;
		System.out.println("올림 : " + Math.ceil(num2)); // 올림 : 5.0

		// 반올림 -> round
		System.out.println("반올림 : " + Math.round(num2)); // 반올림 : 4

		// 버림 -> floor
		System.out.println("버림 : " + Math.floor(num2)); // 버림 : 4.0
		
		// 재곱근(루트) -> sqrt
		System.out.println("제곱근 : " + Math.sqrt(4)); // 제곱근 : 2.0
		
		// 제곱 -> pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10)); // 2의 10제곱 : 1024.0

	}

}
