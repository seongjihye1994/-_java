package com.kh.run;

//import com.kh.first.A_MethodPrinter; // 외부의 클래스를 사용하고자 할 때 import 구문 작성

public class RunA {

	public static void main(String[] args) {
		
		// 다른 클래스에 있는 메소드를 메인메소드에서 실행하려면? 
		
		// 1. 실행할 메소드가 있는 클래스를 생성 + 임포트
		//     클래스명 변수 = new 클래스명();
		
		//A_MethodPrinter a = new A_MethodPrinter(); // 1) 임포트를 할 떄
		
		com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter(); // 2) 임포트를 하지 않을 때
		
		// 2. 메소드 실행(호출)
		a.methodA(); // 변수명.메소드()
		a.methodB();
		a.methodC();
		
		

	}

}
