// 런(실행) : 컴파일 + 구동
package com.kh.first;

// 1. 프로젝트 만들기 -> 하나의 프로젝트가 하나의 프로그럄
// 2. 패키지 만들기 -> 폴더와 같은 개념으로 파일을 분류해서 관리함
// 3. 클래스 만들기 -> 코드를 작성하기 위함

public class Helloworld {
	// 클래스 : 자바에서 모든 코드들은 반드시 클래스 안에 존재
	// 서로 관련 된 코드들을 그룹으로 나누어 별도의 클래스 구성
	// 클래스들이 모여서 하나의 JAVA 어플리케이션 구성

	public static void main(String[] args) {
		// 메소드 :  클래스의 기능(똥작)에 해당하는 구현 부분으로
		// 해당 메소드 호출 시 메소드의 블럭({})에 해당하는 부분을 실행
		
		// 항상 프로그램 시작 시 main 메소드에서 시작
		// 프로그램을 실행 시키기 위해 필요한 특수 메소드
		// 하나의 JAVA 어플르케이션에는 main 메소드를 포함한 클래스가
		// 반드시 하나는 있어야 함
		System.out.println("Hello, World!");
		
		System.out.print("안녕하세요, ");
		System.out.println("여러분~!");
		
	}

}
