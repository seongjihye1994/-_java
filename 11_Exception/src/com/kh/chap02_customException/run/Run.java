package com.kh.chap02_customException.run;

import com.kh.chap02_customException.controller.UserExceptionTest;
import com.kh.chap02_customException.exception.UserException;

public class Run {
	
	// 사용자 정의 Exception
	// 사용자가 직접 Exception을 만들 수 있음
	// 논리 에러 : 프로그램의 의도대로 흘러가지 않을 경우 발생하는 에러
	// 즉, 자바에서 제공하는 예외 클래스만으로 처리할 수 없는 예외가
	// 있을 경우 사용자가 만들어서 사용

	public static void main(String[] args) {
		
		UserExceptionTest uet = new UserExceptionTest();
		
		try {
			uet.method();
		} catch (UserException e) {
			e.printStackTrace();
		}
		

	}

}
