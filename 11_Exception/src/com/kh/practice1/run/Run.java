package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.controller.NumberRangerExceptionTest;
import com.kh.practice1.exception.NumberRangeException;

public class Run {
	// main()에서 임의의 정수 2개를 입력 받아
	// checkDouble(int, int) : boolean
	// 메소드의 매개변수로 하여 호출
	
	// controller의 메소드 안에서는
	// 첫번째 수가 두번째 수의 배수인지 확인하여 배수가 맞으면 true,
	// 아니면 false 리턴
	// 단, 전달 된 두 수가 1~100 사이의 값이 아니라면  NumberRangeException 발생
	// (에러 메세지 : 1~100 사이의 값이 아닙니다) 시키고 main()으로 
	// 넘겨 main()에서 try~catch 구문 작성
	
	public static void main(String[] args) {
		
		NumberRangerExceptionTest nret = new NumberRangerExceptionTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		
		try {
			boolean result = nret.checkDouble(num1, num2);
			System.out.println("첫번쨰 수는 두 번째 수의 배수가 맞나요? " + result);
		} catch (NumberRangeException e) {
			e.printStackTrace();
		} System.out.printf("%d, %d", num1, num2);
		
		
	}


}
