package com.kh.chap07_method.part02_methodTest.run;

import com.kh.chap07_method.part02_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method.part02_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		
		NonStaticMethod test = new NonStaticMethod();
		// 1. 매개변수와 반환 값이 없는 메소드 호출
		test.method1();
		
		// 2. 매개변수없고 반환 값이 있는 메소드 호출
		// 그 반환형과 일치하는 자료형의 변수에 메소드 수행 후의 반환 값을 달아서 사용
		String str = test.method2();
		System.out.println(str);
//		System.out.println(test.method2());
		
		// 3. 매개변수 있고 반환 값이 없는 메소드
		test.method(10, 5);
		// **반드시 전달 값은 매개변수의 타입과 순서와 갯수가 일치하는 값을 넘겨 줘야 함

		// 4. 매개변수 있고 반환값도 있는 메소드
		int sum = test.method4(10, 20);
		System.out.println(sum);
		
		System.out.println("아래부터는 static 메소드");
		
		// 1. 반환 x, 매개변수 x static 메소드
		StaticMethod.method1(); 
		
		// 2. 반환 0, 매개변수 x static 메소드
		System.out.println("10과 20의 합은" + StaticMethod.method2() + "입니다.");
		
		// 3. 반환 x, 매개변수 o
		StaticMethod.method3("우별림");
		
		// 4. 반환 o, 매개변수 o
		System.out.println(StaticMethod.method4("우별림"));
		
		
		
		
	}

}
