package com.kh.chap01_exception.run;

import com.kh.chap01_exception.A_UnCheckedExceptionTest;
import com.kh.chap01_exception.controller.B_CheckedExceptionTest;

public class Run {

	public static void main(String[] args) /*throws IOException*/{
	
		A_UnCheckedExceptionTest a = new A_UnCheckedExceptionTest();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
		
		B_CheckedExceptionTest b = new B_CheckedExceptionTest();
		b.method1();

	}

}
