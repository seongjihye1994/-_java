package com.kh.chap01_string.run;

import com.kh.chap01_string.controller.A_StringPoolTest;
import com.kh.chap01_string.controller.B_StringMethodTest;
import com.kh.chap01_string.controller.C_StringTokenizerTest;
import com.kh.chap01_string.controller.D_BuildrBufferTest;

public class Run {

	public static void main(String[] args) {
		// 1. API��?
		//  - Application Programming Interface : �������α׷� ���α׷��� �������̽�
		//	    �ü���� ���α׷��� �� �����ϴ� ����� ������ �� �ְ� ���� �������̽��� ����
		
		// 2. String�� Ư¡
		// - String Ŭ������ �Һ��� Ŭ�����̴�.
		// - ������ ���� �б⸸ ���� ��� �����ϰ� ���� �� �� �ִ�.

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
