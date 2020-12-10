package com.kh.practice2.controller;

import javax.naming.NamingException;

public class NamingTest {
	
	String[] reservedWord = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "if",
			"goto", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
			"private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
			"throw", "throws", "transient", "true", "try", "void", "volatile", "while"};
	
	char[] SpecialWord = {'!', '@', '#', '%', '^', '&', '*', 
			'(', ')', ':', ',', '.', '/', '|', ' ', 
			'~', '`', '-', '+', '[', ']', '{', '}', 
			'?', '<', '>', '='};
	
	char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	public NamingTest() {}
	
//	받은 문자열이 예약어와 같은
//	지 확인. 명명 규칙에 어긋나
//	면 "변수 명명 규칙에 어긋납
//	니다.(예약어 사용 불가능)"
//	이라는 예외를 띄운다.
	public boolean isReservedWord(String user) throws NamingException {
		for (int i = 0; i < reservedWord.length; i++) {
			if (user.equals(reservedWord[i])) {
				throw new NamingException("변수 명명 규칙에 어긋납니다. (예약어 사용 불가능)");
			} 
		}
		return true;
	}
	
	
//	받은 문자열에 변수 명명에
//	사용 가능한 문자(특수문자
//	포함)가 들어있는지 확인. 명
//	명 규칙에 어긋나면 "변수 명
//	명 규칙에 어긋납니다.(영문자
//	와 '_', '$', 숫자 사용 가능)"
//	이라는 예외를 띄운다
	public boolean isSpecialWord(String user) throws NamingException {
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == (SpecialWord[i])) {
				throw new NamingException("변수 명명 규칙에 어긋납니다. (영문자와 '_', '$', 숫자 사용 가능)");
			} 
		} 
		return true;
	}
	
//	받은 문자열의 맨 앞 글자가
//	숫자인지 확인. 명명 규칙에
//	어긋나면 “변수 명명 규칙에
//	어긋납니다.(맨 앞 숫자 불가
//	능)” 이라는 예외를 띄운다.	
	public boolean isNumFirst(String user) throws NamingException {
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == nums[i]) {
				throw new NamingException("변수 명명 규칙에 어긋납니다. (맨 앞 숫자 불가능)");
			} 
		}
		return true;
	}

}
