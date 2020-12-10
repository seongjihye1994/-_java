package com.kh.part02.personMVC.run;

import com.kh.part02.personMVC.view.PersonMenu;

// 회원을 관리하는 프로그램을 MVC 패턴을 이용해
// 회운 추가, 전체 조회, 이름 검색, 평균 재산 조회 기능을 구현

// MVC 패턴이란?
// 디자인 패턴 중 하나로 MVC는 Model, View, Controller를 뜻함

// Model : data, 정보의 가공을 책임지는 파트
// vo -> value object (값을 가진 객체)

// View : 사용자 인터페이스, 데이터 입출력 파트

// Controller : 데이터와 사용자 인터페이스를 잇는 다리 역할


public class Run {

	public static void main(String[] args) {
		new PersonMenu().mainMenu();

		
	}

}
