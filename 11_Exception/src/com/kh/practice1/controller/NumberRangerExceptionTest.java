package com.kh.practice1.controller;

import com.kh.practice1.exception.NumberRangeException;

public class NumberRangerExceptionTest {
	
	// controller의 메소드 안에서는
	// 첫번째 수가 두번째 수의 배수인지 확인하여 배수가 맞으면 true,
	// 아니면 false 리턴
	// 단, 전달 된 두 수가 1~100 사이의 값이 아니라면  NumberRangeException 발생
	// (에러 메세지 : 1~100 사이의 값이 아닙니다) 시키고 main()으로 넘겨 main()에ㅓㅅ try~catch 구문 작성
		
	public boolean checkDouble(int num1, int num2) throws NumberRangeException {
		if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
			 throw new NumberRangeException("반드시 1~100사이의 정수를 입력해야 합니다.");
		} else {
			boolean result = (num1 % num2 == 0) ? true : false;
			return result;
		}
	}  

}
