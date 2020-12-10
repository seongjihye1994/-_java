package com.kh.chap01_exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedExceptionTest {

	// CheckedException은 반드시 예외 처리를 해주어야 하는 예외
	// -> 조건문이나 소스 코드 수정으로는 해결할 수 없음
	// -> 주로 IOException 처리
	
	public void method1() /*throws IOException*/ {
		method2();
	}
	
	public void method2() /*throws IOException*/ {
		// IO의 개념을 아직 모르므로 간단하게 테스트
		// Scanner와 같이 키보드로 값을 입력 받는 용도로
		// java.io.BufferedReader 객체 생성(문자열만 입력 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열을 입력 : ");
		
		
		// 입출력(IO)은 "스트링"을 통해 외부 자원과 이루어짐
		// ex. 파일 입출력 시 해당 경로에 읽어올 파일이 없으면 읽어올 수 없으므로
		// IOException 의 후손인 FileNoFoundException이 발생함
		
		try {
			String str = br.readLine(); // 문자열 받아오기
			System.out.println("입력 받은 문자열 : " + str);
		} catch (IOException e) {
			e.printStackTrace(); // 문제발생 시 빨간줄로 에러 뜨게함
		} finally {
			// 사용 후 스트림을 닫아줘야 하므로 finally 블럭 안에 스트림을 닫는 구문을 작성함
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// br.readLine();에 에러가 뜨는 이유는? CheckedException은 무조건 에러처리를 해 줘야 하는 구문으로
		// 에러처리가 되지 않았기 때문에 에러가 뜸!
		
		// 에러 처리 2가지 방법
		// 1. throws : 나를 호출한 메소드에게 예외 처리 위임
		// 원하는 위치에 예외 처리를 할 수 있도록 함
		// main 메소드에서도 처리되지 않는 경우 비정상 종료
		
		// 2. try ~ catch
		// (1) try {} : 예외 발생 가능성 있는 구문 작성
		// (2) catch(예외클래스 매개변수) {} : 예외가 발생되는 경우 처리해야 하는 구문 작성
		// (3) finally {} : 예외 발생 여부와 관계 없이 무조건 처리해야 하는 로직 기술
		
		
	}
}


// Exception 상속도 그려보기
// Throwable <- Error
//			 <- Exception <- RuntileException : 프로그램 실행 중 에러 / 컴파일 에러 x / 예외처리 선택사항 (if문 권고) => UncheckedException
//						  <- 그 외 (IOException) : 문법적 오류 / 컴파일 에러 o / 예외처리 필수사항 => CheckedException




