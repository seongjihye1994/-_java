package com.kh.chap03_wrapper.controller;

public class B_WrapperStringTest {
	
	// 문자열 -> 기본 자료형
	// 기본 자료형 -> 문자열
	public void method1() {
		String str1 = "10";
		String str2 = "15.3";
		// 타입은 문자열, 실제 내가 다루고 싶은 값은 double형인 경우
		
		System.out.println(str1 + str2); // 1015.3
		
		// 1. String -> 기본자료형으로 바꾸기 위해
		// 해당  Wrapper클래스.parse~() 메소드 사용
		byte b = Byte.parseByte(str1);
		short s = Short.parseShort(str1);
		int i = Integer.parseInt(str1);
		long l = Long.parseLong(str1);
		// 만약 str2 (double)을 넣으면 err!
		// java.lang.NumberFormatException 발생
		
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		// 이건 문제 x
		
		boolean bool = Boolean.parseBoolean("false");
		// 만약 "true" / "false"이외의 다른 문자가 들어가면
		// 파싱할 수 없다는 의미로 false가 뜹니다. (오류 발생 x)
		System.out.println("bool : " + bool);
		
		// char는 파싱하지 못하고 charAt(인덱스)으로 문자 하나만 분리해냄
		char c = "abc".charAt(0);
		
		System.out.println(i + d); // 원하는 대로 정수 + 실수의 연산 수행
		// 25.3 (10 + 15.3)
		
		
		
		
		
		// 2. 기본 자료형 -> String
		// 해당 Wrapper클래스.valueOf().toString();
		String strB = Byte.valueOf(b).toString();
		// 10 byte를 String으로
		
		
		// **Wrapper 클래스가 아닌 String 클래스의 메소드를 통해 사용하면 더 간단
		String strB2 = String.valueOf(b);
		// 10 byte를 String으로
		// 가장 무난한 사용
		
		
		
		
		
		
	}

}
