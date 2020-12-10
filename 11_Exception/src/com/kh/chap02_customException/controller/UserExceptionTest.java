package com.kh.chap02_customException.controller;

import java.util.Scanner;

import com.kh.chap02_customException.exception.UserException;

public class UserExceptionTest {
	
	public void method() throws UserException {
		// 소문자만 입력 받고 소문자가 아닌 입력이 있을 경우 UserException 발생시키기
		Scanner sc = new Scanner(System.in);
		System.out.print("영문 입력(반드시 소문자만) : ");
		String input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < 'a' || input.charAt(i) > 'z') { // 소문자 범위 벗어난다면
				throw new UserException(input.charAt(i) + "는 소문자가 아닙니다.");
			} // throws : 호출한 메소드로 에러 떠넘김(던짐)
		} // throw new ~Exception : ~ 에러 발생시킴
		System.out.println("input : " + input);
	}

}
