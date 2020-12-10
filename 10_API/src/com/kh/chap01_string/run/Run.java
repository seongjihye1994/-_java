package com.kh.chap01_string.run;

import com.kh.chap01_string.controller.A_StringPoolTest;
import com.kh.chap01_string.controller.B_StringMethodTest;
import com.kh.chap01_string.controller.C_StringTokenizerTest;
import com.kh.chap01_string.controller.D_BuildrBufferTest;

public class Run {

	public static void main(String[] args) {
		// 1. API란?
		//  - Application Programming Interface : 응용프로그램 프로그래밍 인터페이스
		//	    운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻함
		
		// 2. String의 특징
		// - String 클래스는 불변의 클래스이다.
		// - 변경은 적고 읽기만 많은 경우 안전하게 공유 될 수 있다.

		A_StringPoolTest a = new A_StringPoolTest();
//		a.method1();
//		a.method2();
		
		B_StringMethodTest b = new B_StringMethodTest();
//		b.method1();
		
		C_StringTokenizerTest c = new C_StringTokenizerTest();
//		c.method1();
		
		D_BuildrBufferTest d = new D_BuildrBufferTest();
//		d.method1();
//		d.method2();
		d.method3();
	}

}
