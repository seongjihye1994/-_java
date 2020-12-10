package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {

	public static void main(String[] args) {
		
		B_ValuePrinter b = new B_ValuePrinter(); // B_ValuePrinter 클래스를 main(다른클래스)에서 사용(임포트 후)
		//com.kh.first.B_ValuePrinter = new com.kh.first.B_ValuePrinter(); // 임포트를 하지 않으면 임포트 이름을 기재해서 사용할 수 도 있음
		
		b.printValue1(); // 메소드 호출(사용)
		
		b.printValue2();

	}

}

